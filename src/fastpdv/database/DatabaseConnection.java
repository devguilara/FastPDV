package fastpdv.database;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fastpdv
 */
public class DatabaseConnection {
    // Instância única da conexão (Singleton), garantida pela palavra-chave 'volatile'
    private static volatile DatabaseConnection instance;

    // Objeto de conexão com o banco de dados
    private Connection connection;

    // URL de conexão com o banco de dados
    private String url;

    // Propriedades de autenticação e configuração
    private Properties properties;

    // Logger para registrar eventos e erros
    private static final Logger logger = Logger.getLogger(DatabaseConnection.class.getName());

    // Construtor privado para implementar o padrão Singleton e evitar múltiplas instâncias
    private DatabaseConnection() {
        try (InputStream input = getClass().getResourceAsStream("/fastpdv/database.properties")) {

            // Valida se o arquivo de configuração está disponível
            if (input == null) {
                throw new RuntimeException("Arquivo database.properties não encontrado em /fastpdv/resources/");
            }

            // Carrega as configurações do banco de dados a partir do arquivo
            Properties config = new Properties();
            config.load(input);

            // Recupera a URL de conexão
            url = config.getProperty("db.url");

            // Inicializa as propriedades da conexão
            properties = new Properties();

            // Configura credenciais básicas de acesso ao banco
            properties.put("user", config.getProperty("db.user"));
            properties.put("password", config.getProperty("db.password"));

            // Configurações opcionais de segurança e fuso horário
            properties.put("useSSL", config.getProperty("db.useSSL", "false")); // Desativa SSL por padrão
            properties.put("serverTimezone", config.getProperty("db.serverTimezone", "UTC")); // Define UTC como padrão
            properties.put("allowPublicKeyRetrieval", config.getProperty("db.allowPublicKeyRetrieval", "true"));

            // Configurações para recuperação automática em caso de falha
            properties.put("autoReconnect", config.getProperty("db.autoReconnect", "true")); // Reconeção automática
            properties.put("maxReconnects", config.getProperty("db.maxReconnects", "3")); // Limita tentativas de reconexão

            // Estabelece a conexão com o banco de dados
            connection = DriverManager.getConnection(url, properties);
            logger.info("Conexão com o banco estabelecida com sucesso!");

        } catch (IOException | SQLException e) {
            // Registra erro crítico caso ocorra falha na conexão
            logger.log(Level.SEVERE, "Erro crítico na conexão: {0}", e.getMessage());
            throw new RuntimeException("Falha na inicialização do banco de dados", e);
        }
    }

    // Método para obter a instância única da conexão (Singleton com bloqueio duplo para segurança em ambientes multithread)
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    // Retorna a conexão ativa, reconectando se necessário
    public Connection getConnection() {
        try {
            // Verifica se a conexão está fechada ou nula antes de reutilizar
            if (connection == null || connection.isClosed()) {
                reconnect();
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Erro ao verificar conexão: {0}", e.getMessage());
        }
        return connection;
    }

    // Método privado para tentar uma nova conexão em caso de falha
    private void reconnect() throws SQLException {
        logger.info("Reconectando ao banco de dados...");
        connection = DriverManager.getConnection(url, properties);
    }

    // Fecha a conexão com o banco de dados e libera a instância
    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                logger.info("Conexão finalizada com sucesso");
            }
        } catch (SQLException e) {
            logger.log(Level.WARNING, "Erro ao fechar conexão: {0}", e.getMessage());
        } finally {
            // Garante a liberação da instância para uma nova conexão no futuro
            instance = null;
        }
    }
}

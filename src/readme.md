
# PDVSystem

## 📌 Sobre o Projeto
**PDVSystem** é um sistema de **Ponto de Venda (PDV)** desenvolvido em **Java** utilizando a IDE **NetBeans**. O projeto segue o padrão **MVC (Model-View-Controller)** para organizar melhor o código e facilitar manutenções futuras.

## 📂 Estrutura do Projeto
Abaixo está a organização das pastas e pacotes do sistema:

```
PDVSystem/
│-- src/
│   ├-- dev.fastpdv/
│   │   ├-- GUI/           # Interface Gráfica (View)
│   │   │   ├-- DashboardGUI.java
│   │   │   ├-- LoginGUI.java
│   │   │   ├-- VendaGUI.java
│   │   │   ├-- ClienteGUI.java
│   │   │   ├-- ProdutoGUI.java
│   │   │   ├-- CaixaGUI.java
│   │   │
│   │   ├-- controllers/   # Controladores (Controller)
│   │   │   ├-- VendaController.java
│   │   │   ├-- ClienteController.java
│   │   │   ├-- ProdutoController.java
│   │   │   ├-- CaixaController.java
│   │   │
│   │   ├-- models/        # Modelos de Dados (Model)
│   │   │   ├-- Venda.java
│   │   │   ├-- Cliente.java
│   │   │   ├-- Produto.java
│   │   │   ├-- Caixa.java
│   │   │
│   │   ├-- database/      # Conexão com Banco de Dados
│   │   │   ├-- DatabaseConnection.java
│   │   │
│   │   ├-- utils/         # Utilitários do sistema
│   │   │   ├-- Formatador.java
│   │   │   ├-- Validador.java
│-- lib/                   # Bibliotecas externas (caso use)
│-- resources/              # Arquivos de configuração
│-- README.md               # Documentação do projeto
```

## 🚀 Tecnologias Utilizadas
- **Java 21**
- **Swing** (Interface Gráfica)
- **MySQL / PostgreSQL** (Banco de Dados, opcional)
- **NetBeans** (IDE de desenvolvimento)
- **Padrão MVC** (Organização do código)

## 🔧 Configuração do Banco de Dados
Caso esteja usando um banco de dados, configure a classe **DatabaseConnection.java**:

## 📌 Funcionalidades Previstas
✅ Login de Usuário
✅ Interface Gráfica intuitiva
✅ Cadastro e gerenciamento de clientes, produtos e vendas
✅ Registro de movimentação de caixa
✅ Integração com banco de dados

## 🛠 Como Executar o Projeto
1. Clone o repositório:
   ```sh
   git clone https://github.com/seuusuario/PDVSystem.git
   ```
2. Abra o projeto no **NetBeans**
3. Execute a classe `LoginGUI.java` ou `DashboardGUI.java`

## 🤝 Contribuição
Sinta-se à vontade para contribuir com melhorias, enviando um Pull Request! 😃

## 📄 Licença
Este projeto está sob a licença MIT.


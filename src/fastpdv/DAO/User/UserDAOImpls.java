/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastpdv.DAO.User;

import fastpdv.models.User;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author devguilara
 */
public class UserDAOImpls implements UserDAO{
    private Map<Integer, User> userDatabase = new HashMap<>();
    
    @Override
    public void saveUser(User user){
        userDatabase.put(user.getId(), user);
        System.out.println("Usuário Salvo com sucesso" + user.getNome());
    }

    @Override
    public User getUserById(int userId) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void updateUser(User user) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteUser(int userId) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastpdv.controllers;

import fastpdv.DAO.User.UserDAO;
import fastpdv.models.User;

/**
 *
 * @author devguilara
 */
public class UserController {
    private UserDAO userDAO;
    
    //constructor
    public UserController(UserDAO userDAO){
        this.userDAO = userDAO;
    }
    
    public void saveUser(User user){
        userDAO.saveUser(user);
    }
    
    public User getUserById(int userId){
        return userDAO.getUserById(userId);
    }
    
    public void updateUser(User user){
        userDAO.updateUser(user);
    }
    
   public void deleteUser(int userId){
       userDAO.deleteUser(userId);
   }
   
}

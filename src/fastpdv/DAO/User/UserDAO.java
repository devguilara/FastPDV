/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastpdv.DAO.User;

import fastpdv.models.User;

/**
 *
 * @author devguilara
 */
public interface UserDAO {
   void saveUser(User user);
   User getUserById(int userId);
   void updateUser(User user);
   void deleteUser(int userId);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import models.User;

/**
 *
 * @author mac
 */
public interface IUser {
    User findById(int id);
    boolean deleteById(int id);
    List<User> getAllUsers();
    boolean update(int id, User user);
    public int save(User user, String url, String username, String password);
}

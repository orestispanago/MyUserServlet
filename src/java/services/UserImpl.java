/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.User;

/**
 *
 * @author mac
 */
public class UserImpl implements IUser {

    @Override
    public User findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> getAllUsers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(int id, User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int save(User user, String url, String username, String password) {
        try {
            String query = "INSERT INTO `users`(`first_name`,`last_name`,`telephone`,`email`) "
                    + "VALUES(" 
                    + "'" + user.getFirstName() + "',"
                    + "'" + user.getLastName()  + "'," 
                    + "'" + user.getTel()       + "'," 
                    + "'" + user.getEmail()     + "' "
                    + ");";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement st = connection.createStatement();
            int records = st.executeUpdate(query);
            st.close();
            connection.close();
            return records;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
}

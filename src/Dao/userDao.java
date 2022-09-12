/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author M. A. MUKTADEER
 */
public class userDao {

    public static void save(User user) {
        String query = "insert into user(name, email, mobailNumber, address, password,securityQuestion,answer, status) values('" + user.getName() + "','" + user.getEmail() + "','" + user.getMobileNumber() + "','" + user.getAddress() + "','" + user.getPassword() + "','" + user.getSecuryQuestion() + "','" + user.getAnswer() + "','false')";
        DbOpretions.setOrDeleteData(query, "Register Successfull. Wail for a Admin Approval!");
    }
    
    public static User login(String email, String Password) {
        User user = null;
        try {
            ResultSet rs = DbOpretions.getData("select * from user where email ='" + email + "' and password ='" + Password + "'");
            while (rs.next()) {
                user = new User();
                user.setStatus(rs.getString("status"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }
    
    public static User getSequrityQuestion(String email) {
        User user = null;
        try {
            ResultSet rs = DbOpretions.getData("select * from user where email = '" + email + "'");
            while (rs.next()) {
                user = new User();
                user.setSecuryQuestion(rs.getString("securityQuestion"));
                user.setAnswer(rs.getString("answer"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }
    
    public static void update(String email, String newPass){
        String query ="update user set password='"+ newPass+"' where email ='"+email+"'";
        DbOpretions.setOrDeleteData(query, "Password change Successfully");
    }
}

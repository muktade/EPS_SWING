/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

/**
 *
 * @author M. A. MUKTADEER
 */
public class DbOpretions {
    public static void setOrDeleteData(String Query, String msg){
        try {
            Connection con = ConnectionProvider.getConnectDatabase();
            Statement st = con.createStatement();
            st.executeUpdate(Query);
            if(!msg.equals("")){
                JOptionPane.showMessageDialog(null, msg);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex,"Message",JOptionPane.ERROR_MESSAGE);
            System.out.println(ex);
        }
    }
    
    public static ResultSet getData(String quary){
        try {
            Connection con = ConnectionProvider.getConnectDatabase();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(quary);
            return rs;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex,"Message",JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
    }
}

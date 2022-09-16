# EPS_SWING
Employee Payroll System JAVA SWING


#-----------------------------------------------#
#ADD JAR

frist add 
1:itextpdf-5.5.4.jar,
2:jdatepicker-1.3.4.jar,
3:rs2xml.jar,
4:sqlitejdbc-v056.jar,
5:mysql connection jar

#----------------------THEN-------------------#
#EDIT CONNECTION
change #ConnectionProvider.java which in Dao packeg

LIKE

#/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

/**
 *
 * @author M. A. MUKTADEER
 */
 
public class ConnectionProvider {

    Connection conn=null;
    public static Connection getConnectDatabase(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/eps","YOUR_HOST","YOUR_PASS");
//            JOptionPane.showMessageDialog(null, "Connection to database is successful");
      
            return conn;
           
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
//    public static void main(String[] args) {
//        getConnectDatabase();
//    }
    
}


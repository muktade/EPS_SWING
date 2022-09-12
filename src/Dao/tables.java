/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import javax.swing.JOptionPane;

/**
 *
 * @author M. A. MUKTADEER
 */
public class tables {

    public static void main(String[] args) {
        try {
            String useTable = "create table user(id int AUTO_INCREMENT primary key, name varchar(50), email varchar(100), mobailNumber varchar(20), address varchar(200), password varchar(200), securityQuestion varchar(200), answer varchar(200), status varchar(10), UNIQUE(email))";
            DbOpretions.setOrDeleteData(useTable, "User Table is Created");
            ///// category table
            String categoryTbl="create table category(id int AUTO_INCREMENT PRIMARY KEY, name varchar(150))";
            DbOpretions.setOrDeleteData(useTable, "Category Table is created");
            /////////product Table 
            String productTbl = "create table product(id int AUTO_INCREMENT primary key, name varchar(150), category varchar(150),price varchar(50))";
            DbOpretions.setOrDeleteData(productTbl, "Product Table is Created.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

}

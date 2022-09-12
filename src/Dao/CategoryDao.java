/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import DAO.DbOpretions;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Category;

/**
 *
 * @author M. A. MUKTADEER
 */
public class CategoryDao {
    public static void save(Category category){
        String query ="insert into category (name) values ( '"+category.getCategory()+"')";
        DbOpretions.setOrDeleteData(query, "Category Save Successfully.");
    }
    
    public static ArrayList<Category> getllRecords(){
        ArrayList<Category> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOpretions.getData("select * from category");
            while(rs.next()){
                Category category = new Category();
                category.setId(rs.getInt("id"));
                category.setCategory(rs.getString("name"));
                arrayList.add(category);                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }return arrayList;
    }
    
    public static void delete(String id){
        String query ="delete from category where id='"+id+"'";
        DbOpretions.setOrDeleteData(query, "Category delete successfully.");
    }
}

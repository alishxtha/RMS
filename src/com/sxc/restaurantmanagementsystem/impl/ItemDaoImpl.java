/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sxc.restaurantmanagementsystem.impl;

import com.sxc.restaurantmanagementsystem.dao.ItemDAO;
import com.sxc.restaurantmanagementsystem.dbaccess.DBConnection;
import com.sxc.restaurantmanagementsystem.entities.Item;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alish Shrestha
 */
public class ItemDaoImpl implements ItemDAO {
    private DBConnection connection=null;
    
    public ItemDaoImpl(DBConnection connection){
        this.connection=connection;  
    }

    @Override
    public int add(Item item) throws SQLException{
       String sql = "INSERT INTO items(item_name,item_price,item_quantity) values(?,?,?)";
        PreparedStatement stmt = connection.initStatement(sql);
        stmt.setString(1, item.getItemName());
        stmt.setInt(2, item.getItemPrice());
        stmt.setInt(3, item.getItemQuantity());

        return connection.execute(); 
    }

    @Override
    public int edit(Item item) throws SQLException {
        String sql="Update items set item_name=?,item_price=?,item_quantity=? WHERE item_id=?";
        PreparedStatement statement= connection.initStatement(sql);
        
        statement.setString(1,item.getItemName());
        statement.setInt(2,(item.getItemPrice()));
        statement.setInt(3,item.getItemQuantity());
        statement.setInt(4, item.getItemId());
//statement.setInt(4,id);       
        
        return connection.execute();
        
    }

    @Override
    public int delete(Item item) throws SQLException{
      String sql="DELETE from items where item_id=?";
      PreparedStatement stmt= connection.initStatement(sql);
      stmt.setInt(1,item.getItemId());
      return connection.execute(); 
    }

    @Override
    public List<Item> getAll() throws SQLException {
        List<Item> itemList=new ArrayList<>();
        
        ResultSet rs= connection.fetch("SELECT * FROM items");
        
        while(rs.next()){
            Item item=new Item();
            item.setItemId(rs.getInt("item_id"));
            item.setItemName(rs.getString("item_name"));
            item.setItemPrice(rs.getInt("item_price"));
            itemList.add(item);
        }        
        return itemList;
       
    }
    

    @Override
    public Item getById(int id) throws SQLException{
        Item item=null;
        
        String sql="SELECT * from item where item_id=?";
      PreparedStatement stmt= connection.initStatement(sql);
      stmt.setInt(1, id);
      
        ResultSet rs= connection.fetch();
        
        while(rs.next()){
            item=new Item();
            item.setItemId(rs.getInt("item_id"));
            item.setItemName(rs.getString("item_name"));
            item.setItemPrice(rs.getInt("item_price"));
            item.setItemQuantity(rs.getInt("item_quantity"));           
        }        
        return item; 
    }

    @Override
    public List<Item> search(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   

    
}

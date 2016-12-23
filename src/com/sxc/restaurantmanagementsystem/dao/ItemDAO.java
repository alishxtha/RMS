/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sxc.restaurantmanagementsystem.dao;

import com.sxc.restaurantmanagementsystem.entities.Item;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Alish Shrestha
 */
public interface ItemDAO {
    public int add(Item item)throws SQLException;
    public int edit(Item item) throws SQLException;
    public int delete(Item item)throws SQLException;
    public List<Item> getAll() throws SQLException;
    public Item getById(int id) throws SQLException;
    public List<Item> search(String parameter);
        
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sxc.restaurantmanagementsystem.dao;

import com.sxc.restaurantmanagementsystem.entities.Vendor;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Alish Shrestha
 */
public interface VendorDAO {
    public int add(Vendor vendor)throws SQLException;
    public Boolean edit(Vendor vendor);
    public int delete(Vendor vendor)throws SQLException;
    public List<Vendor> getAll() throws SQLException;
    public Vendor getById(int id) throws SQLException;
    public List<Vendor> search(String parameter);
    
}

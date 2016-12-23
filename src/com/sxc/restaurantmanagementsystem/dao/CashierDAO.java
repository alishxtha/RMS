/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sxc.restaurantmanagementsystem.dao;

import com.sxc.restaurantmanagementsystem.entities.Cashier;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Alish Shrestha
 */
public interface CashierDAO {
    public int add(Cashier cashier)throws SQLException;
    public Boolean edit(Cashier cashier);
    public int delete(Cashier cashier)throws SQLException;
    public List<Cashier> getAll() throws SQLException;
    public Cashier getById(int id) throws SQLException;
    public List<Cashier> search(String parameter);    
}

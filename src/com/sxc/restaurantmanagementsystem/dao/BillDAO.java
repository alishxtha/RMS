/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sxc.restaurantmanagementsystem.dao;

import com.sxc.restaurantmanagementsystem.entities.Bill;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Alish Shrestha
 */
public interface BillDAO {
    public int add(Bill bill)throws SQLException;
    public Boolean edit(Bill bill);
    public int delete(Bill bill)throws SQLException;
    public List<Bill> getAll() throws SQLException;
    public Bill getById(int id) throws SQLException;
    public List<Bill> search(String parameter);       
}

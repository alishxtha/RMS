/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sxc.restaurantmanagementsystem.dao;

import com.sxc.restaurantmanagementsystem.entities.Customer;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Alish Shrestha
 */
public interface CustomerDAO {
    public int add(Customer customer)throws SQLException;
    public Boolean edit(Customer customer);
    public int delete(Customer customer)throws SQLException;
    public List<Customer> getAll() throws SQLException;
    public Customer getById(int id) throws SQLException;
    public List<Customer> search(String parameter);   
}

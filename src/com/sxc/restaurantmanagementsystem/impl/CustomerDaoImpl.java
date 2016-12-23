/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sxc.restaurantmanagementsystem.impl;

import com.sxc.restaurantmanagementsystem.dao.CustomerDAO;
import com.sxc.restaurantmanagementsystem.dbaccess.DBConnection;
import com.sxc.restaurantmanagementsystem.entities.Customer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alish Shrestha
 */
public class CustomerDaoImpl implements CustomerDAO{
     private DBConnection connection=null;
    
    public CustomerDaoImpl(DBConnection connection){
        this.connection=connection;  
    }


    @Override
    public int add(Customer customer) throws SQLException {
        String sql = "INSERT INTO customers(customer_name) values(?)";
        PreparedStatement stmt = connection.initStatement(sql);
        stmt.setString(1, customer.getCustomerName());

        return connection.execute(); 
    }

    @Override
    public Boolean edit(Customer customer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(Customer customer) throws SQLException {
        String sql = "DELETE from customers where customer_id=?";
        PreparedStatement stmt = connection.initStatement(sql);
        stmt.setInt(1,customer.getCustomerId());
        return connection.execute();
    }

    @Override
    public List<Customer> getAll() throws SQLException {
        List<Customer> customerList=new ArrayList<>();
        
        ResultSet rs= connection.fetch("SELECT * FROM customers");
        
        while(rs.next()){
            Customer customer=new Customer();
            customer.setCustomerId(rs.getInt("customer_id"));
            customer.setCustomerName(rs.getString("customer_name"));
            customerList.add(customer);
        }        
        return customerList;
    }

    @Override
    public Customer getById(int id) throws SQLException {
        Customer customer = null;

        String sql = "SELECT * from customers where customer_id=?";
        PreparedStatement stmt = connection.initStatement(sql);
        stmt.setInt(1, id);

        ResultSet rs = connection.fetch();

        while (rs.next()) {
            customer = new Customer();
            customer.setCustomerId(rs.getInt("customer_id"));
            customer.setCustomerName(rs.getString("customer_name"));
        }
        return customer;
    }

    @Override
    public List<Customer> search(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

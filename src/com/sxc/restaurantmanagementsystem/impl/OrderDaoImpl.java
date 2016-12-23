/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sxc.restaurantmanagementsystem.impl;

import com.sxc.restaurantmanagementsystem.dao.OrderDAO;
import com.sxc.restaurantmanagementsystem.dbaccess.DBConnection;
import com.sxc.restaurantmanagementsystem.entities.Order;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alish Shrestha
 */
public class OrderDaoImpl implements OrderDAO {
    private DBConnection connection=null;
    
    public OrderDaoImpl(DBConnection connection){
        this.connection=connection;  
    }

    @Override
    public int add(Order order)throws SQLException {
        String sql = "INSERT INTO orders(order_date,item_id) values(?,?)";
        PreparedStatement stmt = connection.initStatement(sql);
        stmt.setString(1, order.getOrderDate());
        stmt.setInt(2, order.getItemId());
        return connection.execute();
    }

    @Override
    public Boolean edit(Order order) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(Order order) throws SQLException{
        String sql = "DELETE from orders where order_id=?";
        PreparedStatement stmt = connection.initStatement(sql);
        stmt.setInt(1,order.getOrderId());
        return connection.execute(); 
    }

    @Override
    public List<Order> getAll() throws SQLException {
        List<Order> orderList=new ArrayList<>();
        
        ResultSet rs= connection.fetch("SELECT * FROM orders");
        
        while(rs.next()){
            Order order=new Order();
            order.setOrderId(rs.getInt("order_id"));
            order.setOrderDate(rs.getString("order_date"));
            order.setItemId(rs.getInt("item_id"));
            orderList.add(order);
        }        
        return orderList;
    }

    @Override
    public Order getById(int id) throws SQLException{
       Order order = null;

        String sql = "SELECT * from orders where order_id=?";
        PreparedStatement stmt = connection.initStatement(sql);
        stmt.setInt(1, id);

        ResultSet rs = connection.fetch();

        while (rs.next()) {
            order = new Order();
            order.setOrderId(rs.getInt("order_id"));
            order.setOrderDate(rs.getString("order_date"));
            order.setItemId(rs.getInt("item_id"));
        }
        return order;
    }

    @Override
    public List<Order> search(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

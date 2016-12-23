/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sxc.restaurantmanagementsystem.impl;

import com.sxc.restaurantmanagementsystem.dao.BillDAO;
import com.sxc.restaurantmanagementsystem.dbaccess.DBConnection;
import com.sxc.restaurantmanagementsystem.entities.Bill;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alish Shrestha
 */
public class BillDaoImpl implements BillDAO {
    private DBConnection connection=null;
    
    public BillDaoImpl(DBConnection connection){
        this.connection=connection;  
    }

    @Override
    public int add(Bill bill) throws SQLException {
        String sql = "INSERT INTO bills(date,item_id,item_name,item_quantity,item_price,total) values(?,?,?,?,?,?)";
        PreparedStatement stmt = connection.initStatement(sql);
        stmt.setString(1, bill.getDate());
        stmt.setInt(2, bill.getItemId());
        stmt.setString(3, bill.getItemName());
        stmt.setInt(4,bill.getItemQuantity());
        stmt.setInt(5,bill.getItemQuantity());
        stmt.setInt(6,bill.getTotal());
        
        return connection.execute(); 
    }

    @Override
    public Boolean edit(Bill bill) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(Bill bill) throws SQLException {
        String sql="DELETE from bills where bill_id=?";
      PreparedStatement stmt= connection.initStatement(sql);
      stmt.setInt(1, bill.getBillId());
      return connection.execute(); 
    }

    @Override
    public List<Bill> getAll() throws SQLException {
        List<Bill> billList=new ArrayList<>();
        
        ResultSet rs= connection.fetch("SELECT * FROM bills");
        
        while(rs.next()){
            Bill bill=new Bill();
            bill.setBillId(rs.getInt("bill_id"));
            bill.setDate(rs.getString("date"));
            bill.setItemId(rs.getInt("item_id"));
            bill.setItemName(rs.getString("item_name"));
            bill.setItemQuantity(rs.getInt("item_quantity"));
            bill.setItemPrice(rs.getInt("item_price"));
            bill.setTotal(rs.getInt("total"));              
            billList.add(bill);
        }        
        return billList;
    }

    @Override
    public Bill getById(int id) throws SQLException {
        Bill bill = null;

        String sql = "SELECT * from bills where bill_id=?";
        PreparedStatement stmt = connection.initStatement(sql);
        stmt.setInt(1, id);

        ResultSet rs = connection.fetch();

        while (rs.next()) {
            bill = new Bill();
            bill.setBillId(rs.getInt("bill_id"));
            bill.setDate(rs.getString("date"));
            bill.setItemId(rs.getInt("item_id"));
            bill.setItemName(rs.getString("item_name"));
            bill.setItemQuantity(rs.getInt("item_quantity"));
            bill.setItemPrice(rs.getInt("item_price"));
            bill.setTotal(rs.getInt("total"));
        }
        return bill;
    }

    @Override
    public List<Bill> search(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

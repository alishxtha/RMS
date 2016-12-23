/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sxc.restaurantmanagementsystem.impl;

import com.sxc.restaurantmanagementsystem.dao.CashierDAO;
import com.sxc.restaurantmanagementsystem.dbaccess.DBConnection;
import com.sxc.restaurantmanagementsystem.entities.Cashier;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alish Shrestha
 */
public class CashierDaoImpl implements CashierDAO{
     private DBConnection connection=null;
    
    public CashierDaoImpl(DBConnection connection){
        this.connection=connection;  
    }

    @Override
    public int add(Cashier cashier) throws SQLException {
       String sql = "INSERT INTO cashiers(cashier_name) values(?)";
        PreparedStatement stmt = connection.initStatement(sql);
        stmt.setString(1, cashier.getCashierName());

        return connection.execute(); 
    }

    @Override
    public Boolean edit(Cashier cashier) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(Cashier cashier) throws SQLException {
      String sql="DELETE from cashiers where cashier_id=?";
      PreparedStatement stmt= connection.initStatement(sql);
      stmt.setInt(1, cashier.getCashierId());
      return connection.execute(); 
    }

    @Override
    public List<Cashier> getAll() throws SQLException {
        List<Cashier> cashierList=new ArrayList<>();
        
        ResultSet rs= connection.fetch("SELECT * FROM cashiers");
        
        while(rs.next()){
            Cashier cashier=new Cashier();
            cashier.setCashierId(rs.getInt("cashier_id"));
            cashier.setCashierName(rs.getString("cashier_name"));
            cashierList.add(cashier);
        }        
        return cashierList;
    }

    @Override
    public Cashier getById(int id) throws SQLException {
        Cashier cashier=null;
        
        String sql="SELECT * from cashiers where cashier_id=?";
      PreparedStatement stmt= connection.initStatement(sql);
      stmt.setInt(1, id);
      
        ResultSet rs= connection.fetch();
        
        while(rs.next()){
            cashier=new Cashier();
            cashier.setCashierId(rs.getInt("cashier_id"));
            cashier.setCashierName(rs.getString("cashier_name"));
        }        
        return cashier; 
    }

    @Override
    public List<Cashier> search(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sxc.restaurantmanagementsystem.impl;

import com.sxc.restaurantmanagementsystem.dao.ManagerDAO;
import com.sxc.restaurantmanagementsystem.dbaccess.DBConnection;
import com.sxc.restaurantmanagementsystem.entities.Manager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alish Shrestha
 */
public class ManagerDaoImpl implements ManagerDAO{
     private DBConnection connection=null;
    
    public ManagerDaoImpl(DBConnection connection){
        this.connection=connection;  
    }

    @Override
    public int add(Manager manager) throws SQLException {
        String sql = "INSERT INTO managers(manager_name,contact_no,address) values(?,?,?)";
        PreparedStatement stmt = connection.initStatement(sql);
        stmt.setString(1, manager.getManagerName());
        stmt.setString(2, manager.getContactNo());
        stmt.setString(3, manager.getAddress());
        return connection.execute();
    }

    @Override
    public Boolean edit(Manager manager) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(Manager manager) throws SQLException {
      String sql="DELETE from managers where manager_id=?";
      PreparedStatement stmt= connection.initStatement(sql);
      stmt.setInt(1, manager.getManagerId());
      return connection.execute(); 
    }

    @Override
    public List<Manager> getAll() throws SQLException {
        List<Manager> managerList=new ArrayList<>();
        
        ResultSet rs= connection.fetch("SELECT * FROM managers");
        
        while(rs.next()){
            Manager manager=new Manager();
            manager.setManagerId(rs.getInt("manager_id"));
            manager.setManagerName(rs.getString("manager_name"));
            manager.setContactNo(rs.getString("contact_no"));
            manager.setAddress(rs.getString("address"));
            managerList.add(manager);
        }        
        return managerList;
    }

    @Override
    public Manager getById(int id) throws SQLException {
        Manager manager = null;

        String sql = "SELECT * from managers where manager_id=?";
        PreparedStatement stmt = connection.initStatement(sql);
        stmt.setInt(1, id);

        ResultSet rs = connection.fetch();

        while (rs.next()) {
            manager = new Manager();
            manager.setManagerId(rs.getInt("manager_id"));
            manager.setManagerName(rs.getString("manager_name"));
            manager.setContactNo(rs.getString("contact_no"));
            manager.setAddress(rs.getString("address"));
        }
        return manager;
    }

    @Override
    public List<Manager> search(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

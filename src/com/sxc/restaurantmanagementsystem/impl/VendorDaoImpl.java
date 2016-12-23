/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sxc.restaurantmanagementsystem.impl;

import com.sxc.restaurantmanagementsystem.dao.VendorDAO;
import com.sxc.restaurantmanagementsystem.dbaccess.DBConnection;
import com.sxc.restaurantmanagementsystem.entities.Vendor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alish Shrestha
 */
public class VendorDaoImpl implements VendorDAO{
     private DBConnection connection=null;
    
    public VendorDaoImpl(DBConnection connection){
        this.connection=connection;  
    }

    @Override
    public int add(Vendor vendor) throws SQLException {
        String sql = "INSERT INTO vendors(vendor_name,vendor_company,vendor_contact) values(?,?,?)";
        PreparedStatement stmt = connection.initStatement(sql);
        stmt.setString(1, vendor.getVendorName());
        stmt.setString(2, vendor.getVendorCompany());
        stmt.setString(3, vendor.getVendorContact());
        return connection.execute();
    }

    @Override
    public Boolean edit(Vendor vendor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(Vendor vendor) throws SQLException {
        String sql="DELETE from vendors where vendor_id=?";
      PreparedStatement stmt= connection.initStatement(sql);
      stmt.setInt(1,vendor.getVendorId());
      return connection.execute(); 
    }

    @Override
    public List<Vendor> getAll() throws SQLException {
        List<Vendor> vendorList=new ArrayList<>();
        
        ResultSet rs= connection.fetch("SELECT * FROM managers");
        
        while(rs.next()){
            Vendor vendor=new Vendor();
            vendor.setVendorId(rs.getInt("vendor_id"));
            vendor.setVendorName(rs.getString("vendor_name"));
            vendor.setVendorCompany(rs.getString("vendor_company"));
            vendor.setVendorContact(rs.getString("vendor_contact"));
            vendorList.add(vendor);
        }        
        return vendorList;
    }

    @Override
    public Vendor getById(int id) throws SQLException {
        Vendor vendor= null;

        String sql = "SELECT * from vendors where vendor_id=?";
        PreparedStatement stmt = connection.initStatement(sql);
        stmt.setInt(1, id);

        ResultSet rs = connection.fetch();

        while (rs.next()) {
            vendor = new Vendor();
            vendor.setVendorId(rs.getInt("vendor_id"));
            vendor.setVendorName(rs.getString("vendor_name"));
            vendor.setVendorCompany(rs.getString("vendor_company"));
            vendor.setVendorCompany(rs.getString("vendor_contact"));
        }
        return vendor;
    }

    @Override
    public List<Vendor> search(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

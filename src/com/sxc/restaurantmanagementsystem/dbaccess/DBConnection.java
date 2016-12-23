/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sxc.restaurantmanagementsystem.dbaccess;

import java.sql.Connection; // Helps connect to the server
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnection {
    private Connection connection=null;
    private PreparedStatement stmt;

    public DBConnection() {
    }

    public DBConnection(Connection connection) {
        this.connection=connection;
    }
    
    public PreparedStatement initStatement(String sql) throws SQLException{
        stmt=connection.prepareStatement(sql);
        return stmt;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    //Insert update delete
    public int execute(String sql) throws SQLException{
        Statement stmt=connection.createStatement();
        return stmt.executeUpdate(sql);
    }
    
    public int execute() throws SQLException{
        return stmt.executeUpdate();
    }
    
    public ResultSet fetch(String sql) throws SQLException
    {
        Statement stmt=connection.createStatement();
        return stmt.executeQuery(sql);
    }
    
    public ResultSet fetch() throws SQLException
    {
        return stmt.executeQuery();
    }
    
    
   
    
}

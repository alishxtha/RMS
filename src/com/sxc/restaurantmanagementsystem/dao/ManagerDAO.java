/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sxc.restaurantmanagementsystem.dao;

import com.sxc.restaurantmanagementsystem.entities.Manager;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Alish Shrestha
 */
public interface ManagerDAO {
    public int add(Manager manager)throws SQLException;
    public Boolean edit(Manager manager);
    public int delete(Manager manager)throws SQLException;
    public List<Manager> getAll() throws SQLException;
    public Manager getById(int id) throws SQLException;
    public List<Manager> search(String parameter);
}

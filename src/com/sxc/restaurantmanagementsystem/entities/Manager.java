/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sxc.restaurantmanagementsystem.entities;

/**
 *
 * @author Alish Shrestha
 */
public class Manager {
    private int ManagerId;
    private String ManagerName;
    private String ContactNo;
    private String Address;

    public Manager() {
    }

    public Manager(int ManagerId, String ManagerName, String ContactNo, String Address) {
        this.ManagerId = ManagerId;
        this.ManagerName = ManagerName;
        this.ContactNo = ContactNo;
        this.Address = Address;
    }

    public int getManagerId() {
        return ManagerId;
    }

    public void setManagerId(int ManagerId) {
        this.ManagerId = ManagerId;
    }

    public String getManagerName() {
        return ManagerName;
    }

    public void setManagerName(String ManagerName) {
        this.ManagerName = ManagerName;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String ContactNo) {
        this.ContactNo = ContactNo;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    @Override
    public String toString() {
        return "Manager{" + "ManagerId=" + ManagerId + ", ManagerName=" + ManagerName + ", ContactNo=" + ContactNo + ", Address=" + Address + '}';
    }
    
    
    
}

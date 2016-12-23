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
public class Customer {
    private int CustomerId;
    private String CustomerName;

    public Customer() {
    }

    public Customer(int CustomerId, String CustomerName) {
        this.CustomerId = CustomerId;
        this.CustomerName = CustomerName;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int CustomerId) {
        this.CustomerId = CustomerId;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    @Override
    public String toString() {
        return "Customer{" + "CustomerId=" + CustomerId + ", CustomerName=" + CustomerName + '}';
    }
    
    
    
}

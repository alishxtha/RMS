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
public class Cashier {
    private int CashierId;
    private String CashierName;

    public Cashier() {
    }

    public Cashier(int CashierId, String CashierName) {
        this.CashierId = CashierId;
        this.CashierName = CashierName;
    }

    public int getCashierId() {
        return CashierId;
    }

    public void setCashierId(int CashierId) {
        this.CashierId = CashierId;
    }

    public String getCashierName() {
        return CashierName;
    }

    public void setCashierName(String CashierName) {
        this.CashierName = CashierName;
    }

    @Override
    public String toString() {
        return "Cashier{" + "CashierId=" + CashierId + ", CashierName=" + CashierName + '}';
    }
    
    
    
    
}

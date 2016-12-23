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
public class Bill {
    private int BillId;
    private String Date;
    private int ItemId;
    private String ItemName;
    private int ItemQuantity;
    private int ItemPrice;
    private int Total;

    public Bill() {
    }

    public Bill(int BillId, String Date, int ItemId, String ItemName, int ItemQuantity, int ItemPrice, int Total) {
        this.BillId = BillId;
        this.Date = Date;
        this.ItemId = ItemId;
        this.ItemName = ItemName;
        this.ItemQuantity = ItemQuantity;
        this.ItemPrice = ItemPrice;
        this.Total = Total;
    }

    public int getBillId() {
        return BillId;
    }

    public void setBillId(int BillId) {
        this.BillId = BillId;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public int getItemId() {
        return ItemId;
    }

    public void setItemId(int ItemId) {
        this.ItemId = ItemId;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public int getItemQuantity() {
        return ItemQuantity;
    }

    public void setItemQuantity(int ItemQuantity) {
        this.ItemQuantity = ItemQuantity;
    }

    public int getItemPrice() {
        return ItemPrice;
    }

    public void setItemPrice(int ItemPrice) {
        this.ItemPrice = ItemPrice;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }

    @Override
    public String toString() {
        return "Bill{" + "BillId=" + BillId + ", Date=" + Date + ", ItemId=" + ItemId + ", ItemName=" + ItemName + ", ItemQuantity=" + ItemQuantity + ", ItemPrice=" + ItemPrice + ", Total=" + Total + '}';
    }

    
    
    
    
}

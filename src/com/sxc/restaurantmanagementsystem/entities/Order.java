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
public class Order {
    private int OrderId;
    private String OrderDate;
    private int ItemId;

    public Order() {
    }

    public Order(int OrderId, String OrderDate, int ItemId) {
        this.OrderId = OrderId;
        this.OrderDate = OrderDate;
        this.ItemId = ItemId;
    }

    public int getOrderId() {
        return OrderId;
    }

    public void setOrderId(int OrderId) {
        this.OrderId = OrderId;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }

    public int getItemId() {
        return ItemId;
    }

    public void setItemId(int ItemId) {
        this.ItemId = ItemId;
    }

    @Override
    public String toString() {
        return "Order{" + "OrderId=" + OrderId + ", OrderDate=" + OrderDate + ", ItemId=" + ItemId + '}';
    }
    
    
    
    
}

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
public class Item {
    private int ItemId;
    private String ItemName;
    private int ItemPrice;
    private int ItemQuantity;
    
    /*constructor*/

    public Item() {
    }

        /*overloaded Constructor*/
    public Item(int ItemId, String ItemName, int ItemPrice, int ItemQuantity) {
        this.ItemId = ItemId;
        this.ItemName = ItemName;
        this.ItemPrice = ItemPrice;
        this.ItemQuantity = ItemQuantity;
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

    public int getItemPrice() {
        return ItemPrice;
    }

    public void setItemPrice(int ItemPrice) {
        this.ItemPrice = ItemPrice;
    }

    public int getItemQuantity() {
        return ItemQuantity;
    }

    public void setItemQuantity(int ItemQuantity) {
        this.ItemQuantity = ItemQuantity;
    }

    @Override
    public String toString() {
        return "Item{" + "ItemId=" + ItemId + ", ItemName=" + ItemName + ", ItemPrice=" + ItemPrice + ", ItemQuantity=" + ItemQuantity + '}';
    }
}

   


    
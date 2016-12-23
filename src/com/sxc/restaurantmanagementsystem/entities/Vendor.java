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
public class Vendor {
    private int VendorId;
    private String VendorName;
    private String VendorCompany;
    private String VendorContact;

    public Vendor() {
    }

    public Vendor(int VendorId, String VendorName, String VendorCompany, String VendorContact) {
        this.VendorId = VendorId;
        this.VendorName = VendorName;
        this.VendorCompany = VendorCompany;
        this.VendorContact = VendorContact;
    }

    public int getVendorId() {
        return VendorId;
    }

    public void setVendorId(int VendorId) {
        this.VendorId = VendorId;
    }

    public String getVendorName() {
        return VendorName;
    }

    public void setVendorName(String VendorName) {
        this.VendorName = VendorName;
    }

    public String getVendorCompany() {
        return VendorCompany;
    }

    public void setVendorCompany(String VendorCompany) {
        this.VendorCompany = VendorCompany;
    }

    public String getVendorContact() {
        return VendorContact;
    }

    public void setVendorContact(String VendorContact) {
        this.VendorContact = VendorContact;
    }

    @Override
    public String toString() {
        return "Vendor{" + "VendorId=" + VendorId + ", VendorName=" + VendorName + ", VendorCompany=" + VendorCompany + ", VendorContact=" + VendorContact + '}';
    }
    
    
    
    
}

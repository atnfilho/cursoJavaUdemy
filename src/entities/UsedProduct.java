/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Antonio
 */
public class UsedProduct extends Product {
    
    private Date manufactureDate;

    public UsedProduct() {
    }

    public UsedProduct(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public UsedProduct(Date manufactureDate, String name, Double price) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }
    
    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    
    @Override
    public void priceTag() {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String date = sdf.format(manufactureDate);
        
        System.out.println(name + " (used) " + String.format("%.2f", price) + 
                " (Manufacture date: " + date + ")");
    }
}

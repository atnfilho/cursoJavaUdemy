/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Antonio
 */
public class ImportedProduct extends Product {
    
    private Double customsFee;

    public ImportedProduct() {
    }

    public ImportedProduct(Double customsFee) {
        this.customsFee = customsFee;
    }

    public ImportedProduct(Double customsFee, String name, Double price) {
        super(name, price);
        this.customsFee = customsFee;
    }

    

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
    
    @Override
    public void priceTag() {
        System.out.println(name + " $ " + String.format("%.2f", price) + 
                "(Customs fee: $ " + String.format("%.2f", customsFee) + ")");
    }
    
    public Double totalPrice() {
        return price += customsFee;
    }
}

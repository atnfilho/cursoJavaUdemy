/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       
        Product product = new Product();
        
        System.out.println("Enter product data: ");
        
        System.out.print("Name: ");
        product.name = sc.nextLine();
        
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();
        
        System.out.println(product.name + ", " + product.price + ", " + product.quantity);
                
       
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
     
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i=1; i<=n; i++) {
            System.out.println("Product #" + i + " data: ");
            
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            
            
            
            if(ch == 'c') {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                sc.nextLine();
                Product product = new Product(name, price);
                list.add(product);
            }
            
            else if(ch == 'u') {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                sc.nextLine();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String date = sc.nextLine();
                
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                
                Date manufactureDate = sdf.parse(date);
                Product product = new UsedProduct(manufactureDate, name, price);
                
                list.add(product);
            }
            
            else if(ch == 'i') {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                sc.nextLine();
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                
                Product product = new ImportedProduct(customsFee, name, price);
                
                list.add(product);
            } else {
                System.out.println("Invalid selection!");
            }
            
        }
        
        if(list.size() > 0)
        {
            System.out.println("");
            System.out.println("PRICE TAGS:");

            for(Product product : list) {
               product.priceTag();
            }
        }
    }
}
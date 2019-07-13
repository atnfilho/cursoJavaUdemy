/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class Course {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // conversão implícita e conversão explícita (CAST)
        
        Locale.setDefault(Locale.US);
        
        String name, lastName;
        int qtdeBed, age;
        double price, height;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your full name:");
        name = sc.nextLine();
        System.out.println(name);
        System.out.println("How many bedrooms are there in your house?");
        qtdeBed = sc.nextInt();
        System.out.println(qtdeBed);
        System.out.println("Enter product price:");
        price = sc.nextDouble();
        System.out.println(price);
        System.out.println("Enter your last name, age and height (same line):");
        lastName = sc.next();
        age = sc.nextInt();
        height = sc.nextDouble();
        System.out.println(lastName);
        System.out.println(age);
        System.out.println(height);
             
    }

}

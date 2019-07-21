/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

import entities.Triangle;
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

       Locale.setDefault(Locale.US);
       Triangle x, y;
       
       x = new Triangle();
       y = new Triangle();
       
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the measures of triangle x:");
       x.a = sc.nextDouble();
       x.b = sc.nextDouble();
       x.c = sc.nextDouble();
       
       System.out.println("Enter the measures of triangle y:");
       y.a = sc.nextDouble();
       y.b = sc.nextDouble();
       y.c = sc.nextDouble();
       
       double areaX = x.area();
       double areaY = y.area();
       System.out.printf("Triangle x area: %.2f%n", areaX);
       System.out.printf("Triangle y area: %.2f%n", areaY);
       
    }

}

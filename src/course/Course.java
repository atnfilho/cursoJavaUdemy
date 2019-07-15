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
       Scanner sc = new Scanner(System.in);
       
       int n1 = sc.nextInt();
       int n2 = sc.nextInt();
       
       int soma = n1 + n2;
       
       System.out.println("Soma: " + soma);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

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
        
        System.out.print("What is the dollar price? ");
        double cotacao = sc.nextDouble();
        System.out.print("How many dollar will be bought? ");
        double qtde = sc.nextDouble();
        
        double amount = CurrencyConverter.dollarToReal(cotacao, qtde);
        
        System.out.printf("Amount to be paid in reais: %.2f%n", amount);
    }

}

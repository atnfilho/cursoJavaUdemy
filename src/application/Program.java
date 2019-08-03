/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Conta;
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
        Conta conta;
        
        System.out.print("Enter account number: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();
        
        System.out.println("Is there an initial deposit? y/n");
        char resposta = sc.next().charAt(0);
        
        if(resposta == 'y' || resposta == 'Y'){
            System.out.print("Enter initial deposit value: ");
            double deposit = sc.nextDouble();
            conta = new Conta(numero, holder, deposit);
        } else {
            conta = new Conta(numero, holder);
        }
        
        System.out.println("=============================================");
        System.out.println("Dados da Conta:");
        System.out.println(conta);
        System.out.println();
        System.out.println("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        conta.deposita(deposit);
        
        System.out.println("=============================================");
        System.out.println("Conta Atualizada:");
        System.out.println(conta);
        
        System.out.println();
        System.out.println("Enter a withdraw value:");
        double saque = sc.nextDouble();
        conta.saca(saque);
        
        System.out.println("=============================================");
        System.out.println("Conta Atualizada:");
        System.out.println(conta);
    }

}

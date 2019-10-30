/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

/**
 *
 * @author Antonio
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(500.0, 1002, "Maria", 0.0);
        SavingsAccount sacc = new SavingsAccount(0.01, 1003, "Renata", 0.0);
                
        
        // UPCASTING

        Account acc1 = bacc; // business account é uma conta
        Account acc2 = sacc; // savings account é uma conta
        
        
        // DOWNCASTING
        
        BusinessAccount acc3 = (BusinessAccount)acc1;
        acc3.loan(200.0);
        
        if(acc2 instanceof BusinessAccount)
        {
            System.out.println("yes");
            BusinessAccount acc4 = (BusinessAccount)acc2;
        }
        else
        {
            System.out.println("no");
            SavingsAccount acc4 = (SavingsAccount)acc2;
        }
        
        
     }
}

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
     
        Account acc1 = new Account(1001, "Alex", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());
        
        Account acc2 = new BusinessAccount(500.0, 1002, "Maria", 1000.0);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());
        
        Account acc3 = new SavingsAccount(0.01, 1003, "Bob", 1000.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;
import java.util.ArrayList;
import java.util.List;
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
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Pessoa> list = new ArrayList<>();
        
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i=1; i<=n; i++) {
            
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            
            System.out.print("Name: ");
            String nome = sc.nextLine();
            System.out.print("Anual income: ");
            Double rendaAnual = sc.nextDouble();
            sc.nextLine();
            
            if(ch == 'i') {
                System.out.print("Health expenditures: ");
                Double gastosSaude = sc.nextDouble();
                sc.nextLine();
                
                list.add(new PessoaFisica(gastosSaude, nome, rendaAnual));
            } else if(ch == 'c') {
                System.out.print("Number of employees: ");
                Integer numeroFuncionarios = sc.nextInt();
                sc.nextLine();
                
                list.add(new PessoaJuridica(numeroFuncionarios, nome, rendaAnual));
            } else {
                System.out.println("Type of person uncertain!");
            }
        }
        
        System.out.println("");
        System.out.println("TAXES PAID:");
        
        Double totalTaxes = 0.0;
        for(Pessoa pessoa : list) {
            System.out.println(pessoa.getNome() + ": $ " + String.format("%.2f",pessoa.calculaImposto()));
            totalTaxes += pessoa.calculaImposto();
        }
        
        System.out.println("");
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTaxes));
    }
}
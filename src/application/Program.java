/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Employee;
import entities.OutsourcedEmployee;
import java.util.ArrayList;
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
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
                
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        List<Employee> listEmployee = new ArrayList<>();
        for(int i=1; i<=n; i++)
        {
            System.out.println("Employee #" + i + " data: ");
            System.out.print("Outsourced (y/n)?");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name:");
            String name = sc.nextLine();
            System.out.print("Hours:");
            int hours = sc.nextInt();
            sc.nextLine();
            System.out.print("Value per hour:");
            double value = sc.nextDouble();
            sc.nextLine();
            
            if(ch == 'y') {
                System.out.print("Additional charge: ");
                double charge = sc.nextDouble();
                sc.nextLine();
                listEmployee.add(new OutsourcedEmployee(charge, name, hours, value));
            } else {
                listEmployee.add(new Employee(name, hours, value));
            }
                     
        }
        
        System.out.println("");
        System.out.println("PAYMENTS:");
        
        for (Employee employee : listEmployee) {
            System.out.println(employee.getName() + " - $ " + employee.payment() );
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Employee;
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
        // TODO code application logic here

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many employes will be registered?");
        int n = sc.nextInt();

        List<Employee> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {

            Employee employee = new Employee();

            System.out.println("Employee #" + (i + 1));
            System.out.print("ID: ");
            employee.setId(sc.nextInt());
            sc.nextLine();
            System.out.println("Name: ");
            employee.setName(sc.nextLine());
            System.out.println("Salary: ");
            employee.setSalary(sc.nextDouble());
            sc.nextLine();
            
            list.add(employee);
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        sc.nextLine();
        
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        
        if(emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.println("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }
        
        
        
        System.out.println("List of employees: ");
        for(Employee employee : list) {            
            System.out.println(employee);
        }

    }
}

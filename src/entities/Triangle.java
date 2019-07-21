/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Antonio
 */
public class Triangle {
   public double a;
   public double b;
   public double c;
   
    public double calculaArea()
    {
        double area = a * b * c;
        
        return area;
    }

}

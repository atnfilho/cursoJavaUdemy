/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Antonio
 */
public class CurrencyConverter {
    
    public static final double IOF = 0.06;
    
    public static double dollarToReal(double cotacao, double qtde) {
        
        return qtde * cotacao * (1 + IOF);
    }
}

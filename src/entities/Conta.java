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
public class Conta {
    
    private int numero;
    private String titular;
    private double saldo;
    
       
    public Conta(Integer numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }
    
    public Conta(int numero, String titular, double depositoInicial) {
        this.numero = numero;
        this.titular = titular;
        deposita(depositoInicial);
    }
    
    
    public Integer getNumero() {
        return numero;
    }

    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

   
    public void deposita(double valor) {
        this.saldo += valor;
    }
    
    public void saca(double valor) {
        this.saldo -= valor + 5;
    }
    
    
    @Override
    public String toString() {
        return "Account " 
                + numero 
                + ", Holder: " 
                + titular 
                + ", Balance: $ " 
                + String.format("%.2f", saldo);
    }
}

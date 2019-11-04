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
public class PessoaJuridica extends Pessoa {
    
    private Integer numerofuncionarios;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(Integer numerofuncionarios, String nome, Double rendaAnual) {
        super(nome, rendaAnual);
        this.numerofuncionarios = numerofuncionarios;
    }

    public Integer getNumerofuncionarios() {
        return numerofuncionarios;
    }

    public void setNumerofuncionarios(Integer numerofuncionarios) {
        this.numerofuncionarios = numerofuncionarios;
    }

    @Override
    public Double calculaImposto() {
        
        if(numerofuncionarios > 10) {
            imposto = rendaAnual * 0.14;
        } else {
            imposto = rendaAnual * 0.16;
        }
        
        return imposto;
    }
    
    
    
}

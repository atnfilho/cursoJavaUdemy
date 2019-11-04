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
public class PessoaFisica extends Pessoa {
    
    private Double gastosSaude;
        
    public PessoaFisica() {
        super();
    }

    public PessoaFisica(Double gastosSaude, String nome, Double rendaAnual) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }
   

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }
    
  
    @Override
    public Double calculaImposto() {
        
        if(rendaAnual < 20000.0) {
            imposto = (rendaAnual * 0.15) - (gastosSaude * 0.5);
        } else {
            imposto = (rendaAnual * 0.25) - (gastosSaude * 0.5);
        }
        
        return imposto;
    }
    
}

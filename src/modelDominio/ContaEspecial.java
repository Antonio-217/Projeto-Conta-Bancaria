/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDominio;

/**
 *
 * @author lorenzi
 */
public class ContaEspecial extends ContaBancaria{
    private float limite;

    public ContaEspecial(float limite, String nomeTitular, String cpfTitular, float saldo) {
        super(nomeTitular, cpfTitular, saldo);
        this.limite = limite;
    }

    @Override
    public boolean sacar(float valorSaque) {
        boolean resultado = false;
        resultado = super.sacar(valorSaque);
        if (resultado == false) {
            if (valorSaque <= (super.getSaldo() + this.limite)) {
                valorSaque = valorSaque - super.getSaldo();
                super.setSaldo(0);
                this.limite = this.limite - valorSaque;
                resultado = true;
            } else {
                resultado = false;
            }
        }
        return resultado;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    
    
}


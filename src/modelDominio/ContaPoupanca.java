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
public class ContaPoupanca extends ContaBancaria{
    private int diaRendimento;

    public ContaPoupanca(int diaRendimento, String nomeTitular, String cpfTitular, float saldo) {
        super(nomeTitular, cpfTitular, saldo);
        this.diaRendimento = diaRendimento;
    }
    
    public void calcularNovoSaldo(float taxaRendimento, int diaAtual) {
        if (diaAtual == this.diaRendimento) {
            float novoSaldo = super.getSaldo() + (super.getSaldo() * taxaRendimento);
            super.setSaldo(novoSaldo);
        }
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
    
    
}

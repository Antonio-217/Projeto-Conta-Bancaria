
package modelDominio;

public class ContaBancaria {
    private String nomeTitular;
    private String cpfTitular;
    private float saldo;

    public ContaBancaria(String nomeTitular, String cpfTitular, float saldo) {
        this.nomeTitular = nomeTitular;
        this.cpfTitular = cpfTitular;
        this.saldo = saldo;
    }  

    public ContaBancaria(String nomeTitular, String cpfTitular) {
        this.nomeTitular = nomeTitular;
        this.cpfTitular = cpfTitular;
        this.saldo = 0;
    }
    
    public boolean sacar(float valorSaque) {
        boolean resultado;
        if (this.saldo >= valorSaque) {
            this.saldo = this.saldo - valorSaque;
            resultado = true;
        } else {
            resultado = false;
        }    
        return resultado;
    }
    
    public boolean depositar(float valorDeposito) {
        boolean resultado;
        if (valorDeposito > 0) {
            this.saldo = this.saldo + valorDeposito;
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }
    
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public float getSaldo() {
        return this.saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getCpfTitular() {
        return cpfTitular;
    }

    public void setCpfTitular(String cpfTitular) {
        this.cpfTitular = cpfTitular;
    }
    
    
}

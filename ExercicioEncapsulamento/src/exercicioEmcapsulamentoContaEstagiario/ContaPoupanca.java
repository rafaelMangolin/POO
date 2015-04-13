/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioEmcapsulamentoContaEstagiario;

import java.util.List;

/**
 *
 * @author rafael
 */
public class ContaPoupanca extends Conta{

    private Long numConta;

    private Long numAgencia;

    private List<String> variacao;

    public ContaPoupanca(Long numConta, Long numAgencia, List<String> variacao, Long codigo, String nomeProprietario, Double saldo) {
        super(codigo, nomeProprietario, saldo);
        this.numConta = numConta;
        this.numAgencia = numAgencia;
        this.variacao = variacao;
    }
    
    public List<String> getVariacao() {
        return variacao;
    }

    public void setVariacao(List<String> variacao) {
        this.variacao = variacao;
    }

    public Long getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(Long numAgencia) {
        this.numAgencia = numAgencia;
    }

    public Long getNumConta() {
        return numConta;
    }

    public void setNumConta(Long numConta) {
        this.numConta = numConta;
    }
    
    public void imprimirExtrato(){
        System.out.println(super.getSaldo());
    }

    @Override
    public void somarSaldo(double sum) {
        super.setSaldo(super.getSaldo()+sum+100); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

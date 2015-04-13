/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioEmcapsulamentoContaEstagiario;

/**
 *
 * @author rafael
 */
public class Conta {
    
    private Long codigo;

    private String nomeProprietario;

    private Double saldo;

    public Double getSaldo() {
        return saldo;
    }

    public Conta(Long codigo, String nomeProprietario, Double saldo) {
        this.codigo = codigo;
        this.nomeProprietario = nomeProprietario;
        this.saldo = saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    
    public void somarSaldo(double sum){
        this.saldo += sum;
    }
}

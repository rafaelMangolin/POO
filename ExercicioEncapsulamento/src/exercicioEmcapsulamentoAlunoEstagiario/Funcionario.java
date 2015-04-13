/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioEmcapsulamentoAlunoEstagiario;

/**
 *
 * @author rafael
 */
public class Funcionario extends Pessoa{
    
    private Double salario;

    public Funcionario(Double salario, int codigo, String nome, String telefone, String endereco) {
        super(codigo, nome, telefone, endereco);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

}

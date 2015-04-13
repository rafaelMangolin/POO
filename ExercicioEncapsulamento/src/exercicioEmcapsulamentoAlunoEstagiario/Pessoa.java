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
public abstract class Pessoa {
    
    private int codigo;

    protected String nome;

    private String telefone;

    public String endereco;

    public Pessoa(int codigo, String nome, String telefone, String endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void imprimeDados(){
        System.out.println("Codigo:"+this.codigo);
        System.out.println("Nome:"+this.nome);   
        System.out.println("Telefone:"+this.telefone);
        System.out.println("Endereço:"+this.endereco);
    }

}

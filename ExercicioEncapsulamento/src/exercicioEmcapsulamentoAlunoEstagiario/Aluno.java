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
public class Aluno extends Pessoa{
    
    private Long numMatricula;

    private Double media;

    private int faltas;

    public Aluno(Long numMatricula, Double media, int faltas, int codigo, String nome, String telefone, String endereco) {
        super(codigo, nome, telefone, endereco);
        this.numMatricula = numMatricula;
        this.media = media;
        this.faltas = faltas;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public Long getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(Long numMatricula) {
        this.numMatricula = numMatricula;
    }

}

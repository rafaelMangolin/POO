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
public class AlunoMestrado extends Aluno{
    
    private String conceitoDissertacao;

    private int notaDissertacao;

    public AlunoMestrado(String conceitoDissertacao, int notaDissertacao, Long numMatricula, Double media, int faltas, int codigo, String nome, String telefone, String endereco) {
        super(numMatricula, media, faltas, codigo, nome, telefone, endereco);
        this.conceitoDissertacao = conceitoDissertacao;
        this.notaDissertacao = notaDissertacao;
    }

    public int getNotaDissertacao() {
        return notaDissertacao;
    }

    public void setNotaDissertacao(int notaDissertacao) {
        this.notaDissertacao = notaDissertacao;
    }

    public String getConceitoDissertacao() {
        return conceitoDissertacao;
    }

    public void setConceitoDissertacao(String conceitoDissertacao) {
        this.conceitoDissertacao = conceitoDissertacao;
    }
    
    public boolean aprovado(){
        return this.notaDissertacao >= 7 && super.getMedia() >= 7 && super.getFaltas() < 10;
    }

}

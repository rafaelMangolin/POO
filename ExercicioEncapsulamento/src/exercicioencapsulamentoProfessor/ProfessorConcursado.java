/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioencapsulamentoProfessor;

/**
 *
 * @author rafael
 */
public class ProfessorConcursado extends Professor{
    
    private Double salarioMensal;

    public ProfessorConcursado() {
        super();
    }

    public ProfessorConcursado(Double salarioMensal, String nome, String titulacao) {
        super(nome, titulacao);
        this.salarioMensal = salarioMensal;
    }

    public Double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(Double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    
    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        
        stringBuilder.append("Nome:"+super.getNome()+"\n");
        stringBuilder.append("Titulação:"+super.getTitulacao()+"\n");
        stringBuilder.append("Salario Mensal:"+salarioMensal+"\n");
        stringBuilder.append("Classe:"+this.getClass().getSimpleName());
        
        return stringBuilder.toString();
    }
}

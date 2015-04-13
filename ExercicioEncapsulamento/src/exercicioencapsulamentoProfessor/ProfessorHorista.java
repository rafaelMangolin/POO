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
public class ProfessorHorista extends Professor{
    
    private Double valorHoraAula;

    public ProfessorHorista() {
        super();
    }

    public ProfessorHorista(String nome, String titulação, Double valorHoraAula) {
        super(nome, titulação);
        this.valorHoraAula = valorHoraAula;
    }

    public Double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(Double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }
    
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        
        stringBuilder.append("Nome:"+super.getNome()+"\n");
        stringBuilder.append("Titulação:"+super.getTitulacao()+"\n");
        stringBuilder.append("Valor Hora/Aula:"+valorHoraAula+"\n");
        stringBuilder.append("Classe:"+this.getClass().getSimpleName());
        
        return stringBuilder.toString();
    }
}

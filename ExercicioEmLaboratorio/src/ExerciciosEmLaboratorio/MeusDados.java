/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosEmLaboratorio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafael
 */
public class MeusDados {
    
    private String nome;

    private int ra;

    private int ano;

    private List<String> diciplinas;

    public MeusDados() {
        this.nome = "Rafael";
        this.ra = 84261;
        this.ano = 2013;
        this.diciplinas = new ArrayList<>();
        this.diciplinas.add("Calculo");
        this.diciplinas.add("PAA");
        this.diciplinas.add("POO");
        this.diciplinas.add("Grafos");
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        MeusDados meusDados = new MeusDados();
        System.out.println("Main");
        System.out.println("Nome:"+meusDados.getNome());
        System.out.println("RA:"+meusDados.getRa());
        System.out.println("Ano:"+meusDados.getAno());
        for (String disciplina : meusDados.getDiciplinas()) {
            System.out.println("Disciplinas: "+ disciplina);
        }
    }

    public List<String> getDiciplinas() {
        return diciplinas;
    }

    public void setDiciplinas(List<String> diciplinas) {
        this.diciplinas = diciplinas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}

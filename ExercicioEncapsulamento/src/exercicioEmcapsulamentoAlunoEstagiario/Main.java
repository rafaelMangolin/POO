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
public class Main {
    public static void main(String[] args) {
        AlunoMestrado alunoMestrado = new AlunoMestrado("A",7,12l,8.9,2,1,"Maria","999999999","Brasil");
        alunoMestrado.imprimeDados();
        
        System.out.println("Está aprovado?\n"+alunoMestrado.aprovado());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosEmLaboratorio;

/**
 *
 * @author rafael
 */
public class MinhaIdadeWrapper {
    public static void main(String[] args) {
        Integer meuAnoDeNascimento = 1995;
        Integer anoAtual = 2015;
        
        System.out.println("Minha idade(Wrapper):"+ (anoAtual.intValue()-meuAnoDeNascimento.intValue()));
    }
}

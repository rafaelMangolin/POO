/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafael
 */
public class PessoaMain {

    public static void main(String[] args) {
        List<Pessoa> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Pessoa(i));
        }
        
        PessoaMain aux = new PessoaMain();
        aux.printPessoaList(list);

        

    }
    
    public void printPessoaList(List<Pessoa> list){
        for (Pessoa pessoa : list) {
            System.out.println("Nome:" + pessoa.getNome());
            System.out.println("CPF:" + pessoa.getCpf());
            System.out.println("RG:" + pessoa.getRg());
            System.out.println("Endereço:" + pessoa.getEndereco());
            System.out.println("Telefone:" + pessoa.getTelefone());
            System.out.println("-------------------------------------------------");
        }
    }
}

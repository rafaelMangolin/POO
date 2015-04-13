/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author rafael
 */
// O codigo apresendato no slide não compila pelo fato da variavel i não ser inializada
// assim ela recebe o valor padrão do tipo object, que é null, causando o erro assim na 
// hora da atribuição de j = i;
public class TestBox {
    Integer i;
    int j;
    
    public static void main(String[] args) {
        TestBox t = new TestBox();
        t.go();
    }
    
    public void go(){
        // para funcionar a variavel i dever ser inicializada
        // esse é um jeito
        i = 1;
        j = i;
        
        System.out.println("int -- "+i);
        System.out.println("Integer -- "+j);
    }
}

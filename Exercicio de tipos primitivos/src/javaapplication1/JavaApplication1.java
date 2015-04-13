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
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Exercicio 1
        
        byte a1 = 10;
        short x1 = a1;
        
        long a2 = 125;
        int x =(int)a2;
        
        //Exercicio 2
        int x = 34.5; //Não é legal, pois variáveis do tipo int não recebe implicitamente valores do tipo double
        
        boolean boo = x; //Não é legal, pois variáveis do tipo boolean não recebe valores que não sejam do tipo boolean
        
        int g = 17; //É legal, pois variaveis do tipo int podem receber valores do tipo int
        
        int y = g; //É legal, pois variaveis do tipo int podem receber valores do tipo int e g representa um valor int
        
        y = y + 10; //É legal, pois variaveis do tipo int podem receber valores do tipo int e a expressão "y + 10" é uma expressão inteira
        
        short s; // É legal, pois só está sendo reservado um espaço na memoria de tamanho short
        
        s = y; // Não é legal, pois uma variável do tipo short não recebe implicitamente um valor do tipo int 
        
        byte b = 3; // É legal, pois uma variável do tipo byte pode armazenar valores entre -2^7 e (2^7)-1, e 3 esta nesse intervalo de valores
        
        byte v = b; // É legal, pois variaveis do tipo byte podem receber valores de outras variaveis do tipo byte
        
        short n = 12; // É legal, pois uma variável do tipo short pode armazenar valores entre -2^15 e (2^15)-1, e 12 esta nesse intervalo de valores
        
        v = n;// Não é legal, pois uma variável do tipo byte não recebe implicitamente um valor do tipo short 
        
        byte k = 128;// Não é legal, pois uma variável do tipo byte pode armazenar valores entre -2^7 e (2^7)-1, e 128(2^7) não esta nesse intervalo de valores, onde 2^7>(2^7)-1
    
        // Instruções legais: 3, 4, 5, 6, 8, 9, 10;
    }
    
}

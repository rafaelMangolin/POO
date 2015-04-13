/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioEmcapsulamentoContaEstagiario;

import java.util.ArrayList;

/**
 *
 * @author rafael
 */
public class Main {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca;
        contaPoupanca = new ContaPoupanca((long)1,(long)1,new ArrayList<>(),(long)1,"Maria",1.);
        contaPoupanca.imprimirExtrato();
        contaPoupanca.somarSaldo(100);
        contaPoupanca.imprimirExtrato();
    }
}

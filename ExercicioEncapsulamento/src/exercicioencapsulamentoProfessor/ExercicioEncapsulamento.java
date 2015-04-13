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
public class ExercicioEncapsulamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Exemplo para o primeiro exercicio
//        ProfessorHorista professorHorista = new ProfessorHorista("Maria","Mestre",(double)400);
//        ProfessorConcursado professorConcursado = new ProfessorConcursado((double)400,"Maria","Mestre");
//        System.out.println("Horista\n"+professorHorista);
//        System.out.println("Concursado\n"+professorConcursado);
        Professor p = new ProfessorConcursado();//Funciona pelo fato da classe ProfessorConcursado extender de Professor, 
                                                //assim toda instancia de ProfessorConcursado também é uma instancia de Professor
        ProfessorHorista ph = new Professor();//Não funciona pelo fato que o ponteiro de Professorhorista só aponta para referência 
                                              // de ProfessorHorista, o que a classe Professor não é
        Professor p2 = new Object();//Não funciona pelo fato que o ponteiro de Professor só aponta para referência 
                                    // de Professor, o que a classe Object não é
        ProfessorHorista ph2 = new ProfessorConcursado();//Não funciona pelo fato que o ponteiro de Professorhorista só aponta para referência 
                                                         // de ProfessorHorista, o que a classe ProfessorConcursado não é
        ProfessorConcursado pc = new Professor();//Não funciona pelo fato que o ponteiro de ProfessoConcursado só aponta para referência 
                                                 // de ProfessorConcursado, o que a classe Professor não é
        ProfessorConcursado pc2 = new ProfessorHorista();//Não funciona pelo fato que o ponteiro de ProfessorConcursado só aponta para referência 
                                                         // de ProfessorConcursado, o que a classe ProfessorHorista não é
        Object prof = new Professor();//Funciona pelo fato da classe Professor extender de Object, 
                                      //assim toda instancia de Professor também é uma instancia de Object
                                      // Obs: Toda classe extende da classe Object
        Object p3 = (Professor) new ProfessorHorista();//Funciona pelo fato da classe ProfessorHorista extender de Professor, e a classe Professor extender de Object
                                                       //assim toda instancia de ProfessorHorista também é uma instancia de Object
                                                       //Obs: o casting de ProfessorHorista para professor funciona, dado a existencai da relação de herança entre eles
        Professor p4 = (Object) new Professor();//Não funciona pelo fato que o ponteiro de Professor só aponta para referência 
                                                // de Professor, e que a referencia que quer ser apontada, vira após o casting da classe Object
                                                // invalidado a operação
        ProfessorHorista ph3 = new Object();//Não funciona pelo fato que o ponteiro de Professorhorista só aponta para referência 
                                            // de ProfessorHorista, o que a classe Object não é
    }

}

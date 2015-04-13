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
public class ConvercoesPrimitivas {
    public static void main(String[] args) {
        int x = 2;
        Integer y = x;
        float z = y;
        Float w = (float)x;
        x = w.intValue();
        x = (int)z;
        double a = z;
        Double b = (double)x;
        boolean c = true;
        Boolean d = Boolean.TRUE;
    }
}

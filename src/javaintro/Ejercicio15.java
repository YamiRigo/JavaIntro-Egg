/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;

/**
 *
 * @author yamila
 */

/*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.*/

public class Ejercicio15 {

    public static void main(String[] args) {
        
        System.out.println("Los primeros 100 números enteros");
        int[] arreglo = new int[100];
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i + 1;
        }
        System.out.println("Orden Descendente");
        
        for (int i = arreglo.length - 1; i > -1; i--) {
            System.out.println(arreglo[i] + " , ");
        }
        System.out.println();
    }
    
}

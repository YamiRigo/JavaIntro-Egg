/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author yamila
 */

/*Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.*/

public class Extra18 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar la cantidad de elementos del vector");
        int n = leer.nextInt();
        int suma = 0;
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Elemento " + (i+1));
            vector[i] = leer.nextInt();
            suma += vector[i];
        }
        
        System.out.println("");
        System.out.println("La suma de los " + n + " elementos es: " + suma);
    }
    
}

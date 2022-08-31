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

/*Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.*/

public class Extra20 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar la cantidad de números");
        int n = leer.nextInt();
        
        int[] vector = new int[n];
        
        llenarVector(vector,n);
        mostrarVector(vector,n);
    }
    
    public static void llenarVector(int[] vector, int n){
        
        for (int i = 0; i < n; i++) {
            vector[i] = (int)(Math.random() * 10 + 1);
        }
    }
    
    public static void mostrarVector(int[] vector, int n){
        
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
    }
    
}

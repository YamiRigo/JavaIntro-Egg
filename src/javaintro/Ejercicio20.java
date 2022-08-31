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

/*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.*/

public class Ejercicio20 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int contador = 0;
        int suma = 0;
        int sumaDiagonal = 0;
        int filas = 3;
        int[]sumaFilas = new int[filas];
        int[] sumaColumnas = new int[filas];
        int columnas = filas;
        int matriz[][] = new int[filas][columnas];
        
        //ingresan elementos de la matriz
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.println("Ingresar el valor de la posición [" + (i + 1) + "] " + "[" + (j + 1) + "]" + " de la matriz");
                matriz[i][j] = leer.nextInt();
            }
        }
        
        System.out.println("La matriz generada es: ");
        mostrarMatriz(matriz,filas);
        System.out.println("");
        System.out.println("Su traspuesta es: ");
        mostrarMT(matriz,filas);
        System.out.println("");
        
        //Recorro la matriz para sumar las filas
        for (int i = 0; i < filas; i++) {
            suma = 0;
            for (int j = 0; j < filas; j++) {
                suma = suma + matriz[i][j];
            }
            sumaFilas[i] = suma;
        }
        
        System.out.println("La suma de las filas es: ");
        for (int i = 0; i < filas; i++) {
            System.out.print("[" + sumaFilas[i] + "]");
        }
        System.out.println("");
        
        //Recorro la matriz para sumar las columnas
        for (int i = 0; i < columnas; i++) {
            suma = 0;
            for (int j = 0; j < columnas; j++) {
                suma = suma + matriz[j][i];
            }
            sumaColumnas[i] = suma;
        }
        
        System.out.println("La suma de las columnas es: ");
        for (int i = 0; i < columnas; i++) {
            System.out.print("[" + sumaColumnas[i] + "]");
        }
        System.out.println("");
        
        //Recorro con un for la matriz para sumar la diagonal
        for (int i = 0; i < filas; i++) {
            suma = 0;
            for (int j = 0; j < filas; j++) {
                if(i == j){
                    suma = suma + matriz[i][j];
                }
            }
            sumaDiagonal = sumaDiagonal + suma;
        }
        
        System.out.println("La suma de la diagonal es: " + sumaDiagonal);
        System.out.println("La matriz: ");
        
        //Recorro comparando las sumas para saber si es magica
        for (int i = 0; i < filas; i++) {
            if(sumaColumnas[i] == sumaDiagonal && sumaFilas[i] == sumaDiagonal){
                contador++;
            }
        }
        
        if(contador == filas){
            System.out.println("Es una matriz magica");
        }else{
            System.out.println("No es una matriz magica");
        }
    }
    
    //-----------------------
    //Función para Mostrar una matriz cuadrada de indice N
    public static void mostrarMatriz(int matriz[][],int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
    }
    
    //Función para Mostrar la matriz traspuesta
    public static void mostrarMT(int matriz[][],int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz[j][i] + "]");
            }
            System.out.println(" ");
        }
    }
}



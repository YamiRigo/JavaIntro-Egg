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

/*Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.*/

public class Extra22 {

    public static void main(String[] args) {
        
        int n = 5;
        int m = 4;
        double suma;
        int[][] matriz = new int[n][m];
        
        llenarMatriz(n,m,matriz);
        mostrarMatriz(n,m,matriz);
        
        suma = sumaMatriz(matriz,n,m);
        
        System.out.println("La suma de sus elementos es " + suma);
    }
    
    //Función llena con nº aleatorios una Matriz de indice N x M
    public static int[][] llenarMatriz(int n, int m, int matrix[][]){
        //matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int)(Math.random() * 50 + 1);
            }
        }
        return matrix;
    }
    
    //Función para mostrar una matriz de indice N x M
    public static void mostrarMatriz(int n, int m, int matrix[][]){
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
    public static double sumaMatriz(int[][] matriz, int n, int m){
        
        double suma = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                suma += matriz[i][j];
                System.out.println(suma);
            }
        }
        return suma;
    }
    
}

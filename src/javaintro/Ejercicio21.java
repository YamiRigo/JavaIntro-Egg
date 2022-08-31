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

/*Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.*/

public class Ejercicio21 {

    public static void main(String[] args) {
        
        int cont = 0;
        int[][] matriz10 = {
            {01, 26, 36, 47, 5, 6, 76, 81, 95, 10},
            {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
            {56, 78, 87, 90, 9, 90, 17, 12, 87, 67},
            {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
            {32, 76, 79, 1, 36, 5, 67, 96, 12, 11},
            {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
            {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
            {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
            {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
            {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}};
        
        int[][] matriz3 = {{36, 5, 67}, {89, 90, 75}, {14, 22, 26}};
        
        System.out.println("Matriz 10 x 10");
        mostrarMatriz(matriz10,10);
        System.out.println("");
        System.out.println("Matriz 3 x 3");
        mostrarMatriz(matriz3,3);
        System.out.println("");
        
        buscarMatriz(matriz10,matriz3);
    }
    
    //-------------------------
    //Función para Mostrar una matriz cuadrada de indice N
    public static void mostrarMatriz(int matrix[][],int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println(" ");
        }
    }
    
    public static void buscarMatriz(int[][] matrizM, int[][] matrizP){
        
        boolean bandera;
        
        for (int i = 0; i < matrizM.length - 2; i++) {
            for (int j = 0; j < matrizM.length - 2; j++) {
                bandera = true;
                for (int k = 0; k < matrizP.length; k++) {
                    for (int l = 0; l < matrizP.length; l++) {
                        if(matrizM[i+k][j+l] != matrizP[k][l]){
                            bandera = false;
                            break;
                        }
                    }
                }
                if(bandera){
                    System.out.println("La matriz Pequeña comienza en las coordenadas: (Filas-Columnas)\n"
                    + j + " - " + i + " y termina en la coordena "
                    + (j+2) + " - " + (i+2) + " de la matriz Mayor");
                    
                    return;
                }
            }
        }
        System.out.println("No se encontro coincidencia");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;

import java.util.Scanner;
import static java.lang.Math.pow;

/**
 *
 * @author yamila
 */

/*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).*/

public class Ejercicio19 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar el tamaño de la matriz");
        int n = leer.nextInt();
        System.out.println("");
        
        int[][]matriz = new int[n][n];
        int[][]matrizT = new int[n][n];
        int contador = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingreso de la posición: " + contador);
                matriz[i][j] = leer.nextInt();
                contador += 1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizT[i][j] = matriz[j][i];
            }
        }
        contador = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(matriz[i][j] == -matrizT[i][j]){
                    contador += 1;
                }
            }
        }
        System.out.println("");
        System.out.println("La matriz: ");
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("La matriz traspuesta: ");
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matrizT[i][j] + "]");
            }
            System.out.println("");
        }
        if(contador == pow(n, 2)){
            System.out.println("Las matrices son anti-simétricas");
        }else{
            System.out.println("Las matrices no son anti-simétricas");
        }
    }
    
}

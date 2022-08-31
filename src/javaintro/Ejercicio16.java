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

/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido*/

public class Ejercicio16 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar el tamaño del vector");
        int tam = leer.nextInt();
        System.out.println("");
        System.out.println("Ingresar el número que desea buscar");
        int num = leer.nextInt();
        
        int contador = 0;
        String posicion = "";
        
        int[]vector = new int[tam];
        
        for (int i = 0; i <= tam - 1; i++) {
            vector[i] = (int)(Math.random()*10);
        }
        for (int i = 0; i <= tam - 1; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println();
        
        for (int i = 0; i <= tam - 1; i++) {
            if(vector[i] == num){
                posicion = posicion + "[" + String.valueOf(i) + "]";
                contador++;
            }
        }
        if(contador > 1){
            System.out.println("El número " + num + " se encuentra en la posición: " + posicion);
            System.out.println("");
            System.out.println("El número " + num + " se repite " + contador + " veces");
        }else if(contador == 1){
            System.out.println("");
            System.out.println("El número " + num + " se encuentra " + contador + " vez en el vector");
            System.out.println("El la posición: " + posicion);
        }else{
            System.out.println("El número " + num + " no se encuentra en ninguna posición");
        }
    }
    
}

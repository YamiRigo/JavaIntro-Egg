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

/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas.*/

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingresar frase");
        String frase = leer.next();
        
        System.out.println("Mayuscula: " + frase.toUpperCase());
        System.out.println("Minuscula: " + frase.toLowerCase());
    }
    
}

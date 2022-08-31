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

/*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número.*/

public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingresar número entero");
        int num = leer.nextInt();
        
        double resultado = Math.sqrt(num);
        
        System.out.println("Doble de " + num + " -> " + 2*num);
        System.out.println("Triple de " + num + " -> " +3*num);
        System.out.println("La raíz cuadrada de " + num + " -> " +resultado);
    }
    
}

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

/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingresar ºC");
        double grados = leer.nextDouble();
        
        double f = 32 + (9 * grados / 5);
        
        System.out.println(grados + " ºC equivale a " + f + " ºF");
    }
    
}

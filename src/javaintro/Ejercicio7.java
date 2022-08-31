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

/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.*/

public class Ejercicio7 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingresar frase");
        String frase = leer.next();
        
        String frase2 = "eureka";
        
        if(frase.equals(frase2)){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author yamila
 */

/*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.*/

public class Extra3 {

    public static void main(String[] args) throws IOException {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar una letra");
        String var = leer.nextLine();
        var = var.toUpperCase().substring(0, 1);
        
        switch(var){
            case "A":
                System.out.println(var + " es la 1º vocal");
                break;
            case "E":
                System.out.println(var + " es la 2º vocal");
                break;
            case "I":
                System.out.println(var + " es la 3º vocal");
                break;
            case "O":
                System.out.println(var + " es la 4º vocal");
                break;
            case "U":
                System.out.println(var + " es la 5º vocal");
                break;
            default:
                System.out.println("No es una vocal");
                System.out.println("Presiona ENTER para continuar");
                System.in.read(); //Espera un ENTER, no cualquier tecla
        }
        
        //-----------------------------
        //Otra versión del ejer con un if
        /*System.out.println("Ingreso de letra");
        Character letra = leer.next().toLowerCase().charAt(0);
        
        if(letra.equals('a') || letra.equals('e') || letra.equals('i') || letra.equals('o') || letra.equals('u')){
        System.out.println("Es un vocal");
        }else{
        System.out.println("No es una vocal");
        }*/
        //-------------------------------
    }
    
}

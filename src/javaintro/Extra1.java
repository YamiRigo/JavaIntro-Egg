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

/*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/

public class Extra1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar la cantidad de minutos a analizar");
        int min = leer.nextInt();
        
        int hr = (int)Math.floor(min/60);
        int dias = hr / 24;
        
        //Verifico si las horas se pasan de 24
        //le asigno el resultado de hr - 24
        
        if(hr >= 24){
            hr -= 24;
        }
        
        System.out.println(min + " minutos, en días es " + dias + " días, y " + hr + " horas");
    }
    
}

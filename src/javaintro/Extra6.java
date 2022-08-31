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

/*Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.*/

public class Extra6 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int contador = 0;
        int cont60 = 0;
        double acumula = 0;
        double promedio = 0;
        double acumula60 = 0;
        double prom60 = 0;
        
        System.out.println("Ingresar el total de personas");
        int muestra = leer.nextInt();
        
        while (contador != muestra) {            
            contador++;
            System.out.println("Ingresar la altura de la persona " + contador);
            double altura = leer.nextDouble();
            acumula = acumula + altura;
            promedio = acumula / contador;
            
            if(altura < 1.60){
                acumula60 = acumula60 + altura;
                cont60++;
                prom60 = acumula60 / cont60;
            }
        }
        
        leer.close();
        System.out.println("El promedio de la altura de las " + contador + 
                " personas ingresadas es " + promedio);
        System.out.println("");
        System.out.println(cont60 + " personas miden menos de 1.60 " + 
                "con un promedio de altura de " + prom60);
        System.out.println("");
        System.out.println("***** NOS VEMOS *****");
    }
    
}

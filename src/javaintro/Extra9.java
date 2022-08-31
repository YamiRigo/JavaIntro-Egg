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

/*Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.*/

public class Extra9 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar el dividendo");
        int dividendo = leer.nextInt();
        System.out.println("Ingresar el divisor");
        int divisor = leer.nextInt();
        
        int resto, cociente = 0;
        
        resto = dividendo;
        
        if(dividendo > divisor){
            
            while (resto > divisor) {                
                resto = resto - divisor;
                cociente++;
            }
        }else{
            System.out.println("El dividendo debe ser mayor que el divisor");
        }
        
        if(resto == divisor){
            cociente++;
            resto = 0;
        }
        
        System.out.println("");
        System.out.println("----------");
        System.out.println(dividendo + " / " + divisor + " = " + cociente);
        System.out.println("");
        System.out.println("Con un resto de " + resto);
    }
    
}

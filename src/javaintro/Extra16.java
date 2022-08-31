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

/*Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.*/

public class Extra16 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar la cantidad de personas");
        int n = leer.nextInt();
        
        persona(n);
        leer.close();
    }
    
    public static void persona(int n){
        Scanner leer = new Scanner(System.in);
        
        int[] edad = new int[n];
        String[] nombres = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingresar el nombre de la persona");
            nombres[i] = leer.next();
            System.out.println("Ingresar la edad");
            edad[i] = leer.nextInt();
        }
        System.out.println("");
        
        for (int i = 0; i < n; i++) {
            System.out.println("Su nombre: " + nombres[i]);
            System.out.println("Su edad: " + edad[i]);
            System.out.println("");
            
            if(i < (int)(n - 1)){
                System.out.println("Desea seguir mostrando personas?(Si/No)");
                String confirma = leer.next();
                
                if("Si".equals(confirma)){
                    continue;
                }
                if("No".equals(confirma)){
                    break;
                }
            }
        }
        leer.close();
    }
}

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

/*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.*/

public class Extra7 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar el total de números");
        int n = leer.nextInt();
        int contador = 0;
        int suma = 0;
        int min = 1000000;
        int max = 0;
        double promedio = 0;
        
        //Versión WHILE
//        while (contador != n) {            
//            contador++;
//            System.out.println("Ingresar el número " + contador + " de la muestra");
//            int num = leer.nextInt();
//            suma += num;
//            promedio = suma / n;
//            
//            if(num > max){
//                max = num;
//            }
//            if(num < min){
//                min = num;
//            }
//        }
        
        //Versión DO-WHILE
        do {            
            contador++;
            System.out.println("Ingresar el número " + contador + " de la muestra");
            int num = leer.nextInt();
            suma += num;
            promedio = suma / n;
            
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
            
        } while (contador != n);
        
        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("Se analizaron " + n + " números");
        System.out.println("");
        System.out.println("El mayor número ingresado fue " + max);
        System.out.println("");
        System.out.println("El menor número ingresador fue " + min);
        System.out.println("");
        System.out.println("La suma de todos los números es: " + suma);
        System.out.println("");
        System.out.println("El promedio de los números es: " + promedio);
    }
    
}

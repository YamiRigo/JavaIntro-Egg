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

/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.*/

public class Ejercicio10 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar el valor limite");
        int limite = leer.nextInt();
        
        int num;
        int suma = 0;
        
        do{
            System.out.println("Ingresar valores");
            num = leer.nextInt();
            suma += num;
        }while(suma <= limite);
        
        System.out.println("La suma de los valores ingresados supera al limite que es " +limite+ " la suma total es: " +suma);
    }
    
}

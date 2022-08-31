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

/*Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú: El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.*/

public class Ejercicio11 {

    public static void main(String[] args) {
        
        try(Scanner leer = new Scanner(System.in)){
            System.out.println("Ingresar dos números enteros");
            double num1 = leer.nextDouble();
            double num2 = leer.nextDouble();
            int opcion;
            String salir = "";
            
            do{
                System.out.println("--------------------");
                System.out.println("       MENU         ");
                System.out.println("   1. SUMAR");
                System.out.println("   2. RESTAR");
                System.out.println("   3. MULTIPLICAR");
                System.out.println("   4. DIVIDIR");
                System.out.println("   5. SALIR");
                System.out.println("--------------------");
                
                System.out.println("");
                System.out.println("Ingresar la operación que desea realizar");
                opcion = leer.nextInt();
                
                switch(opcion){
                    case 1:
                        System.out.println("");
                        System.out.println("La suma es: " + (num1 + num2));
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("");
                        System.out.println("La resta es: " + (num1 - num2));
                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("");
                        System.out.println("La multiplicación es: " + (num1 * num2));
                        System.out.println("");
                        break;
                    case 4:
                        System.out.println("");
                        System.out.println("La división es: " + (num1 / num2));
                        System.out.println("");
                        break;
                    case 5:
                        System.out.println("");
                        System.out.println("Está seguro que desea salir? (S/N)");
                        salir = leer.next();
                        
                        if("s".equals(salir.substring(0,1).toLowerCase())){
                            opcion = 0;
                            break;
                        }
                }
            }while(opcion != 0);
        }
        
    }

}


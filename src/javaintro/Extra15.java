/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;

import java.util.Scanner;
import java.io.IOException;


/**
 *
 * @author yamila
 */

/*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.*/

public class Extra15 {

    public static void main(String[] args) throws IOException {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar los dos números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        int opcion;
        
                 
        System.out.println("***************************");
        System.out.println("*********  MENU  **********");
        System.out.println("***************************");
        System.out.println("***  1- SUMAR           ***");
        System.out.println("***  2- RESTAR          ***");
        System.out.println("***  3- MULTIPLICAR     ***");
        System.out.println("***  4- DIVIDIR         ***");
        System.out.println("***  5- SALIR           ***");
        System.out.println("***************************");
        System.out.println("---->  ELIJA OPCION  <----");
            
        opcion = leer.nextInt();
        
                    
        switch(opcion){
            case 1:
                System.out.println("La suma es: " + sumar(num1,num2));
                break;
            case 2:
                System.out.println("La resta es: " + restar(num1,num2));
                break;
            case 3:
                System.out.println("La multiplicación es: " + multiplicar(num1,num2));
                break;
            case 4:
                System.out.println("La división es: " + dividir(num1,num2));
                break;
            case 5:
                System.out.println("Está seguro que desea salir del programa? S/N");
                String confirma = leer.next();
                
                if("s".equals(confirma.substring(0, 1).toLowerCase())){
                    opcion = 0;
                    break;
                }
            default:
                System.out.println("Ingresaste una opción errónea");
                System.out.println("Presione ENTER para continuar");
                System.in.read();  //Espera un ENTER, no cualquier tecla
        } 
       
        leer.close();
        System.out.println("");
        System.out.println("*******************");
        System.out.println("*****  CHAU!!  ****");
        System.out.println("*******************");
               
    }
    
    public static double sumar(double a, double b){
        return a + b;
    }
    
    public static double restar(double a, double b){
        return a - b;
    }
    public static double multiplicar(double a, double b){
        return a * b;
    }
    public static double dividir(double a, double b){
        if(b == 0){
            return 0;
        }else{
            return a / b;
        }
    }
                   
}            
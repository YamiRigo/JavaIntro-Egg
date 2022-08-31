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

/*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.*/

public class Extra8 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        int contador = 0;
        int suma = 0;
        int num = 0;
        int par = 0;
        int impar = 0;
        
        do {            
            contador++;
            System.out.println("Ingresar el número " + contador + " de la muestra");
            num = leer.nextInt();
            suma += num;
            
            if(num % 2 == 0){
                par++;
            }else{
                impar++;
            }
            
        } while ((esMultiplo(num, 5)) != true);
        
        System.out.println("");
        System.out.println("------------------------");
        System.out.println("Se analizaron " + contador + " números");
        System.out.println("");
        System.out.println(num + " es multiplo de 5");
        System.out.println("");
        System.out.println(par + " números fueron pares");
        System.out.println("");
        System.out.println(impar + " números fueron impares");
        System.out.println("");
        System.out.println("La suma de todos los números es: " + suma);
    }
    
    
    public static boolean esMultiplo(int n1, int n2){
        return n1 % n2 == 0;
        
    }
    
    //----------------------------
    //BREAK
    //----------------------------
//    public static void main(String[] args) {
//        Scanner leer = new Scanner(System.in);
//        int num, par, impar, cant;
//        par = 0;
//        impar = 0;
//        cant = 0;
//        
//        do{
//            System.out.println("Ingreso de número");
//            num = leer.nextInt();
//            if(num % 5 == 0){
//                break;
//            }
//            if(num > 0){
//                cant += 1;
//                if(num % 2 == 0){
//                    par += 1;
//                }else{
//                    impar += 1;
//                }
//            }
//        }while(num > 0 && num % 5 != 0);
//        System.out.println("La cantidad de números ingresados es: "+cant);
//        System.out.println("La cantidad de números pares es: "+par);
//        System.out.println("La cantidad de números impares es: "+impar);
//    }
}

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

/*Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €*/

public class Ejercicio14 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar la cantidad de euros que desea cambiar");
        double cantidad = leer.nextDouble();
        
        System.out.println("Por cual moneda desea cambiar?");
        String moneda = leer.next();
        
        cambioDivisa(cantidad,moneda);
    }
    
    public static void cambioDivisa(double cantidad, String moneda){
        
        if(moneda.equalsIgnoreCase("Libra")){
            double cambioLibra = cantidad * 0.86;
            System.out.println(cantidad + " euros son " + cambioLibra + " libras");
        }
        if(moneda.equalsIgnoreCase("Dolar")){
            double cambioDolar = cantidad * 1.28611;
            System.out.println(cantidad + " euros son " + cambioDolar + " dolares");
        }
        if(moneda.equalsIgnoreCase("Yenes")){
            double cambioYenes = cantidad * 129.852;
            System.out.println(cantidad + " euros son " + cambioYenes + " yenes");
        }
    }
    
}

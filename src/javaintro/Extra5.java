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

/*Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento*/

public class Extra5 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la clase de socio A - B - C");
        String socio = leer.next();
        socio = socio.toUpperCase();  //Lo paso a mayuscula
        socio = socio.substring(0, 1);  //Extraigo el 1º caracter
        
        System.out.println("Ingrese el monto del tratamiento");
        double tratamiento = leer.nextInt();
        
        double descuento = 0;
        
        switch(socio){
            case "A":
                descuento = (tratamiento * 0.50);
                System.out.println("Total a pagar $ " + (tratamiento - descuento));
                break;
            case "B":
                descuento = (tratamiento * 0.35);
                System.out.println("Total a pagar $ " + (tratamiento - descuento));
                break;
            case "C":
                descuento = 0;
                System.out.println("Total a pagar $ " + (tratamiento - descuento));
                break;
            default:
                System.out.println("No existe esa clase de socio");
        }
        
    }
    
}

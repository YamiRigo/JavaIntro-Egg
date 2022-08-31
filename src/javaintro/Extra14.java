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

/*Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.*/

public class Extra14 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int familias, hijos, hijosTotal = 0;
        double edad = 0;
        double edadMedia = 0;
        
        System.out.println("Ingresar la cantidad de familias");
        familias = leer.nextInt();
        
        for (int i = 0; i < familias; i++) {
            System.out.println("Ingresar la cantidad de hijos/as que tiene");
            hijos = leer.nextInt();
            System.out.println("-----------------");
            
            for (int j = 0; j < hijos; j++) {
                System.out.println("Ingresar la edad de su/s hijo/os " + (int)(j + 1));
                edad += leer.nextInt();
                hijosTotal += 1;
            }
        }
        
        edadMedia = Math.round(edad / hijosTotal);
        System.out.println("La edad media de todos los hijos es de " + (int)edadMedia);
        leer.close();  //Cierro el teclado
    }
    
}

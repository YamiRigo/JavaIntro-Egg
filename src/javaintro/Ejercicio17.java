/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author yamila
 */

/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).*/

public class Ejercicio17 {

    public static void main(String[] args) {
        
        int uno,dos,tres,cuatro,cinco;
        uno = 0;
        dos = 0;
        tres = 0;
        cuatro = 0;
        cinco = 0;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar la cantidad de números a generar");
        int num = leer.nextInt();
        
        int[]vector = new int[num];
        Random numero = new Random();
        int digitos;
        
        for (int i = 0; i < num; i++) {
            vector[i] = numero.nextInt(100000);
        }
        for (int i = 0; i < num; i++) {
            digitos = 1;
            int n = vector[i];
            
            if(n / 10 < 1){
                digitos = 1;
                uno += 1;
                break;
            }
            while(n / 10 >= 1){
                digitos += 1;
                n = n / 10;
            }
            if(digitos == 2){
                dos += 1;
            }
            if(digitos == 3){
                tres += 1;
            }
            if(digitos == 4){
                cuatro += 1;
            }
            if(digitos == 5){
                cinco += 1;
            }
        }
        System.out.println("Números con 1 digito: " + uno);
        System.out.println("Números con 2 digito: " + dos);
        System.out.println("Números con 3 digito: " + tres);
        System.out.println("Números con 4 digito: " + cuatro);
        System.out.println("Números con 5 digito: " + cinco);
        leer.close();
    }
    
}

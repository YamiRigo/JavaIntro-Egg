/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;

/**
 *
 * @author yamila
 */

/*Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).*/

public class Extra19 {

    public static void main(String[] args) {
        
        int[] vectorA = {1, 2, 3, 4, 5, 6};
        int[] vectorB = {1, 2, 3, 4, 5, 63};
        int contador = 0;
        
        for (int i = 0; i < vectorA.length; i++) {
            if(vectorA[i] != vectorB[i]){
                System.out.println(vectorA[i] + " != " + vectorB[i]);
                System.out.println("Los vectores no son iguales");
                break;
            }else{
                System.out.println(vectorA[i] + " = " + vectorB[i]);
                contador++;
            }
        }
        
        if(contador == vectorA.length){
            System.out.println("Los vectores son iguales");
        }
    }
    
}

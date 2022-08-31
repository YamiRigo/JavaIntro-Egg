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

/*Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.*/

public class Extra10 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("*************************************");
        System.out.println("** Vamos a Jugar a las adivinanzas **");
        System.out.println("*************************************");
        System.out.println("**  Voy a generar dos nº al azar   **");
        System.out.println("* Como pista solo seran del 1 al 10 *");
        System.out.println("*************************************");
        System.out.println("* Tienes que adivinar el resultado  *");
        System.out.println("* de la multiplicación esos dos nº  *");
        System.out.println("*************************************");
        System.out.println("--------> ESTAS LISTO? S/N <---------");
        
        String confirma = leer.next();
        
        if("s".equals(confirma.substring(0, 1).toLowerCase())){
            int num1 = (int)(Math.random() * 10) + 1;
            int num2 = (int)(Math.random() * 10) + 1;
            
            do {                
                System.out.println("Adivina el resultado");
                int num = leer.nextInt();
                if(num == num1 * num2){
                    confirma = "s";
                    System.out.println("ADIVINO FELICITACIONES!!");
                }else{
                    System.out.println("...mmm, ese no es el resultado...");
                    System.out.println("quiere volver a intentarlo? S/N");
                    confirma = leer.next().substring(0, 1).toLowerCase();
                }
                
            } while ("s".equals(confirma));
        }
    }
    //Genero dos números aleatorios fuerzo que sean enteros(int) y luego
    //limito que sean desde 0 a 10 pero al final le sumo +1 para que
    //nunca me toque el número 0
}

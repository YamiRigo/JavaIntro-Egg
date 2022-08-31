/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author yamila
 */

/*Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.*/

public class Extra12 {

    public static void main(String[] args) throws InterruptedException {
        
        int a = 0;
        
        do {            
            for (int i = 0; i <= 9; i++) {
                a++;
                String convI = String.valueOf(i); //Convierto a i en una cadena
                if(i == 3){  //Si i toma el valor de 3 su equivalente convertido le asigno la letra E
                    convI = "E";
                }
                for (int j = 0; j <= 9; j++) {
                    String convJ = String.valueOf(j); //Convierto a j en una cadena
                    if(j == 3){  //Si j toma el valor de 3 su equivalente convertido le asigno la letra E
                        convJ = "E";
                    }
                    for (int k = 0; k <= 9; k++) {
                        String convK = String.valueOf(k);  //Convierto a k en una cadena
                        TimeUnit.SECONDS.sleep(1);  //Mando a dormir un segundo para que parezca un reloj
                        if(k == 3){
                            convK = "E";  //Si k toma el valor de 3 su equivalente convertido le asigno la letra E
                        }
                        System.out.println("CONTADOR: " + convI + " - " + convJ + " - " + convK);
                    }
                }
            }
            
        } while (true);
    }
    
}

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

/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().*/

public class Ejercicio12 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("--> Simulación del dispositivo RS232 <--");
        
        int correcto = 0;
        int incorrecto = 0;
        System.out.println("Ingresar secuencia");
        String secuencia = leer.next();
        
        while(!secuencia.equals("&&&&&")){
            if(secuencia.length() != 5){
                incorrecto += 1;
            }else{
                if(secuencia.substring(0,1).equals("X") && 
                        secuencia.substring(secuencia.length() - 1, secuencia.length()).equals("O")){
                    correcto += 1;
                }else{
                    incorrecto += 1;
                }
            }
            
            System.out.println("Ingresar nuevamente la cadena. Ingrese &&&&& para finalizar");
            secuencia = leer.next();
        }
        
        if(secuencia.equals("&&&&&")){
            System.out.println("La cantidad de veces que se leyo correctamente fue: " + correcto + " veces");
            System.out.println("La cantidad de veces que se leyo incorrectamente fue: " + incorrecto + " veces");
        }
        
        leer.close();
    }
    
}

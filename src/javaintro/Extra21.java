/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;

import java.util.Arrays;

/**
 *
 * @author yamila
 */

/*Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
-Primer trabajo práctico evaluativo 10%
-Segundo trabajo práctico evaluativo 15%
-Primer Integrador 25%
-Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.*/

public class Extra21 {

    public static void main(String[] args) {
        
        double practico1, practico2, integrador1, integrador2, promedio;
        double[] nota = new double[10];
        int aprobados, desaprobados;
        aprobados = 0;
        desaprobados = 0;
        
        for (int i = 0; i < 10; i++) {
            practico1 = rellenarNotas();
            practico2 = rellenarNotas();
            integrador1 = rellenarNotas();
            integrador2 = rellenarNotas();
            promedio = practico1 * 0.1 + practico2 * 0.15 + integrador1 * 0.25 + integrador2 * 0.5;
            nota[i] = promedio;
            
            if(promedio >= 7){
                aprobados += 1;
            }else{
                desaprobados += 1;
            }
        }
        
        System.out.println("La cantidad de aprobados es de " + aprobados);
        System.out.println("La cantidad de desaprobados es de " + desaprobados);
        System.out.println("Las notas son: " + Arrays.toString(nota));
    }
    
    public static int rellenarNotas(){
        return(int)(Math.random() * 10);
    }
}

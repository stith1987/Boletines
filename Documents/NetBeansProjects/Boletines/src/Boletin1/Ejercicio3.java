/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boletin1;

/**
 *
 * @author Eduar
 */
/*3. Pedir el radio de una circunferencia y calcular su longitud.
L=2*PI*r.*/
//Librerias
import java.util.Scanner;
public class Ejercicio3 {
    //Implementación del método principal
    public static void main(String[] args) {
        //Declaración de la variables
        double r = 0, longitud = 0;
        //Objeto de teclado
        Scanner entrada = new Scanner(System.in);
        //Desarrollo de proceso
        //Pedimos en por teclado el valor de r
        System.out.println("Ingrese el valor de r: ");
        r = entrada.nextDouble();
        //Desarrollo de la formula
        longitud = (2 * Math.PI) * r;
        //Mostramos en pantalla el resultado de la longitud
        System.out.println("La longitud de la circuferencia es: " + longitud);
    }
}

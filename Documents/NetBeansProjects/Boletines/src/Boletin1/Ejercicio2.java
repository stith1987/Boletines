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
/*2. Pedir el radio de un círculo y calcular su área. A=PI*r^2.
*/
//Librerias
import java.util.Scanner;
public class Ejercicio2 {
   
    //Utilización del método principal
    public static void main(String[] args) {
         //Declarar las variables
         double r = 0, area = 0;
         //Método para teclado
         Scanner entrada = new Scanner(System.in);
         //Desarrollo del proceso
         //Pedimos el ingreso por teclado de r
         System.out.println("Ingrese el valor del radio de la circuferencia: ");
         r = entrada.nextDouble();
         //Desarrollo de la formula
         area = Math.PI * (r * r);
         System.out.println("El área de la circuferencia es: " + area);
         
    }
}

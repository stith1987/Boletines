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
/*4. Pedir dos números y decir si son iguales o no.*/
//Librerias
import java.util.Scanner;
public class Ejercicio4 {
    //Implementaciín del método principal
    public static void main(String[] args) {
        //Declaración de las variables
        double numero1 = 0, numero2 = 0;
        //Objeto ingreso por teclado
        Scanner entrada = new Scanner(System.in);
        //Desarrollo del proceso
        //Ingreso de los números por teclado
        System.out.println("Ingrese el número 1: ");
        numero1 = entrada.nextDouble();
        System.out.println("Ingrese el número 2: ");
        numero2 = entrada.nextDouble();
        //Comparación utulizando If
        if (numero1 < numero2) {
            System.out.println("El número 1 es mayor que el número 2");
        }
        else{
            System.out.println("El número 2 es mayor que el número 1");
        }
    }
}

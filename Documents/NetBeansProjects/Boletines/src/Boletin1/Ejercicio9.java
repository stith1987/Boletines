/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boletin1;

/**
 *
 * @author Administrador
 */
/*9. Pedir dos números y mostrarlos ordenados de mayor a menor.*/
//Librerias
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        //Declaración de variables
        double numero1 = 0, numero2 = 0;
        //Método de ingreso por teclado
        Scanner entrada = new Scanner(System.in);
        //Ingreso por teclado
        System.out.println("Ingrese el primer número");
        numero1 = entrada.nextDouble();
        System.out.println("Ingrese el segundo número");
        numero2 = entrada.nextDouble();
        //proceso
        if (numero1 > numero2) {
            System.out.println("El oden de los números ingresados son:" + numero1 + " " + numero2);
        }
        else{
            System.out.println("El oden de los números ingresados son:" + numero2 + " " + numero1);
        }
    }
}

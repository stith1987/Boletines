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
/*6. Pedir dos números y decir si uno es múltiplo del otro.*/
//Librerias
import java.util.Scanner;
public class Ejercicio6 {
    //Implementación del método principal
    public static void main(String[] args) {
        //Declaración de las variables
        double numero1 = 0, numero2 = 0, resultado = 0;
        //Método de ingreso por teclado
        Scanner entrada = new Scanner(System.in);
        //Ingreso de las variables por teclado
        System.out.println("Digite el primero número: ");
        numero1 = entrada.nextDouble();
        System.out.println("Digite el segundo número: ");
        numero2 = entrada.nextDouble();
        //Proceso
       resultado = numero1 % numero2;
        if (resultado == 0) {
            System.out.println("Los números son multiplos");
        }
        else{
            System.out.println("No son multiplos");
        }
       }
}

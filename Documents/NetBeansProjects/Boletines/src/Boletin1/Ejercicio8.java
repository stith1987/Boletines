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
/*8. Pedir dos números y decir cual es el mayor o si son iguales.*/
//Librerias
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        //Declaración de variables
        double numero1 = 0, numero2 = 0;
        //Método de ingreso por teclado
        Scanner entrada = new Scanner(System.in);
        //Entrada
        System.out.println("digite el primer número: ");
        numero1 = entrada.nextDouble();
        System.out.println("Digite el segundo número: ");
        numero2 = entrada.nextDouble();
        //Proceso
        if (numero1 == numero2) {
            System.out.println("Los Números son iguales");
        }
        else{
            if (numero1 < numero2) {
                System.out.println("Número 2 es mayor que Número 1");
            }
            else{
                if (numero2 < numero1) {
                    System.out.println("Número 1 es mayor que Número 2");
                }
            }
        }
    }
}

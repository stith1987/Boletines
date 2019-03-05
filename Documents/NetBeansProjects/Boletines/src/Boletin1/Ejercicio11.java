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
/*11. Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.*/
//Librerias
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        //Declaración de las variables
        double numero = 0;
        
        //Método de ingreso por teclado
        Scanner entrada = new Scanner(System.in);
        //Ingreso por Teclado
        System.out.println("Ingrese el número a analizar");
        numero = entrada.nextDouble();
        //Proceso
        if (numero == 0) {
            System.out.println("El número ingresao es 0");
        }
        else{
            if (numero < 10) {
                System.out.println("El número ingresado tiene una cifra");
            }
            else{
                if (numero < 100 ) {
                    System.out.println("El número ingresado tiene dos cifras");
                }
                else{
                    if (numero < 1000) {
                        System.out.println("El número ingresado tiene tres cifras");
                    }
                    else{
                        if (numero < 10000) {
                            System.out.println("El número ingresado tiene cuatro cifras");
                        }
                        else{
                            System.out.println("El número tiene más de cuatro cifras");
                        }
                    }
                }
            }
        }
    }

   
}

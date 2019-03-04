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
/*5. Pedir un número e indicar si es positivo o negativo.*/
//Librerias
import java.util.Scanner;
public class Ejercicio5 {
    //Implementacion del método main
    public static void main(String[] args) {
        //Declarar las variables
        double numero1 = 0;
        //Objeto para ingresar por teclaro
        Scanner entrada = new Scanner(System.in);
        //Obtener los datos por teclado
        System.out.println("Ingrese el número 1: ");
        numero1 = entrada.nextDouble();
        
        //Proceso
        if (numero1 < 0) {
            System.out.println("El número es negativo");
        }
        else{
            System.out.println("El número es positivo");
        }
    }
}

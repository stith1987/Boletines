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
/*10. Pedir tres números y mostrarlos ordenados de mayor a menor.*/
//Libreria
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        //Declarar variables
        double numero1 = 0, numero2 = 0, numero3 = 0;
        //Método de ingreso por teclado
        Scanner entrada = new Scanner(System.in);
        //Ingreso por teclado
        System.out.println("Ingrese el valor del primer número");
        numero1 = entrada.nextDouble();
        System.out.println("Ingrese el valor del segundo número");
        numero2 = entrada.nextDouble();
        System.out.println("Ingrese el valor del tercer número");
        numero3 = entrada.nextDouble();
        //Proceso
        if (numero1 > numero2 && numero1 > numero3 && numero2 > numero3) {
            System.out.println(numero1 + " " + numero2 + " " + numero3  );
        }
        else{
            if (numero2 > numero1 && numero2 > numero3 && numero1 > numero3) {
                System.out.println(numero2 + " " + numero1 + " " + numero3);
            }
            else{
                if (true) {
                    
                }
            }
        }
    }
}

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
/*1. Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales. Si no existen,
debe indicarlo.*/
//Librerias
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        //Declaracion de las variables
        double a = 0, b = 0, c = 0, d = 0, x1 = 0, x2 = 0;
        //Método de ingreso por teclado
        Scanner entrada = new Scanner(System.in);
        //Ingreso por teclado
        System.out.println("Ingrese el coeficiente a: ");
        a = entrada.nextDouble();
        System.out.println("Ingrese el coeficiente b: ");
        b = entrada.nextDouble();
        System.out.println("Ingrese el coeficiente c: ");
        c = entrada.nextDouble();
        //Calculo del determinante
        d = ((b * b) - 4 * a * c);
        //Confirmar que sea diferente que 0
        if (d <= 0) {
            System.out.println("No existe una solución Real");
        }
        else{
            x1 = (- b + Math.sqrt(d))/(2 * a);
            x2 = (- b - Math.sqrt(d))/(2 * a);
            System.out.println("El resultado de X1 es : " + x1);
            System.out.println("El resultado de X2 es : " + x2);
        }
        }
}

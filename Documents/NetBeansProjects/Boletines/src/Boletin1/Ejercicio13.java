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
/*13. Pedir un número entre 0 y 9.999, decir si es capicúa.*/
//Librerias
import java.util.Scanner;
public class Ejercicio13 {
    //Implementación del método principal
    public static void main(String[] args) {
        //Declaración de las variables
        int num;
        int dm, um, c, d, u;
              
        //Método por teclado
        Scanner entrada = new Scanner(System.in);
        //Ingreso por teclado
        System.out.println("Introduzca un número entre 0 y 99.999: ");
        num = entrada.nextInt();
        //Unidad
        u = num % 10;
        num = num / 10;
        //Decenas
        d = num % 10;
        num = num / 10;
        //Centenas
        c = num % 10;
        num = num / 10;
        //Unidades de millar
        um = num % 10;
        num = num / 10;
        //Decenas de millar
        dm = num;
        //El número será capicúa si las cifras son iguales por los dos extremos
        //Las centenas no las tenemos en cuenta
        if(dm == u && um ==d){
            System.out.println("El número es capicúa");
        }
        else{
            System.out.println("El número no es capicúa");
        }
                
    }
}

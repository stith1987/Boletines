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
/*12. Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.*/
//Libreria
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        //Declaración de las variables
        int numero = 0;
        int unidades = 0, decenas = 0, centenas =0, unidadesMil = 0, decenasMil = 0;
        //Método por teclado
        Scanner entrada = new Scanner(System.in);
        //Ingreso por teclado
        System.out.println("Ingrese el número: ");
        numero = entrada.nextInt();
        //Proceso
        if (numero != 0) {
            unidades = numero % 10;
            numero = numero / 10;
            decenas = numero % 10;
            numero = numero / 10;
            centenas = numero % 10;
            numero = numero / 10;
            unidadesMil = numero % 10;
            numero = numero / 10;
            decenas = numero % 10;
            numero = numero / 10;
            System.out.println(unidades + " " + decenas + " " + centenas + " " + unidadesMil + " " + decenasMil);
        }
        else{
            System.out.println("El número ingresado es 0");
        }
        
    }
}

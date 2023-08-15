/** *************************************************************************
 *                      ENTRADA Y SALIDA POR CONSOLA
 ************************************************************************* */
package com.bryanhdezl.entradasalidaconsola;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class EntradaSalidaConsola {

    public static void main(String[] args) {
        // Metodo para la entrada de datos.
        Scanner entrada = new Scanner(System.in);

        // Variables.
        int entero;
        float flotante;
        char caracter;
        String cadena;

        // Valores enteros.
        System.out.print("Digite un numero entero: ");
        entero = entrada.nextInt();
        System.out.println("Numero entero capturado: " + entero);

        // Valor flotante
        System.out.print("Digite un numero flotante: ");
        flotante = entrada.nextFloat();
        System.out.println("Numero flotante capturado: " + flotante);

        // Valor char
        System.out.print("Digite un caracter: ");
        caracter = entrada.next().charAt(0);
        System.out.println("Caracter capturado: " + caracter);

        // Valor cadena (Primer palabra)
        System.out.print("Digite una cadena: ");
        cadena = entrada.next();
        System.out.println("Cadena capturada: " + cadena);
        
        // Valor cadena
        System.out.print("Digite una cadena: ");
        cadena = entrada.nextLine();
        System.out.println("Cadena capturada: " + cadena);
    }
}

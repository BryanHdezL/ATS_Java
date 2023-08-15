/** *************************************************************************
 *                            OPERADORES
 ************************************************************************* */
package com.bryanhdezl.operadores;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class Operadores {

    public static void main(String[] args) {
        // Metodo para la entrada de datos.
        Scanner entrada = new Scanner(System.in);
        // Variables. 
        float numero1, numero2, suma, resta, mult, div, modulo;
        // Leemos los numeros.
        System.out.println("Digite 2 numeros: ");
        numero1 = entrada.nextFloat();
        numero2 = entrada.nextFloat();
        // Operaciones.
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        mult = numero1 * numero2;
        div = numero1 / numero2;
        modulo = numero1 % numero2;
        // Mostramos los resultados.
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + mult);
        System.out.println("Division: " + div);
        System.out.println("Modulo: " + modulo);
    }
}

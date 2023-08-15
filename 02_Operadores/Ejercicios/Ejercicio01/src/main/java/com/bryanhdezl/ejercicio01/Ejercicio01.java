/** **************************************************************************
 *                                  EJERCICIO #1
 *
 * Hacer un programa que calcule e imprima la suma de tres calificaciones.
 ************************************************************************** */
package com.bryanhdezl.ejercicio01;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        // Metodo para leer por consola.
        Scanner entrada = new Scanner(System.in);
        // Variables.
        float cal1, cal2, cal3;
        //Leemos las calificaciones.
        System.out.print("Calificacion #1: ");
        cal1 = entrada.nextFloat();
        System.out.print("Calificacion #2: ");
        cal2 = entrada.nextFloat();
        System.out.print("Calificacion #3: ");
        cal3 = entrada.nextFloat();
        // Mostramos el resultado.
        System.out.println("Resultado: " + (cal1 + cal2 + cal3));
    }
}

/** **************************************************************************
 *                                EJERCICIO #2
 *
 * Hacer un programa que calcule e imprima el salario semanal de un empleado
 * a partir de sus horas semanales trabajadas y de su salario por hora.
 ************************************************************************** */
package com.bryanhdezl.ejercicio02;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        // Meotodo para leer por consola.
        Scanner entrada = new Scanner(System.in);
        // Variables.
        float salario, horas;
        // Leemos los datos requeridos.
        System.out.print("Horas semanales: ");
        horas = entrada.nextFloat();
        System.out.print("Salario por hora: ");
        salario = entrada.nextFloat();
        // Mostrar el resultado.
        System.out.println("Salario: $" + (horas * salario));
    }
}

/** *************************************************************************
 *                             DATOS NO PRIMITIVOS
 *
 * NULL: Espacio de memoria vacio, no almacena nada.
 *
 * DATOS NO PRIMITIVOS: Valores con los que se pueden inicializar en NULL
 *                      y tienen metodos, estos son utilizados en POO.
 *
 * STRING: Dato no primitivo que consta de un conjuto de caracteres
 *         concatenado uno tras otro
 *
 ************************************************************************* */

package com.bryanhdezl.datosnoprimitivos;

/**
 *
 * @author bryan
 */
public class DatosNoPrimitivos {

    public static void main(String[] args) {
        // Variables enteras.
        Integer entero = 10;
        // Variables de cadenas.
        String cadena = "Hola, soy Bryan.";
        // Mostramos los valores de las variables.
        System.out.println("Variable INTEGER: " + entero);
        System.out.println("Variable STRING: " + cadena);
    }
}

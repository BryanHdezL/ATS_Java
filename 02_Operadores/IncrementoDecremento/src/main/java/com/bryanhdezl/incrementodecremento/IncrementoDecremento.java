/** *************************************************************************
 *                      INCREMENTO Y DECREMENTO
 ************************************************************************* */
package com.bryanhdezl.incrementodecremento;

/**
 *
 * @author bryan
 */
public class IncrementoDecremento {

    public static void main(String[] args) {
        // Variables.
        int x = 5, y;

        // Incremento   ->  ++
        // Decremento   ->  --
        
        // Operacion para comprender el funcionamiento.
        y = x++;

        // Mostramos el valor de las variables.
        System.out.println("Valor de Y: " + y);
        System.out.println("Valor de X: " + x);
    }
}

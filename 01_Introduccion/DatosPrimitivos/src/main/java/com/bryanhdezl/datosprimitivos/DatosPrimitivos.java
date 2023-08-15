/** *************************************************************************
 *                              DATOS PRIMITIVOS
 *
 * Variable: Espacio de memoria donde se almacena un valor.
 *
 * LONG     64 bits     -9,233,372,036,854,775,808 a 9,223,372,854,775,807
 * INT      32 bits     -2,147,483,648 a 2,147,438,647
 * SHORT    16 bits     -32,768 a 32,767
 * BYTE     8  bits     -128 a 127
 *
 * DOUBLE   64 bits     4.9e-324 a 1.8e+308
 * FLOAT    32 bits     1.4e-045 a 3.4e+038
 *
 * CHAR     16 bits     [A-Z] , [a-z] , [0-9] y especiales
 *
 * BOOLEAN  1 bit       True / False
 ************************************************************************* */

package com.bryanhdezl.datosprimitivos;

/**
 *
 * @author bryan
 */
public class DatosPrimitivos {

    public static void main(String[] args) {
        // Variables Enteras.
        byte entero1 = 125;
        short entero2 = 30125;
        int entero3 = 2147000000;
        long entero4 = 820015924;
        // Variables reales o flotantes.
        double real1 = -44891.50;
        float real2 = -1485315459.50f;  // Siempre se agrega una f al final.
        // Variables caracteres.
        char caracter = 'a';
        // Variables booleanas.
        boolean decision = true;
        // Mostramos los valores de las variables.
        System.out.println("Variable BYTE: " + entero1);
        System.out.println("Variable SHORT: " + entero2);
        System.out.println("Variable INT: " + entero3);
        System.out.println("Variable LONG: " + entero4);
        System.out.println("Variable DOUBLE: " + real1);
        System.out.println("Variable FLOAT: " + real2);
        System.out.println("Variable CHAR: " + caracter);
        System.out.println("Variable BOOLEAN: " + decision);
    }
}

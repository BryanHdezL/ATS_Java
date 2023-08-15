/** *************************************************************************
 *                              CLASE MATH
 ************************************************************************* */
package com.bryanhdezl.clasemath;

/**
 *
 * @author bryan
 */
public class ClaseMath {

    public static void main(String[] args) {

        // Raiz cuadrada
        double numero = 169;
        double raiz = Math.sqrt(numero);
        System.out.println("Raiz Cuadrada: " + raiz);

        // Potencia
        double base = 5, exponente = 2;
        double potencia = Math.pow(base, exponente);
        System.out.println("Potencia: " + potencia);

        // Redondeo
        double decimal = 4.56;
        long entero = Math.round(decimal);
        System.out.println("Redondeo: " + entero);

        // Aleatorio sin limites
        double random = Math.random();
        System.out.println("Random: " + random);

        // Aleatorio con limites
        double limInf = 0.0, limSup = 5.0;
        double aleatorio = limInf + Math.random() * (limSup - limInf);
        System.out.println("Aleatorio: " + aleatorio);
    }
}

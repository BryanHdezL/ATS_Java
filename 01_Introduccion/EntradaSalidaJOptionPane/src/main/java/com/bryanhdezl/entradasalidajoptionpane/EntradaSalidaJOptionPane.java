/** *************************************************************************
 *                   ENTRADA Y SALIDA POR JOPTIONPANE
 ************************************************************************* */
package com.bryanhdezl.entradasalidajoptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author bryan
 */
public class EntradaSalidaJOptionPane {

    public static void main(String[] args) {
        // Variables.
        int entero;
        double decimal;
        char caracter;
        String cadena;

        // Solicitamos valores.
        entero = Integer.parseInt(JOptionPane.showInputDialog("Captura un numero entero: "));
        decimal = Float.parseFloat(JOptionPane.showInputDialog("Captura un numero decimal: "));
        caracter = JOptionPane.showInputDialog("Captura un carcater: ").charAt(0);
        cadena = JOptionPane.showInputDialog("Captura una cadena: ");

        // Mostramos valores capturados.
        JOptionPane.showMessageDialog(null, "El numero entero capturado es: " + entero);
        JOptionPane.showMessageDialog(null, "El numero decimal capturado es: " + decimal);
        JOptionPane.showMessageDialog(null, "El caracter capturado es: " + caracter);
        JOptionPane.showMessageDialog(null, "La cadena capturada es: " + cadena);
    }
}

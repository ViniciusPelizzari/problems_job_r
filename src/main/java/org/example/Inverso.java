package org.example;

/**
 * @@author Vinícius Pelizzari
 */
public class Inverso {
    public static void Invertendo() {

        Fibonacci.imprimmir("Digite a string que deseja inverter: ");
        String natural = Fibonacci.s.next();

        String modificada = "";

        for (int i = natural.length() - 1; i >= 0; i--) {
            modificada += natural.charAt(i);
        }

        Fibonacci.imprimmir("String natural: " + natural);
        Fibonacci.imprimmir("String modificada: " + modificada + "\n");
    }

}

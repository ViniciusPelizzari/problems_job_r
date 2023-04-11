package org.example;

import java.util.Scanner;

/**
 * @@author Vinícius Pelizzari
 */
public class Fibonacci {
    static Scanner s = new Scanner(System.in);

    public static void imprimmir(String frase){
        System.out.println(frase);
    }

    public static void Fibon() {

        System.out.print("Digite o número para verificar: ");
        int num = s.nextInt();
        int sFibon[] = new int[num];

        sFibon[0] = 0;
        sFibon[1] = 1;
        for (int i = 2; i < num; i++) {
            sFibon[i] = sFibon[i - 1] + sFibon[i - 2];
        }

        boolean verif = false;
        for (int i = 0; i < sFibon.length; i++) {
            if (sFibon[i] == num) {
                verif = true;
                imprimmir("Você está de parabéns, foi possível encontrar este número na sequência.");
                imprimmir("A sequência formada foi: ");
                for (int j = 0; j <= i; j++) {
                    System.out.print(sFibon[j] + " \n");
                }
                break;
            }
        }
        if(!verif) {
            imprimmir("Não foi possível encontrar este número na sequência.\n");
        }

    }
}

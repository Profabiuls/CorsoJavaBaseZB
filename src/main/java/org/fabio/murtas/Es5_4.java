package org.fabio.murtas;

import java.util.Scanner;

public class Es5_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci l'esponente");
        int esponente = Integer.parseInt(in.nextLine());
        System.out.println("Inserisci il primo addendo");
        int addendo1 = Integer.parseInt(in.nextLine());
        System.out.println("Inserisci il secondo addendo");
        int addendo2 = Integer.parseInt(in.nextLine());
        double c = sommaEsponenziale(addendo1, addendo2, esponente);
        checkFermat(addendo1, addendo2, c, esponente);
    }

    public static void checkFermat(int a, int b, double c, int n) {
        if (n > 2 && sommaEsponenziale(a, b, n) == c) {
            System.out.println("Santo cielo, Fermat aveva torto");
        } else {
            System.out.println("No non funziona!");
        }
    }

    public static double sommaEsponenziale(int a, int b, int n) {
        return Math.pow(a, n) + Math.pow(b, n);
    }
}
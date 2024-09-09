package org.fabio.murtas;

import java.util.Scanner;

//converti in formato orario usando printf
public class Es3_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sec = 0;
        System.out.println("Inserisci i secondi da convertire : ");
        sec = Integer.parseInt(in.nextLine());
        System.out.println("I secondi in formato orario sono : " + convertiInFormatoOrario(sec));
    }

    public static String convertiInFormatoOrario(int secondi) {
        // Calcola ore, minuti e secondi
        int ore = secondi / 3600;
        int minuti = (secondi % 3600) / 60;
        int secondiRimanenti = secondi % 60;

        // Format stringa nel formato "ore:minuti:secondi"
        return String.format("%02d:%02d:%02d", ore, minuti, secondiRimanenti);
    }
}

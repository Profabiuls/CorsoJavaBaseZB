package org.fabio.murtas;

import java.time.LocalTime;

public class Es2_3 {
    public static void main(String[] args) {
        //cambiare i parametri a piacere
        LocalTime oraCorrente = LocalTime.now();
        int hour = oraCorrente.getHour();
        int minute = oraCorrente.getMinute();
        int second = oraCorrente.getSecond();

        System.out.println("Ora corrente: " + hour + ":" + minute + ":" + second);

        int risultato = visualizzaSecondiRimanentiGiorno(hour, minute, second);

        System.out.println("Secondi rimanenti nel giorno: " + risultato);

        double percentualeTrascorsa = calcolaPercentualeGiornoTrascorso(hour, minute, second);

        System.out.println("Percentuale del giorno trascorso: " + percentualeTrascorsa + "%");


        // Ora d'inizio dell'esercizio (simulata qui)
        LocalTime inizioEsercizio = LocalTime.of(15, 0, 0); // Modifica questa ora per riflettere l'inizio reale

        // Calcola il tempo trascorso
        int secondiTrascorsi = calcolaSecondiTrascorsi(inizioEsercizio, oraCorrente);
        System.out.println("Tempo trascorso (in secondi): " + secondiTrascorsi);

        // Usa il metodo per convertire i secondi in formato orario
        String orarioFormattato = convertiInFormatoOrario(secondiTrascorsi);
        System.out.println("Tempo trascorso in formato orario: " + orarioFormattato);
    }

    public static int visualizzaSecondiRimanentiGiorno(int hour, int minute, int second) {
        int secondiInUnGiorno = 24 * 60 * 60; // 24 ore in secondi
        int secondiPassati = (hour * 60 * 60) + (minute * 60) + second; // calcolo i secondi trascorsi

        return secondiInUnGiorno - secondiPassati;
    }

    public static double calcolaPercentualeGiornoTrascorso(int hour, int minute, int second) {
        int secondiInUnGiorno = 24 * 60 * 60; // 24 ore in secondi
        int secondiPassati = (hour * 60 * 60) + (minute * 60) + second; // calcolo i secondi trascorsi

        // Calcolo la percentuale
        return (double) secondiPassati / secondiInUnGiorno * 100;
    }

    // Metodo per calcolare il tempo trascorso in secondi
    public static int calcolaSecondiTrascorsi(LocalTime inizio, LocalTime fine) {
        int secondiInizio = inizio.toSecondOfDay();
        int secondiFine = fine.toSecondOfDay();
        return secondiFine - secondiInizio;
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

package org.fabio.murtas;
// Gioco indovina il numero
import java.util.Random;
import java.util.Scanner;

public class Es5_7 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Creazione di un oggetto Random per generare un numero casuale
        Random random = new Random();
        int numeroDaIndovinare = random.nextInt(100) + 1;

        System.out.println("Sto pensando a un numero tra 1 e 100 (inclusi). Riesci a indovinare qual è?");

        // Chiamata al metodo iniziale
        iniziaGioco(numeroDaIndovinare);

        scanner.close();
    }

    // Metodo iniziale che avvia il gioco
    public static void iniziaGioco(int numeroDaIndovinare) {
        System.out.print("Inserisci un numero: ");
        int numeroUtente = scanner.nextInt();
        indovinaNumero(numeroUtente, numeroDaIndovinare);
    }

    // Metodo ricorsivo che gestisce la logica del gioco
    public static void indovinaNumero(int numeroUtente, int numeroDaIndovinare) {
        if (numeroUtente == numeroDaIndovinare) {
            System.out.println("Hai indovinato !!! Complimenti!!!");
            return;
        } else if (numeroUtente < numeroDaIndovinare) {
            System.out.println("Il numero è troppo basso! Prova con un numero più alto.");
        } else {
            System.out.println("Il numero è troppo alto! Prova con un numero più basso.");
        }

        // Chiede un nuovo numero e richiama se stesso (ricorsione)
        System.out.print("Inserisci un altro numero: ");
        numeroUtente = scanner.nextInt();
        indovinaNumero(numeroUtente, numeroDaIndovinare);
    }
}

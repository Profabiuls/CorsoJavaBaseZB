package org.fabio.murtas;
// Gioco indovina il numero
import java.util.Random;
import java.util.Scanner;

public class Es3_4 {
    public static void main(String[] args) {
        // Creazione di un oggetto Random per generare un numero casuale
        Random random = new Random();
        int numeroDaIndovinare = random.nextInt(100) + 1; // Genera un numero tra 1 e 100

        // Creazione di uno Scanner per leggere l'input dell'utente
        Scanner scanner = new Scanner(System.in);

        // Messaggio iniziale
        System.out.println("Sto pensando a un numero tra 1 e 100 (inclusi). Riesci a indovinare qual è?");

        // Lettura del numero inserito dall'utente
        System.out.print("Inserisci un numero: ");
        int numeroUtente = scanner.nextInt();

        // Output del numero inserito dall'utente
        System.out.println("Il tuo numero è: " + numeroUtente);

        if (numeroUtente == numeroDaIndovinare) {
            System.out.println("Hai indovinato !!! Complimenti!!!");

            // Output del numero generato dal programma
            System.out.println("Il numero che stavo pensando era: " + numeroDaIndovinare);
        } else {
            // Output del numero generato dal programma
            System.out.println("Il numero che stavo pensando era: " + numeroDaIndovinare);

            // Calcolo della differenza tra il numero dell'utente e quello da indovinare
            int differenza = Math.abs(numeroUtente - numeroDaIndovinare);
            System.out.println("Ti sei sbagliato di: " + differenza);
        }
    }
}

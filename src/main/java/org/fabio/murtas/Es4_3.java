package org.fabio.murtas;

import java.util.Scanner;
//stampa usando i metodi i vari formati di data, americana ed europea
public class Es4_3 {


    public static void main(String[] args) {
        String day = "";
        int date = 0; // giorno della settimana
        int month = 0;
        int year = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci il giorno in lettere");
        day = in.nextLine();
        System.out.println("Inserisci il numero del giorno");
        date = Integer.parseInt(in.nextLine());
        System.out.println("Inserisci il numero del mese");
        month = Integer.parseInt(in.nextLine());
        System.out.println("Inserisci il numero dell' anno");
        year = Integer.parseInt(in.nextLine());
        printAmerican(day, month, date, year);
        printEuropean(day, date, month, year);
    }

    public static void printAmerican(String day, int month, int date, int year) {
        System.out.println("La data americana è : " + day + "/" + date + "/" + month + "/" + year);
    }

    public static void printEuropean(String day, int date, int month, int year) {
        System.out.println("La data europea è : " + day + "/" + month + "/" + date + "/" + year);
    }


}

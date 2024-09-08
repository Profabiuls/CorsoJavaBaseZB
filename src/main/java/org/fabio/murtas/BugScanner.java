package org.fabio.murtas;

import java.util.Scanner;

public class BugScanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = "";
        int age = 0;

        System.out.println("Inserisci la tua età : ");
        age = in.nextInt();
        in.nextLine(); //se si commenta questa linea il programma non assegnerà il valore a name..
        System.out.println("Inserisci il tuo nome : ");
        name = in.nextLine();
        System.out.printf("Hello %s, age %d\n", name, age);

    }
}

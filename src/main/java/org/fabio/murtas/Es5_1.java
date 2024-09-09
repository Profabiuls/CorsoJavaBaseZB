package org.fabio.murtas;
//verifica con metodo condizionale
import java.util.Scanner;

public class Es5_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        System.out.println("Inserisci un numero");
        x = Integer.parseInt(in.nextLine());
        if (x > 0 && x < 10) {
            System.out.println("Positive single digit number.");
        }
    }

}

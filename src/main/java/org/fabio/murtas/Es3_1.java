package org.fabio.murtas;
/*
* verifico errore scambio variabili per format specifier*/
public class Es3_1 {

    public static void main(String[] args) {
        int intero = 10;
        double doub = 15.2;
        System.out.printf("%.2f %d", intero, doub);//istruzione scorretta
        //   System.out.printf("%.2f %d",doub,intero); istruzione corretta
    }
}

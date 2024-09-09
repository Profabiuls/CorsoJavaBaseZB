package org.fabio.murtas;

/*
 * il metodo ping stampa '.'
 * il metodo baffle stampa 'wug' poi chiama ping che stampa '.'
 * il metodo zoop chiama baffle che stampa prima 'wug' poi '.' con il metodo ping poi attraverso
 * il system stampa 'Yuo wugga' e poi richiama baffle quindi stampa di nuovo 'wug' poi '.'
 * il main spampa attraverso il System ?No, I' poi chiama prima zoop che stampa come detto 'wug' poi '.'
 *  poi stampa attraverso system 'You wugga' e chiama baffle che stampa come sopra 'wug' poi '.' poi
 * con system stampa 'I 'e richiama baffle ancora
 *
 * */

public class Es4_1 {
    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }

}

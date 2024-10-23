package org.fabio.murtas;

public class Es5_6 {
    public static class Buzz {
        public static void baffle(String blimp) {
            System.out.println(blimp);         // 4
            zippo("ping", -5);                 // 5
        }

        public static void zippo(String quince, int flag) {
            if (flag < 0) {                    // 6
                System.out.println(quince + " zoop");  // 7
            } else {
                System.out.println("ik");       // 2
                baffle(quince);                 // 3
                System.out.println("boo-wa-ha-ha");  // 8
            }
        }

        public static void main(String[] args) {
            zippo("rattle", 13);               // 1
        }
    }
}

/*
* Il valore del parametro blimp quando baffle viene invocato è "rattle".
L'output del programma è:
ik
rattle
ping zoop
boo-wa-ha-ha
*
Spiegazione del flusso:
Il programma inizia con zippo("rattle", 13)
Poiché flag (13) è > 0, stampa "ik"
Chiama baffle con "rattle"
baffle stampa "rattle"
baffle chiama zippo("ping", -5)
Poiché flag (-5) è < 0, stampa "ping zoop"
Torna al primo zippo e stampa "boo-wa-ha-ha"
* */

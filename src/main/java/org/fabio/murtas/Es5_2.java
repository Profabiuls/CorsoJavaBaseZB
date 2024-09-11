package org.fabio.murtas;

public class Es5_2 {
    public static void zoop(String fred, int bob) {
        System.out.println(fred);
        if (bob == 5) {
            ping("not ");
        } else {
            System.out.println("!");
        }
    }

    public static void main(String[] args) {
        int bizz = 5;
        int buzz = 2;
        zoop("just for", bizz);
        clink(2 * buzz);
    }

    public static void clink(int fork) {
        System.out.print("It's ");
        zoop("breakfast", fork);
    }

    public static void ping(String strangStrung) {
        System.out.println("any " + strangStrung + "more ");
    }

}
//l'output è 'just for \n any not more \n It's Breakfast \n!
// Ping non viene chiamato una seconda volta solo una

/*
+-----------------------------+
| zoop("just for", 5)         | <-- 1
+-----------------------------+
| ping("not")                 | <-- 2
+-----------------------------+
| clink(4)                    | <-- 3
+-----------------------------+
| zoop("Breakfast,4)          | <-- 4
+-----------------------------+


* */
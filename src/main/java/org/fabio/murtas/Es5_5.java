package org.fabio.murtas;
// metodo ricorsivo per la canzone '99 bottles of beer
public class Es5_5 {

    public static void main(String[] args) {
        sing(99);
    }

    public static void sing(int numBottles) {
        if (numBottles == 0) {
            System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
            System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
        } else {
            System.out.println(numBottles + " bottles of beer on the wall, " + numBottles + " bottles of beer.");
            System.out.println("Take one down and pass it around, " + (numBottles - 1) + " bottles of beer on the wall.");
            System.out.println("");
            sing(numBottles - 1);
        }
    }
}

package org.fabio.murtas;

public class Es5_3 {
    public static void main(String[] args) {
        nLines(10);
    }

    public static void nLines(int n) {
        if (n > 0) {
            System.out.println(n);
            nLines(n - 1);
        }
    }
}
/*
* +-----------------------------+
| nLines(4)                     |
* print 4                       | <-- 1
+-------------------------------+
| nLines(3)                     |
* print 3                       | <-- 2
+-------------------------------+
| nLines(2)                     |
* print 2                       | <-- 3
+-------------------------------+
| nLines(1)                     |
* print 1                       | <-- 4
+-------------------------------+


* */
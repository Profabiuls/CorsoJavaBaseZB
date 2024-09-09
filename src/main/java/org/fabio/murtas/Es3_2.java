package org.fabio.murtas;

import java.util.Scanner;

// convertitore Celsius / Fahrenheit
public class Es3_2 {
    public static void main(String[] args) {
        double valoreDaConvertire = 0;
        double risultatoFahrenheit = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci il valore in Celsius da convertire : ");
        valoreDaConvertire = Double.parseDouble(in.nextLine());
        risultatoFahrenheit = convertiGradiCF(valoreDaConvertire);
        System.out.println("Il valore in Fahrenheit è : " + risultatoFahrenheit);
    }

    public static double convertiGradiCF(double num) {
        return num * (9.0 / 5.0) + 32;
    }

}

package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class conversaoTemperatura {
    public static double celsius;

    public static DecimalFormat df = new DecimalFormat("##,###,##0.00");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o valor do Celsius (°C): ");
        celsius = sc.nextDouble();

        double k = kelvin(celsius);
        double f = fahrenheit(celsius);
        double re = reaumur(celsius);
        double ra = rankine(celsius);

        conversaoTemperatura converTemp = new conversaoTemperatura();
        converTemp.conversao(k, f, re, ra);
    }

    public static void conversao (double kelvin, double fahrenheit, double reaumur, double rankine){
        System.out.println("---------------------------------------------------------------");
        System.out.println("O valor em Kelvin (°K) é: " + df.format(kelvin));
        System.out.println("O valor em Fahrenheit (°F) é: " + df.format(fahrenheit));
        System.out.println("O valor em Réaumur (°Re) é: " + df.format(reaumur));
        System.out.println("O valor em Rankine (°Ra) é: " + df.format(rankine));
        System.out.println("---------------------------------------------------------------");
    }

    public static double kelvin (double valorC){
        double k = valorC + 273.15;
        return k;
    }

    public static double fahrenheit (double valorF){
        double f = valorF * 1.8 + 32;
        return f;
    }

    public static double reaumur (double valorRe){
        double re = valorRe * 0.8;
        return re;
    }

    public static double rankine (double valorRa){
        double ra = valorRa * 1.8 + 32 + 459.67;
        return ra;
    }


}

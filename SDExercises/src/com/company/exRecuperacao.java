package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exRecuperacao {

    public static void main (String[] args) {

        DecimalFormat df = new DecimalFormat("##,###,##0.00");

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a localização do primeiro ponto: ");
        double x1 = sc.nextDouble();

        System.out.print("Entre com a localização do segundo ponto: ");
        double x2 = sc.nextDouble();

        System.out.print("Entre com a localização do terceiro ponto: ");
        double y1 = sc.nextDouble();

        System.out.print("Entre com a localização do quarto ponto: ");
        double y2 = sc.nextDouble();

        //double d = calcD(d,x1,x2,y1,y2);

        //System.out.print("A distância entre os pontos é de: " +df.format(d)+ " m.");
    }

    public static double calcD (double d, double x1, double x2, double y1, double y2) {
        //double d;
        d = Math.sqrt (Math.pow(x2-x1,2) + Math.pow(y2 - y1,2));
        return d;
    }
}

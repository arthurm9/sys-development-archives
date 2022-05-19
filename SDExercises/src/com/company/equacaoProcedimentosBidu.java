package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class equacaoProcedimentosBidu {

    public static DecimalFormat df = new DecimalFormat("##,###,##0.00");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.println("Informe o valor de A: ");
        a = sc.nextDouble();

        System.out.println("Informe o valor de B: ");
        b = sc.nextDouble();

        System.out.println("Informe o valor de C: ");
        c = sc.nextDouble();

        calcularDelta(a, b, c);
    }

    private static void calcularDelta (double a, double b, double c) {
        double delta = (Math.pow(b,2) - (4 * a * c));
        if (delta >= 0){
            calcularX1(delta,a, b);
            calcularX2(delta,a, b);
        } else {
            System.out.println("Não existem raízes reais!");
        }
    }

    private static void calcularX1(double delta, double a, double b){
        double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
        imprimirX1(x1);
    }

    public static void imprimirX1 (double x1){
        System.out.println("X1 -> " + df.format(x1));
    }

    public static void imprimirX2 (double x2){
        System.out.println("X2 -> " + df.format(x2));
    }

    private static void calcularX2(double delta, double a, double b){
        double x1 = ((-b) - Math.sqrt(delta)) / (2 * a);
        imprimirX2(x1);
    }
}

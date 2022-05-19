package br.com.arthur;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    /* Elabore um programa onde o usuário informa os dados de dois triângulos. Calcular o valor das áreas de cada triângulo.
	    Fórmula de Heron: área = raiz quadrada (p x (p - a) x (p - b) x (p - c)) onde p = (a + b + c)/2
	     */
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.0000");

        double xa, xb, xc, ya, yb, yc;

        System.out.println("Informe os valores do Triângulo x: ");
        xa = sc.nextDouble();
        xb = sc.nextDouble();
        xc = sc.nextDouble();

        System.out.println("Informe os valores do Triângulo y: ");
        ya = sc.nextDouble();
        yb = sc.nextDouble();
        yc = sc.nextDouble();

        double p = (xa + xb + xc)/2;
        double areax = Math.sqrt(p * (p - xa) * (p - xb) * (p - xc));

        p = (ya + yb + yc)/2;
        double areay = Math.sqrt(p * (p - ya) * (p - yb) * (p - yc));

        System.out.println("Área do triângulo X: " +areax);
        System.out.println("Área do triângulo Y: " +areay);

    }
}

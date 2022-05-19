package com.company;

import java.text.DecimalFormat;
import  java.util.Scanner;

public class ex2equacao {
    public static void main(String[] args) {
        // Instanciamento da classe Scanner
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##,###,##0.00");

        // Definição de variáveis
        double a, b, c;
        double delta;
        double x1, x2;

        // Entrada de dados
        System.out.print("Entre com o valor de 'a': ");
        a = sc.nextDouble();
        System.out.print("Entre com o valor de 'b': ");
        b = sc.nextDouble();
        System.out.print("Entre com o valor de 'c': ");
        c = sc.nextDouble();

        delta = (Math.pow(b, 2) - (4 * a * c));

        // Estabelecimento de condição

        if (delta >= 0) {
            x1 = ((-b + (Math.sqrt(delta))) / (2 * a));

            x2 = ((-b - (Math.sqrt(delta))) / (2 * a));

            System.out.println("O valor de delta é: " + delta);
            System.out.println("O valor de x' é: " + df.format(x1));
            System.out.println("O valor de x'' é: " + df.format(x2));

        } else {
            System.out.println("O valor de delta é negativo ou inválido, não existem raízes reais.");
        }
    }
}

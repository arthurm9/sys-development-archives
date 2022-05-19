package com.company;

import java.util.Scanner;

public class soma0803 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a, b;

        System.out.println("Informe o primeiro número: ");
        a = sc.nextDouble(); // Será mandado para dentro do método calcularSoma.
        System.out.println("Informe o segundo número: ");
        b = sc.nextDouble(); // Será mandado para dentro do método calcularSoma.

        calcularSoma (a, b); // o método calcularSoma será executado em cima dos valores inseridos (a,b).

        sc.close(); // Finaliza o Scanner.
    }

    public static void calcularSoma (double a, double b){
        double soma = a + b;
        imprimirValores(soma); // Armazena os dados da soma dentro do método imprimirValores;
    }

    public static void imprimirValores (double valor) { // Esse método recebe um parâmetro "valor" que após o calculo, recebe o resultado.
        System.out.println("O valor da soma é: " +valor+ "."); // Exibe o valor que contém o resultado da soma que está armazenado no
                                                               // parâmetro imprimirValores.
    }
}


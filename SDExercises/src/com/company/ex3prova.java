package com.company;

import java.util.Scanner;

public class ex3prova {
    /*
        3)	Um banco concederá um crédito especial aos seus clientes, variável com o saldo médio no último ano. Faça um algoritmo que leia o saldo médio de um cliente
        e calcule o valor do crédito de acordo com a tabela abaixo. Mostre uma mensagem informando o saldo médio e o valor do crédito.

        Saldo médio             Percentual
        de 0 a 200          nenhum crédito
        de 201 a 400      20% do valor do saldo médio
        de 401 a 600      30% do valor do saldo médio
        acima de 601      40% do valor do saldo médio

    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nCÁLCULO DE SALDO");
        System.out.println("-----------------------------------------");
        System.out.print("Insira o saldo médio do cliente: ");
        double sM = sc.nextDouble();

        System.out.println("-----------------------------------------");
        System.out.println("O saldo médio do cliente é: " +sM);

        ex3prova exibir = new ex3prova();
        exibir.valorCredito(sM);
    }

    public static void valorCredito (double sM){
        double c1 = 0;
        double c2 = 20;
        double c3 = 30;
        double c4 = 40;

        double sF;

        if (sM <=200) {
            sF = (c1/100) * sM;
            System.out.println("O valor do crédito do cliente é: " +sF);
        } else if (sM >= 201 && sM <= 400){
            sF = (c2/100) * sM;
            System.out.println("O valor do crédito do cliente é: " +sF);
        } else if (sM >= 401 && sM <= 600){
            sF = (c3/100) * sM;
            System.out.println("O valor do crédito do cliente é: " +sF);
        } else if (sM >= 601){
            sF = (c4/100) * sM;
            System.out.println("O valor do crédito do cliente é: " +sF);
        } else {
            System.out.println("Valor Inválido!");
        }

        System.out.println("Encerrando...");
    }
}

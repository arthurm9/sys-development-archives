package br.com.arthur;

import java.text.DecimalFormat;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("##,##0.00");
        Scanner sc = new Scanner(System.in);

        Dados executar = new Dados();

        System.out.print("Entre com o peso (kg): ");
        double peso1 = sc.nextDouble();
        executar.peso = peso1;
        System.out.print("Entre com a altura (m): ");
        double altura1 = sc.nextDouble();
        executar.altura = altura1;

        executar.calculoImc();
        executar.imprimir();


    }
}

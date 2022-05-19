package com.company;

import java.util.Scanner;

public class ex1prova {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double ht, vh;
        double pd;

        System.out.println("\nCÁLCULO DE SALÁRIO");
        System.out.println("-----------------------------------------");
        System.out.print("Entre com o total de horas trabalhadas: ");
        ht = sc.nextDouble();

        System.out.print("Entre com o valor da hora trabalhada: ");
        vh = sc.nextDouble();

        System.out.print("Entre com o percentual de desconto: ");
        pd = sc.nextDouble();

        System.out.println("-----------------------------------------");

        double sb = salarioBruto(ht, vh);
        double td = desconto(pd, sb);
        double sl = salarioLiquido(sb,td);

        ex1prova exibir = new ex1prova();
        exibir.exibirValores(ht,sb,td,sl);

    }

    public static double salarioBruto (double ht, double vh){
        double sb = ht * vh;
        return sb;
    }

    public static double desconto (double pd, double sb) {
        double td = (pd/100)*sb;
        return td;
    }

    public static double salarioLiquido (double sb, double td){
        double sl = sb - td;
        return sl;
    }

    public static void exibirValores (double ht, double sb, double td, double sl){
        System.out.println("Horas trabalhadas: "+ ht);
        System.out.println("Salário bruto: " + sb);
        System.out.println("Desconto: " + td);
        System.out.println("Salário Líquido: " + sl);

        System.out.println("\nEncerrando...");
    }

}

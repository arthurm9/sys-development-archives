package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex2prova {
    /* 2)	Considere que o último concurso vestibular apresentou três provas: Português,
            Matemática e Conhecimentos Gerais. Considerando que para cada candidato
            tem-se um registro contendo o seu nome e as notas obtidas em cada uma das
            provas, construa um algoritmo que forneça:
            a) o nome e as notas em cada prova do candidato
            b) a média do candidato
            c) uma informação dizendo se o candidato foi aprovado ou não. Considere que um candidato é aprovado se sua média for maior que 7.0 e se não apresentou
            nenhuma nota abaixo de 5.0. */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;
        double nP, nM, nCG;

        System.out.println("\nCÁLCULO DE NOTAS");
        System.out.println("-----------------------------------------");
        System.out.print("Insira o nome do aluno: ");
        nome = sc.next();

        System.out.print("Insira a nota referente à disciplina de Português: ");
        nP = sc.nextDouble();

        System.out.print("Insira a nota referente à disciplina de Matemática: ");
        nM = sc.nextDouble();

        System.out.print("Insira a nota referente à disciplina de Conhecimentos Gerais: ");
        nCG = sc.nextDouble();

        System.out.println("-----------------------------------------");

        double media = calcMedia(nP, nM, nCG);

        ex2prova exibir = new ex2prova();
        exibir.exibicao(nome, media, nP, nM, nCG);

    }

    public static double calcMedia (double nP, double nM, double nCG){
        double media = (nP + nM + nCG) /3;
        return media;
    }
    public static void exibicao (String nome, double media, double nP, double nM, double nCG) {
        DecimalFormat df = new DecimalFormat("##,###,##0.00");

            if (media >= 7) {
                System.out.println("O candidato " + nome + " foi APROVADO!");
                System.out.println("-----------------------------------------");
                System.out.println("Nota de Português: " + nP);
                System.out.println("Nota de Matemática: " + nM);
                System.out.println("Nota de Conhecimentos Gerais: " + nCG);
                System.out.println("Média das notas: " + df.format(media));
            } else if (media < 7 || nP < 5 || nM < 5 || nCG < 5){
                System.out.println("O candidato " + nome + " NÃO foi APROVADO!");
                System.out.println("-----------------------------------------");
                System.out.println("Nota de Português: " + nP);
                System.out.println("Nota de Matemática: " + nM);
                System.out.println("Nota de Conhecimentos Gerais: " + nCG);
                System.out.println("Média das notas: " + df.format(media));
            }

        System.out.println("\nEncerrando...");
    }
}

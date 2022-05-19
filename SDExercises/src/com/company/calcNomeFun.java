package com.company;

import java.util.Scanner;

public class calcNomeFun {
    double resultado = 0;
    // String final.
    public void soma ( double n1, double n2){
        resultado = n1 + n2;
        System.out.println("O resultado da soma " + n1 + " + " + n2 + " = " + resultado + ".");
    }

    public void sub ( double n1, double n2){
        resultado = n1 - n2;
        System.out.println("O resultado da subtração " + n1 + " - " + n2 + " = " + resultado + ".");
    }

    public void multi ( double n1, double n2){
        resultado = n1 * n2;
        System.out.println("O resultado da multiplicação " + n1 + " * " + n2 + " = " + resultado + ".");
    }

    public void divi ( double n1, double n2){
        resultado = n1 / n2;
        System.out.println("O resultado da divisão " + n1 + " / " + n2 + " = " + resultado + ".");
    }

    public void mod ( double n1, double n2){
        resultado = n1 % n2;
        System.out.println("O resultado do módulo " + n1 + " % " + n2 + " = " + resultado + ".");
    }

    public void menu () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha a operação desejada: \n 1- Soma \n 2- Subtração \n 3- Multiplicação \n 4- Divisão \n 5- Módulo \n 6- Finalizar");

        int opcao = sc.nextInt();

        if (opcao == 6) { // Se a opção for 6, o código finaliza
            System.exit(6); // O método ".exit" finaliza o código.
        }

        System.out.println("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.println("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        if (opcao == 1) soma(n1, n2);
        if (opcao == 2) sub(n1, n2);
        if (opcao == 3) multi(n1, n2);
        if (opcao == 4) divi(n1, n2);
        if (opcao == 5) mod(n1, n2);

        System.out.println("\nVocê deseja fazer outra operação? [s/n]");
        String decisao = sc.next();

        if ("s".equals(decisao)) menu(); // Se a string inserida for == "s" ele instancia a classe menu();
        if (!"s".equals(decisao)) System.out.println("Volte sempre!.");
    }

    //public static cadastro (){
        //System.out.println("Entre com o seu nome: ");
        //String nome = sc.next();
        //if ("Arthur".equals(nome)) menu();
        //if (!"Arthur".equals(nome)) System.out.println("Acesso negado!");
    //}
    public static void main (String[]args){
        // Scanner sc = new Scanner(System.in);
        System.out.println("CALCULADORA \n -----------------------------------------");
        calculadoraFun calculo = new calculadoraFun();
        calculo.menu();
    }
}


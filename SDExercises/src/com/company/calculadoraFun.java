package com.company;

import java.util.Scanner;

public class calculadoraFun {
    double resultado = 0;

    // Criando uma classe para cada operação matemática facilitando a alteração das informações e organização.
    public void soma(double n1, double n2) {
        resultado = n1 + n2;
        System.out.println("O resultado da soma " +n1+ " + " +n2+ " é: " +resultado);
    }
    public void sub(double n1, double n2) {
        resultado = n1 - n2;
        System.out.println("O resultado da subtração " +n1+ " - " +n2+ " é: " +resultado);
    }
    public void multi(double n1, double n2) {
        resultado = n1 * n2;
        System.out.println("O resultado da multiplicação " +n1+ " * " +n2+ " é: " +resultado);
    }
    public void div(double n1, double n2) {
        if (n2 == 0) {
            System.out.println("Não é possível dividir por 0.");
        } else {
            resultado = n1 / n2;
            System.out.println("O resultado da divisão " + n1 + " / " + n2 + " é: " +resultado);
        }
    }
    public void mod(double n1, double n2) {
        resultado = n1 % n2;
        System.out.println("O resultado do módulo " +n1+ " % " +n2+ " é: " +resultado);
    }

    public void menu() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Que operação deseja realizar?\n 1 - Soma\n 2 - Subtração\n 3 - Multiplicação\n 4 - Divisão\n 5 - Módulo\n 0 - Exit\n ---> ");

        int opcao = sc.nextInt();
        if (opcao == 0) System.exit(0); // Para o código.

        System.out.println("Entre com o primeiro valor: ");
        double n1 = sc.nextDouble();

        System.out.println("Entre com o segundo valor: ");
        double n2 = sc.nextDouble();

        if (opcao == 1) soma (n1,n2);
        if (opcao == 2) sub (n1,n2);
        if (opcao == 3) multi (n1,n2);
        if (opcao == 4) div (n1,n2);
        if (opcao == 5) mod (n1,n2);

        System.out.println("\nVocê quer fazer outra operação? [s/n]:");
        String decisao = sc.next();

        // Se a string inserida for == "s" ele instancia a classe menu();
        if ("s".equals (decisao)) menu();
        if (!"s".equals(decisao)) System.out.println("Até mais! Execução finalizada.");
    }

    public static void main(String[] args) {  // O método main é o método principal do código
        System.out.println("Calculadora \n -------------------------------");
        calculadoraFun calculo = new calculadoraFun(); // Instanciando a classe principal
        calculo.menu();
    }
}


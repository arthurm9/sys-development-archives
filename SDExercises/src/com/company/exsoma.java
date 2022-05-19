package com.company;

import java.util.Scanner;

public class exsoma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resultadosoma;

        System.out.print("Informe um número: ");
        int n1 = sc.nextInt();

        System.out.print("Informe outro número: ");
        int n2 = sc.nextInt();

        System.out.print("Informe um número: ");
        int n3 = sc.nextInt();

        System.out.print("Informe outro número: ");
        int n4 = sc.nextInt();

        resultadosoma = calSoma(n1,n2);

        sc.close();
    }
    public static int calSoma(int n1, int n2) {
        int aux = n1 + n2;
        return aux;
    }

    /* public static void mostrarValor(int valor){
        mostrarValor(resultadosoma);
        System.out.print("O resultado da primeira soma é: " +resultadosoma+ "\n");
        mostrarValor(resultadosoma);
        System.out.print("O resultado da segunda soma é: " +resultadosoma);
    } */
}

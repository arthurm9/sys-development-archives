package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class equacaoProcedimentos {

    /*
        Arthur Marques de Oliveira - 2° DS

            Equacao do Segundo Grau com Procedimentos
        Procedimentos criados:
        - lerabc = armazena os valores inseridos pelo usuário e exibe-os.
        - main = executa a função para ler a,b e c, depois exibe delta se ele for maior que zero, senão, finaliza o programa.
        - raízes = calcula e exibe o valor das raízes.

        Funções criadas:
        - delta = armazena a equação para calcular o delta.
    */

    public static double a, b, c;
    public static DecimalFormat df = new DecimalFormat("##,###,#00.00");

    public static void lerabc() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o valor de a: ");
        a = sc.nextDouble();
        System.out.print("Informe o valor de b: ");
        b = sc.nextDouble();
        System.out.print("Informe o valor de c: ");
        c = sc.nextDouble();
    }

    public static double delta() { // Não pode ser void pois retorna um valor que vai ser usada em outro procedimento.
        return (b*b)-(4*a*c); // Essa função retorna apenas a equacao do delta.
    }

    public static void raizes(double valordelta) { // Esse procedimento tem como parâmetro a variável valordelta que guarda consigo
        // o procedimento que contém o cálculo do delta.

        // DecimalFormat df = new DecimalFormat("##,###,##0.00"); <- Cancelada pois foi criada uma função publica que instancia
        // a classe DecimalFormat.

        double x1=(-b+Math.sqrt(valordelta))/(2*a);
        double x2=(-b-Math.sqrt(valordelta))/(2*a);

        System.out.println("Valores das Raizes\nx1 -> " +df.format(x1) + ", x2 -> " +df.format(x2));
    }

    public static void main(String[] args) {
        lerabc(); // Inicia o procedimento de leitura de a, b e c.

        double valordelta = delta(); // Cria uma variável para armazenar a função que contém o cálculo do delta e a executa aqui.
        System.out.println("Delta = " + valordelta);

        if (valordelta<0) System.out.print("Delta menor que zero!"); // Se o valor de delta for menor que 0, escreva...
        else raizes(valordelta); // Senão, execute a função raizes que contem o valordelte e exiba o valor de cada raíz.
    }
}

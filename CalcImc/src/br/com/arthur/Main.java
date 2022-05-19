package br.com.arthur;

import java.text.DecimalFormat;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("##,##0.00");
        Scanner sc = new Scanner(System.in);

        double peso, altura;

        System.out.println("CÁLCULO DE IMC (Índice de Massa Corporal)");
        System.out.println("---------------------------------------->");
        System.out.print("Entre com o peso (kg): ");
        peso = sc.nextDouble();

        System.out.print("Entre com a altura (m): ");
        altura = sc.nextDouble();

        System.out.println("---------------------------------------->");
        calculoImc(peso,altura);
    }

    public static double calculoImc (double peso, double altura) {
        double imc = peso/(Math.pow(altura,2));

        if (imc < 18.5){
            System.out.println("Peso (kg): " +peso);
            System.out.println("Altura (m): " +altura);
            System.out.println("IMC: " +imc);
            System.out.println("---------------------------------------->");
            System.out.println("A pessoa está magra (grau 1!).");
            System.out.println("É recomendado consultar um especialista no assunto antes de seguir qualquer tipo de dieta para não prejudicar o organismo!\nPara ter um ganho de peso saudável, não se deve comer somente muitos alimentos calóricos e sim priorizar alguns alimentos com boa quantidade calórica, mas ricos em nutrientes benéficos e com pouca quantidade de\ngordura saturada (de origem animal) e gordura trans (de industrializados).");
            System.out.println("---------------------------------------->");
        }
        else if (imc >= 18.6 && imc <= 24.9){
            System.out.println("Peso (kg): " +peso);
            System.out.println("Altura (m): " +altura);
            System.out.println("IMC: " +imc);
            System.out.println("---------------------------------------->");
            System.out.println("A pessoa está saudável (grau 0).");
            System.out.println("É recomendado consultar um especialista no assunto antes de seguir qualquer tipo de dieta para não prejudicar o organismo!\nAcredita-se que as pessoas consideradas saudáveis já realizava algum tipo de exercício físico ou\naté mesmo uma boa alimentação (balanceada). Para se manter saudável deve-se ingerir aliementos energéticos (carboidratos) e não exagerar na quantidade de alimentos proteicos pois pode gerar saciedade, por conta disso a pessoa\nnão consegue comer o necessário de calorias e o corpo começa a queimar gordura de onde não queimaria se a aliementação estivesse balanceada.");
            System.out.println("---------------------------------------->");
        }
        else if (imc >= 25.0 && imc <= 29.9){
            System.out.println("Peso (kg): " +peso);
            System.out.println("Altura (m): " +altura);
            System.out.println("IMC: " +imc);
            System.out.println("---------------------------------------->");
            System.out.println("A pessoa está sobrepeso (grau 1!).");
            System.out.println("É recomendado consultar um especialista no assunto antes de seguir qualquer tipo de dieta para não prejudicar o organismo!\nPara as pessoas sobrepeso (grau 1) é recomendado ingerir aliementos com menas calorias, frutas, e\nsubstituir aliementos gordurosos. Porém o essencial é a prática de exercícios físicos simultaneamente.");
            System.out.println("---------------------------------------->");
        }
        else if (imc >= 30.0 && imc <= 39.9){
            System.out.println("Peso (kg): " +peso);
            System.out.println("Altura (m): " +altura);
            System.out.println("IMC: " +imc);
            System.out.println("---------------------------------------->");
            System.out.println("A pessoa está com obesidade (grau 2!!).");
            System.out.println("É recomendado consultar um especialista no assunto antes de seguir qualquer tipo de dieta para não prejudicar o organismo!\nPara as pessoas com obesidade (grau 2) é recomendado a realização de dietas com baixas calorias\n(800kcal/dia ou menos), com um bom acompanhamento profissional e a prática moderada de exercícios cardiovasculares");
            System.out.println("---------------------------------------->");
        }
        else if (imc >= 40.0){
            System.out.println("Peso (kg): " +peso);
            System.out.println("Altura (m): " +altura);
            System.out.println("IMC: " +imc);
            System.out.println("---------------------------------------->");
            System.out.println("A pessoa está com obesidade (grau 3!!!).");
            System.out.println("É recomendado consultar um especialista no assunto antes de seguir qualquer tipo de dieta para não prejudicar o organismo!\nPara as pessoas com obesidade (grau 3) é recomendado a consulta de um profissional de alto nível\npor conta dos perigos encontrados ao realizar uma dieta para obesos mórbidos. Sempre ingerir alimentos pouco calóricos e gordurosos mas sempre prezando a energia que o indivíduo precisa para o metabolismo.");
            System.out.println("---------------------------------------->");
        }

        return imc;
    }
}

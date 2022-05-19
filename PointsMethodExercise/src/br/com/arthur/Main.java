package br.com.arthur;

public class Main {

    public static void main(String[] args) {
        Pontos pontos = new Pontos();

        pontos.setX1(7);
        pontos.setX2(9);

        System.out.println("O valor de x1 é: " + pontos.getX1());
        System.out.println("O valor de x2 é: " + pontos.getX2());

        pontos.setY1(3);
        pontos.setY2(1);

        System.out.println("O valor de y1 é: " + pontos.getY1());
        System.out.println("O valor de y2 é: " + pontos.getY2());

        System.out.println("A distância entre os pontos é => " +pontos.getDistance());
    }
}

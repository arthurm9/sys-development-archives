package br.com.arthur;

public class Main {

    public static void main(String[] args) {
        Caes cachorro1 = new Caes();

        cachorro1.nome = "Boris";
        cachorro1.peso = 15;
        cachorro1.latido = "whoof";

        Caes cachorro2 = new Caes();

        cachorro2.nome = "Billy";
        cachorro2.peso = 20;
        cachorro2.latido = "au au";

        cachorro1.imprimir();
        System.out.println("");
        cachorro2.imprimir();
    }
}

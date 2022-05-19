package br.com.lucas;

public class Main {

    private static void gerarPessoa(String n1, String n2, String n3){
        // Criando a pessoa e dando os valores de primeiro nome, segundo nome e ultimo nome.
        Pessoa pessoa = new Pessoa();

        pessoa.primeiroNome = n1;
        pessoa.nomeMeio = n2;
        pessoa.ultimoNome = n3;

        System.out.println("Oi " + pessoa.getNomeCompleto());
    }

    public static void main(String[] args) {
        // Criando pessoas
        gerarPessoa("Lucas", "Vieira", "da Silva");
        gerarPessoa("João Érik", "da Silva", "Crisóstomo");
    }
}

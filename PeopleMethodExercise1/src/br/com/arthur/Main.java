package br.com.arthur;

public class Main {

    public static void main(String[] args) {
        // getter (leitura)
        // setter (atribuição)

        Pessoa pessoa = new Pessoa();
        pessoa.setPrimeiroNome("Arthur");
        pessoa.setNomeMeio("Marques");
        pessoa.setUltimoNome("de Oliveira");

        System.out.println("O nome da primeira pessoa é: " + pessoa.getNomeCompleto());

        Pessoa segundaPessoa = new Pessoa();
        segundaPessoa.setPrimeiroNome("Maria");
        segundaPessoa.setNomeMeio("Antonia");
        segundaPessoa.setUltimoNome("Rodrigues Vieira");

        System.out.println("O nome da segunda pessoa é: " + segundaPessoa.getNomeCompleto());
    }
}

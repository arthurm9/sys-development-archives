package br.com.arthur;

public class Pessoa {
    // variáveis em classes sempre serão privadas
    private String primeiroNome;
    private String nomeMeio;
    private String ultimoNome;

    // Getter's and Setter's >
    public String getPrimeiroNome() { // mostra o primeiro nome
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) { // atribui o primeiro nome
        this.primeiroNome = primeiroNome;
    }

    public String getNomeMeio() { // mostra o nome do meio
        return nomeMeio;
    }

    public void setNomeMeio(String nomeMeio) { // atribui o nome do meio
        this.nomeMeio = nomeMeio;
    }

    public String getUltimoNome() { // mostra o ultimo nome
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) { // atribui o ultimo nome
        this.ultimoNome = ultimoNome;
    }

    public String getNomeCompleto(){
        String nomeCompleto = primeiroNome + " " + nomeMeio + " " + ultimoNome;
        return nomeCompleto;
    }
}

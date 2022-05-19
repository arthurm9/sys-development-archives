package br.com.lucas;

import java.util.Locale;

public class Pessoa {

    public String primeiroNome;
    public String nomeMeio;
    public String ultimoNome;

    public String getNomeCompleto(){
        return String.format("%s %s %s", primeiroNome, nomeMeio, ultimoNome);
    }

}

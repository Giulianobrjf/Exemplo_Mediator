package org.example;

public class Pessoa {
        public String enviarPositivaProposta(String mensagem) {
            return Empresario.getInstancia().receberPositivaProposta(mensagem);
        }
    public String enviarRecusaProposta(String mensagem) {
        return Empresario.getInstancia().receberRecusaProposta(mensagem);
    }
    public String enviarNovaProposta(String mensagem) {
        return Empresario.getInstancia().receberNovaProposta(mensagem);
    }
}

package org.example;

public class DiretoriaFutebol implements Setor {
    private static DiretoriaFutebol instancia = new DiretoriaFutebol();

    private DiretoriaFutebol() {}
    public static DiretoriaFutebol getInstancia() {
        return instancia;
    }
    public String receberPositivaProposta(String mensagem) {
        return "A Diretoria aceita a proposta: " + mensagem;
    }

    public String receberRecusaProposta(String mensagem) {
        return "A Diretoria recusa a proposta: " + mensagem;
    }

    public String receberNovaProposta(String mensagem) {
        return "A Diretoria vai analisar a nova proposta: " + mensagem;
    }
}

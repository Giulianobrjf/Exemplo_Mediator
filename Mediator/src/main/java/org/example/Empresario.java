package org.example;

public class Empresario {

    private static Empresario instancia = new Empresario();
    private Empresario(){}

        public static Empresario getInstancia(){
            return instancia;
        }

        public String receberPositivaProposta(String mensagem){
            return "O Empresário agradece seu contato.\n"
                    + "A Diretoria respondeu sua demanda conforme mensagem a seguir.\n" +
                    ">>" + DiretoriaFutebol.getInstancia().receberPositivaProposta(mensagem);
        }
    public String receberRecusaProposta(String mensagem){
        return "O Empresário agradece seu contato.\n"
                + "A Diretoria respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + DiretoriaFutebol.getInstancia().receberRecusaProposta(mensagem);

    }
    public String receberNovaProposta(String mensagem){
        return "O Empresário agradece seu contato.\n"
                + "A Diretoria respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + DiretoriaFutebol.getInstancia().receberNovaProposta(mensagem);

    }
}

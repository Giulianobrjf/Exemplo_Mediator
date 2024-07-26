import org.example.Jogador;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JogadorTest {
    @Test
    public void deveEnviarPositivaProposta() {
        Jogador jogador = new Jogador();
        assertEquals("O Empresário agradece seu contato.\nA Diretoria respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Diretoria aceita a proposta: Aceitamos os termos propostos.",
                jogador.enviarPositivaProposta("Aceitamos os termos propostos."));
    }

    @Test
    public void deveEnviarRecusaProposta() {
        Jogador jogador = new Jogador();
        assertEquals("O Empresário agradece seu contato.\nA Diretoria respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Diretoria recusa a proposta: Não aceitamos os termos propostos.",
                jogador.enviarRecusaProposta("Não aceitamos os termos propostos."));
    }

    @Test
    public void deveEnviarNovaProposta() {
        Jogador jogador = new Jogador();
        assertEquals("O Empresário agradece seu contato.\nA Diretoria respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Diretoria vai analisar a nova proposta: Proponho novos termos para o contrato.",
                jogador.enviarNovaProposta("Proponho novos termos para o contrato."));
    }

}


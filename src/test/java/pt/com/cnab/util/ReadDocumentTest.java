package pt.com.cnab.util;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ReadDocumentTest {

    @Test
    public void testLerArquivo() throws IOException {
        ReadDocument readDocument = new ReadDocument();
        String caminhoArquivo = "CNAB.txt";
        String conteudo = readDocument.lerArquivo(caminhoArquivo);
        System.out.println(conteudo.toString());
        assertNotNull(conteudo);



    }
}
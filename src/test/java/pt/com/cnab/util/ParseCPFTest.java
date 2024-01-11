package pt.com.cnab.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParseCPFTest {




    @Test
    void extraindoCpf() {
        String texto = "3201903010000014200096206760174753****3153153453JOÃO MACEDO   BAR DO JOÃO       ";
        String parte = texto.substring(20, 30); // Extrai a parte da string do índice 8 até o índice 10 (não incluído)
        System.out.println(parte);
        assertEquals("9620676017", parte);
    }
}
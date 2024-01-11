package pt.com.cnab.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormatadorCPFTest {

    @Test
    void formatarCPF() {

        String cpfSemFormato = "9620676017";

        StringBuilder sb = new StringBuilder(cpfSemFormato);

        sb.insert(3, '.');
        sb.insert(7, '.');
        sb.insert(11, '-');

        String cpfFormatado = sb.toString();
        System.out.println(cpfFormatado);
        assertEquals("962.067.601-7", cpfFormatado);

    }
}
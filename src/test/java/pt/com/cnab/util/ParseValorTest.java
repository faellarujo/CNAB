package pt.com.cnab.util;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class ParseValorTest {

    @Test
    void stringToBigDecimal() {

        String valor = "0000014232";
        BigDecimal valorBigDecimal = new BigDecimal(valor).divide(new BigDecimal(100));
        //assertEquals(new BigDecimal("142.32"), valorBigDecimal);
        System.out.println("BigDecimal obtido: " + valorBigDecimal);
    }
}
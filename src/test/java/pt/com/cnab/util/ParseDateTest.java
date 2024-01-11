package pt.com.cnab.util;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class ParseDateTest {

    @Test
    void formataData() {

        String str = "20190301";
        StringBuilder stringBuilder = new StringBuilder(str);

        int positionFourtoString = 4;
        int positionSeventoString = 7;

        char caracterInserir = '-';

        // Inserir o caractere na posição especificada
        stringBuilder.insert (positionFourtoString, caracterInserir);
        stringBuilder.insert (positionSeventoString, caracterInserir);
        assertEquals("2019-03-01", stringBuilder.toString());
    }

    @Test
    void toStringLocalDate(){
        String dataString = "2022-01-11";

        // Defina o formato esperado da string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Faça o parsing da string para LocalDate
        LocalDate data = LocalDate.parse(dataString, formatter);

        LocalDate dataEsperada = LocalDate.of(data.getYear(), data.getMonth(), data.getDayOfMonth());
        assertEquals(dataEsperada, data);
        System.out.println("LocalDate obtido: " + data);
    }


}
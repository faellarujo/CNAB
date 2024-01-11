package pt.com.cnab.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParseDate {


    private LocalDate date;


    public ParseDate(String date) {
        final LocalDate stringLocalDate = toStringLocalDate(formataData(date));
        this.date = stringLocalDate;
    }

    public String formataData(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        int positionFourtoString = 4;
        int positionSeventoString = 7;
        char caracterInserir = '-';
        // Inserir o caractere na posição especificada
        stringBuilder.insert (positionFourtoString, caracterInserir);
        stringBuilder.insert (positionSeventoString, caracterInserir);
        return stringBuilder.toString();
    }

    public LocalDate toStringLocalDate(String str){

        // Defina o formato esperado da string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Faça o parsing da string para LocalDate
        LocalDate localdate = LocalDate.parse(str, formatter);

        return localdate;
    }



}

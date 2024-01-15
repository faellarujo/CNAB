package pt.com.cnab.util;

import java.lang.reflect.Constructor;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ParseHora {



    LocalTime horaFormatada;


    public LocalTime getHoraFormatada() {
        return horaFormatada;
    }

    public void setHoraFormatada(LocalTime horaFormatada) {
        this.horaFormatada = horaFormatada;
    }


    public ParseHora(String horaSemFormato) {

        String parseHora = formataHora(horaSemFormato);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime = LocalTime.parse(parseHora, formatter);
        this.horaFormatada = localTime;
    }

    public String formataHora(String HoraSemFormato) {
        StringBuilder sb = new StringBuilder(HoraSemFormato);

        sb.insert(2, ':');
        sb.insert(5, ':');

        String horaFormatada = sb.toString();

        return horaFormatada;
    }




}

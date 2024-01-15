package pt.com.cnab.util;

public class ExtraiPartes {


    public String extraindoTipo(String str){
        String parte = str.substring(0, 1);
        return parte;
    }

    public String extraindoData(String str){
        String parte = str.substring(1, 9);
        return parte;
    }

    public String extraindoValor(String str){
        String parte = str.substring(10, 19);
        return parte;
    }

    public String extraindoCPF(String str){
        String parte = str.substring(19, 30);
        return parte;
    }

    public String extraindoCartao(String str){
        String parte = str.substring(30, 42);
        return parte;
    }

    public String extraindoHora(String str){
        String parte = str.substring(42, 48);
        return parte;
    }

    public String extraindoDonoLoja(String str){
        String parte = str.substring(48, 62);
        return parte;
    }

    public String extraindoNomeLoja(String str){
        String parte = str.substring(62, 80);
        return parte;
    }
}

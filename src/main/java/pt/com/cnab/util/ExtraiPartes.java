package pt.com.cnab.util;

public class ExtraiPartes {

    public String extraindoTipo(){
        String str = "3201903010000014200096206760174753****3153153453JOÃO MACEDO   BAR DO JOÃO       ";
        String parte = str.substring(0, 1);
        return parte;
    }

    public String extraindoData(){
        String str = "3201903010000014200096206760174753****3153153453JOÃO MACEDO   BAR DO JOÃO       ";
        String parte = str.substring(1, 9);
        return parte;
    }

    public String extraindoValor(){
        String str = "3201903010000014200096206760174753****3153153453JOÃO MACEDO   BAR DO JOÃO       ";
        String parte = str.substring(10, 20);
        return parte;
    }

    public String extraindoCPF(){
        String str = "3201903010000014200096206760174753****3153153453JOÃO MACEDO   BAR DO JOÃO       ";
        String parte = str.substring(20, 31);
        return parte;
    }

    public String extraindoCartao(){
        String str = "3201903010000014200096206760174753****3153153453JOÃO MACEDO   BAR DO JOÃO       ";
        String parte = str.substring(31, 43);
        return parte;
    }

    public String extraindoHora(){
        String str = "3201903010000014200096206760174753****3153153453JOÃO MACEDO   BAR DO JOÃO       ";
        String parte = str.substring(43, 48);
        return parte;
    }

    public String extraindoDonoLoja(){
        String str = "3201903010000014200096206760174753****3153153453JOÃO MACEDO   BAR DO JOÃO       ";
        String parte = str.substring(48, 62);
        return parte;
    }

    public String extraindoNomeLoja(){
        String str = "3201903010000014200096206760174753****3153153453JOÃO MACEDO   BAR DO JOÃO       ";
        String parte = str.substring(62, 80);
        return parte;
    }


    public static void main(String[] args) {
        final ExtraiPartes extraiPartes = new ExtraiPartes();
        System.out.println("Tipo          : " + extraiPartes.extraindoTipo());
        System.out.println("Data          : " + extraiPartes.extraindoData());
        System.out.println("Valor         : " + extraiPartes.extraindoValor());
        System.out.println("CPF           : " + extraiPartes.extraindoCPF());
        System.out.println("Cartao        : " + extraiPartes.extraindoCartao());
        System.out.println("Hora          : " + extraiPartes.extraindoHora());
        System.out.println("Dono Loja     : " + extraiPartes.extraindoDonoLoja());
        System.out.println("Nome Loja     : " + extraiPartes.extraindoNomeLoja());
    }



}

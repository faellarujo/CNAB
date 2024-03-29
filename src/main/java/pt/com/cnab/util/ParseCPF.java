package pt.com.cnab.util;

public class ParseCPF {
    String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public ParseCPF(String str) {
        final String s = formatarCPF(str);
        this.str = s;
    }

    public String formatarCPF(String cpfSemFormato) {
        StringBuilder sb = new StringBuilder(cpfSemFormato);

        sb.insert(3, '.');
        sb.insert(7, '.');
        sb.insert(11, '-');

        String cpfFormatado = sb.toString();

        return cpfFormatado;
    }


}

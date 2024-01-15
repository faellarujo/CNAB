package pt.com.cnab.util;

public class ParseTipo {

    Long tipo;
    private ExtraiPartes extraiPartes;

    public Long getTipo() {
        return tipo;
    }

    public void setTipo(Long tipo) {
        this.tipo = tipo;
    }

    public ParseTipo(String tipo) {
        final Long l = extraindoTipo(tipo);
        this.tipo = l;
    }

    public Long extraindoTipo(String linha){
        char posicao = linha.charAt(0);
        long tipo = Long.parseLong(String.valueOf(posicao));
        return tipo;
    }
}

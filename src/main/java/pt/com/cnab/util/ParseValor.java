package pt.com.cnab.util;

import java.math.BigDecimal;

public class ParseValor {

    private BigDecimal bigDecimal;

    public BigDecimal getBigDecimal() {
        return bigDecimal;
    }

    public void setBigDecimal(BigDecimal bigDecimal) {
        this.bigDecimal = bigDecimal;
    }

    public ParseValor(String valor) {
        final BigDecimal bigDecimal1 = stringToBigDecimal(valor);
        this.bigDecimal = bigDecimal1;
    }

    public BigDecimal stringToBigDecimal(String valor){
        BigDecimal valorBigDecimal = new BigDecimal(valor).divide(new BigDecimal(100));
        return valorBigDecimal;
    }
}

package pt.com.cnab.model;


import jakarta.persistence.*;

@Entity
public class docTipoTransaçao {

    @Id
    private Long tipo;

    @Column
    private String descricao;

    @Column
    private String natureza;

    @Column
    private String sinal;

    public Long getTipo() {
        return tipo;
    }

    public void setTipo(Long tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNatureza() {
        return natureza;
    }

    public void setNatureza(String natureza) {
        this.natureza = natureza;
    }

    public String getSinal() {
        return sinal;
    }

    public void setSinal(String sinal) {
        this.sinal = sinal;
    }
}

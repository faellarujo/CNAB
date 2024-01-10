package pt.com.cnab.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class TransacaoCNAB {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Long idTipoTransacao;

    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @Column
    private LocalDate data;

    @Column(precision = 10, scale = 2)
    private BigDecimal valor;

    @Column
    private String cpf;

    @Column
    private String cartao;

    @Column
    private LocalTime hora;

    @Column
    private String donoLoja;

    @Column
    private String nomeLoja;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdTipoTransacao() {
        return idTipoTransacao;
    }

    public void setIdTipoTransacao(Long idTipoTransacao) {
        this.idTipoTransacao = idTipoTransacao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getDonoLoja() {
        return donoLoja;
    }

    public void setDonoLoja(String donoLoja) {
        this.donoLoja = donoLoja;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }
// Getters e Setters
}

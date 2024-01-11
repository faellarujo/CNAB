package pt.com.cnab.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public record CnabDTO(Long tipo, LocalDate data, BigDecimal valor, String cpf, String cartao, LocalTime hora, String donoLoja, String nomeLoja) {
}

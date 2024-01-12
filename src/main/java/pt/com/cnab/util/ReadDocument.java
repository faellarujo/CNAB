package pt.com.cnab.util;


import pt.com.cnab.dto.CnabDTO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

public class ReadDocument {

        static String caminhoArquivo = "CNAB.txt";

        public String lerArquivo(String caminhoArquivo) throws IOException {
            StringBuilder conteudo = new StringBuilder();

            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(caminhoArquivo))) {
                String linha;
                while ((linha = bufferedReader.readLine()) != null) {

                    ParseTipo  parseTipo  = new ParseTipo(linha);
                    ParseDate  parseDate  = new ParseDate(linha);
                    ParseValor parseValor = new ParseValor(linha);
                    ParseCPF   parseCPF   = new ParseCPF(linha);

                    //CnabDTO cnabDTO = new CnabDTO(parseTipo.getTipo(), parseDate.getDate(), parseValor.getBigDecimal(), parseCPF.getStr(),  );;

                    conteudo.append(linha).append("\n");
                }
            }
            return conteudo.toString();
        }

}









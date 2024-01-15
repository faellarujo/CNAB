package pt.com.cnab.util;


import pt.com.cnab.dto.CnabDTO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadDocument {

        static String caminhoArquivo = "CNAB.txt";

        public void lerArquivo(String caminhoArquivo) throws IOException {
            StringBuilder conteudo = new StringBuilder();

            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(caminhoArquivo))) {
                String linha;
                List<CnabDTO> dtoList  = new ArrayList<>();
                while ((linha = bufferedReader.readLine()) != null) {
                    ExtraiPartes extraiPartes = new ExtraiPartes();
                    CnabDTO cnabDTO = parserFild(extraiPartes, linha);
                    dtoList.add(cnabDTO);
                    conteudo.append(linha).append("\n");
                }
            }
        }

    private CnabDTO parserFild(ExtraiPartes extraiPartes, String linha) {
        ParseTipo  parseTipo     = new ParseTipo(extraiPartes.extraindoTipo(linha));
        ParseDate  parseDate     = new ParseDate(extraiPartes.extraindoData(linha));
        ParseValor parseValor    = new ParseValor(extraiPartes.extraindoValor(linha));
        ParseCPF   parseCPF      = new ParseCPF(extraiPartes.extraindoCPF(linha));
        String     parseCartao   = extraiPartes.extraindoCartao(linha);
        ParseHora  parseHora     = new ParseHora(extraiPartes.extraindoHora(linha));
        String     parseDonoLoja = extraiPartes.extraindoDonoLoja(linha);
        String     parseNomeLoja = extraiPartes.extraindoNomeLoja(linha);

        final CnabDTO cnabDTO = new CnabDTO(parseTipo.getTipo(), parseDate.getDate(), parseValor.getBigDecimal(), parseCPF.getStr()
                ,parseCartao.toString(), parseHora.getHoraFormatada(), parseDonoLoja.toString(), parseNomeLoja.toString());
        return cnabDTO;
    }

}









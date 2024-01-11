package pt.com.cnab.util;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

public class ReadDocument {

        String caminhoArquivo = "CNAB.txt";



    // Método para leitura de arquivo
        public String lerArquivo(String caminhoArquivo) throws IOException {
            StringBuilder conteudo = new StringBuilder();

            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(caminhoArquivo))) {
                String linha;
                while ((linha = bufferedReader.readLine()) != null) {
                    conteudo.append(linha).append("\n");
                }
            }

            return conteudo.toString();
        }

    /*public LocalDate extraindoData(String date){

        char posicao = date.charAt(0);
        long tipo = Long.parseLong(String.valueOf(posicao));
        return tipo;
    }*/




}









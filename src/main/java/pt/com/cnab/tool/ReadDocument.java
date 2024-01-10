package pt.com.cnab.tool;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDocument {




    public static void main(String[] args) {

        // Especifique o caminho do arquivo que você deseja ler
            String caminhoArquivo = "caminho/do/seu/arquivo.txt";


            try {
                // Crie um objeto FileReader
                FileReader fileReader = new FileReader(caminhoArquivo);

                // Crie um objeto BufferedReader para ler linhas do arquivo
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String linha;

                // Leia cada linha do arquivo e imprima-a
                while ((linha = bufferedReader.readLine()) != null) {
                    System.out.println(linha);
                }

                // Feche os recursos após a leitura
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



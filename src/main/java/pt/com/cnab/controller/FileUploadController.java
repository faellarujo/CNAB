package pt.com.cnab.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import pt.com.cnab.dto.CnabDTO;
import pt.com.cnab.model.TransacaoCNAB;
import pt.com.cnab.repository.CnabRepository;
import pt.com.cnab.util.ReadDocument;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Controller
public class FileUploadController {

    @Autowired
    CnabRepository cnabRepository;

    @GetMapping(value = "/index")    
    public String uploadForm() {
        return "index";
    }


    @GetMapping(value = "/cnab")
    public ResponseEntity<List<TransacaoCNAB>> getAllcnab() throws IOException {

        ReadDocument readDocument = new ReadDocument(getNomeArquivo());
        List<CnabDTO> dtoList = readDocument.lerArquivo(readDocument.getCaminhoArquivo());
        List<TransacaoCNAB> transacaoCNAB = dtoList.stream()
                .map(dto -> {
                    TransacaoCNAB transacaoCNAB1 = new TransacaoCNAB();
                    try {
                        BeanUtils.copyProperties(dto, transacaoCNAB1);
                    } catch (Exception e) {
                        e.printStackTrace(); // Lide com exceções de cópia de propriedades conforme necessário
                    }
                    return transacaoCNAB1;
                }).collect(Collectors.toList());

        final List<TransacaoCNAB> transacaoCNABS = cnabRepository.saveAll(transacaoCNAB);

        return ResponseEntity.ok(transacaoCNABS);
    }


    @PostMapping("/index")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) throws IOException {

        var path = "C:/Users/faell/IdeaProjects/CNAB/";
        final var caminho = getString(file, path);
        try {
            Files.copy  (file.getInputStream(), Path.of(caminho), StandardCopyOption.REPLACE_EXISTING);
            return new ResponseEntity<>("{ \"mensagem\": \"Arquivo carregado com sucesso!\"}", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("{ \"mensagem\": \"Erro ao carregar o arquivo!\"}", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    private String getString(MultipartFile file, String path) {
        final String nomeArquivo = getNomeArquivo();
        var caminho = path + nomeArquivo + "." + extrairExtensao(file.getOriginalFilename());
        return caminho;
    }

    private static String getNomeArquivo() {
        final UUID uuid = UUID.randomUUID();
        final String nomeArquivo = "CNAB";
        return nomeArquivo;
    }


    private String extrairExtensao(String nomeArquivo) {
        int i = nomeArquivo.lastIndexOf(".");
        return nomeArquivo.substring(i + 1);
    }
}


package pt.com.cnab.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helo {

    @GetMapping(value = "/index")
    String teste(){
        return "Olá";
    }

    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("formulariosss", new Formulario());
        return "formulario";
    }

    @PostMapping("/processarFormulario")
    public String processarFormulario(Formulario formulario) {
        // Lógica para processar os dados do formulário
        // Pode ser armazenado em um banco de dados, por exemplo
        return "resultado";
    }
}

package com.emersonbezerra.minhasviagens;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InicioController {

    @GetMapping("/inicio")
    public String exibirTelaInicial() {
        return "Olá mundo no Spring!";
    }

    @PostMapping("/")
    public String exibirTelaRaiz() {
        return "Olá mundo no Spring na rota raiz!";
    }
}

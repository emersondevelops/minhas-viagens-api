package com.emersonbezerra.minhasviagens;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViagensController {

    @GetMapping("/teste")
    public String exibirMensagemComunicacao() {
        System.out.println(">>> Recebi uma requisição GET 😊! <<<<");
        return "Olá, recebi sua requisição!";
    }
}

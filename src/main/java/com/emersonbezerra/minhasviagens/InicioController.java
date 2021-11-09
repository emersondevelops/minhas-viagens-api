package com.emersonbezerra.minhasviagens;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InicioController {

    @GetMapping("/")
    public String exibirTelaInicial() {
        return "Uma API para planejamento de viagens";
    }

    @GetMapping("/retorno-html")
    public String testaRetornoComHtml() {
        String cabecalho = "<h1 style='color:red'>Aplicação Clássica</h1>";
        String paragrafo = "<p>Esta mensagem é um parágrafo</p>";
        return cabecalho + paragrafo;
    }
}

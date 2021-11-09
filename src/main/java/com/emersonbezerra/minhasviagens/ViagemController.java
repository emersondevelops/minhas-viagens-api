package com.emersonbezerra.minhasviagens;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/viagem")
public class ViagemController {

    @GetMapping
    public ResponseEntity<Viagem> mostarViagem() {

        Viagem viagem = new Viagem("João Pessoa", "Maldivas");

        return ResponseEntity.ok().body(viagem);
    }
}

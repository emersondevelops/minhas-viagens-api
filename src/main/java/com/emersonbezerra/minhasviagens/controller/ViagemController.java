package com.emersonbezerra.minhasviagens.controller;

import com.emersonbezerra.minhasviagens.model.Viagem;
import com.emersonbezerra.minhasviagens.repository.ViagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/viagem")
public class ViagemController {

    @Autowired
    private ViagemRepository repository;

    @GetMapping
    public ResponseEntity<List<Viagem>> obterPlanosViagem() {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }

    @PostMapping
    public void cadastrarViagem(@RequestBody Viagem viagem) {
        repository.save(viagem);
    }
}

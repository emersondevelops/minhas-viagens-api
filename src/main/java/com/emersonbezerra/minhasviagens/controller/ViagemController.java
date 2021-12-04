package com.emersonbezerra.minhasviagens.controller;

import com.emersonbezerra.minhasviagens.model.Viagem;
import com.emersonbezerra.minhasviagens.repository.ViagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/viagem")
public class ViagemController {

    @Autowired
    private ViagemRepository repository;

    @GetMapping
    public ResponseEntity<List<Viagem>> obterViagens() {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Viagem> obterViagem(@PathVariable Integer id) {
        Optional<Viagem> possivelViagem = repository.findById(id);
        if (possivelViagem.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(possivelViagem.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping
    public void cadastrarViagem(@RequestBody Viagem viagem) {
        repository.save(viagem);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> removerViagem(@PathVariable Integer id) {
        Optional<Viagem> possivelViagem = repository.findById(id);
        if (possivelViagem.isPresent()) {
            repository.delete(possivelViagem.get());
            return ResponseEntity.status(HttpStatus.OK).body("A viagem id " + id + " foi deletada.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<Viagem> atualizarViagem(@PathVariable Integer id, @RequestBody Viagem viagemAtualizada) {
        Optional<Viagem> possivelViagem = repository.findById(id);
        if (possivelViagem.isPresent()) {
            Viagem viagem = possivelViagem.get();
            if (viagemAtualizada.getOrigem() != null) viagem.setOrigem(viagemAtualizada.getOrigem());
            if (viagemAtualizada.getDestino() != null) viagem.setDestino(viagemAtualizada.getDestino());
            if (viagemAtualizada.getRealizada() != null) viagem.setRealizada(viagemAtualizada.getRealizada());
            repository.save(viagem);
            return ResponseEntity.status(HttpStatus.OK).body(viagem);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}

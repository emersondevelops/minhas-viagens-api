package com.emersonbezerra.minhasviagens.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_viagens")
@Getter
@Setter
@NoArgsConstructor
public class Viagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String origem;

    private String destino;

    private Boolean realizada;

    private LocalDateTime cadastradaEm;

    public Viagem(String origem, String destino) {
        this.origem = origem;
        this.destino = destino;
        this.cadastradaEm = LocalDateTime.now();
    }
}

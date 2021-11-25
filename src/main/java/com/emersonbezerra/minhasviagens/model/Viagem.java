package com.emersonbezerra.minhasviagens.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tb_viagens")
@Getter
@Setter
@NoArgsConstructor
public class Viagem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String origem;

    private String destino;

    public Viagem(String origem, String destino) {
        this.origem = origem;
        this.destino = destino;
    }
}

package com.emersonbezerra.minhasviagens.repository;

import com.emersonbezerra.minhasviagens.model.Viagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ViagemRepository extends JpaRepository<Viagem, Integer> {
}

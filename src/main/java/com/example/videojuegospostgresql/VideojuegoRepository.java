package com.example.videojuegospostgresql;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer> {
    Videojuego findByTitulo (String titulo);
}

package com.example.videojuegospostgresql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class VideojuegosPostgreSqlApplication implements CommandLineRunner {

	@Autowired
	VideojuegoRepository gamesRepository;

	public static void main(String[] args) {
		SpringApplication.run(VideojuegosPostgreSqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Videojuego game = new Videojuego();
		game.setTitulo("Hollow Knight");
		game.setCompany("Team Cherry");
		game.setPlataforma("All");

		Direccion dir = new Direccion();
		dir.setCalle("falsa");
		dir.setNumero("123");

		game.setDireccion(dir);

		gamesRepository.save(game);
		List<Videojuego> games = gamesRepository.findAll();
		for(Videojuego juego: games){
			System.out.println(juego.getTitulo());
		}
	}
}

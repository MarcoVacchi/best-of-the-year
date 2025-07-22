package org.lessons.java.best_of_the_year;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BestOfTheYearApplication {

	public static void main(String[] args) {
		SpringApplication.run(BestOfTheYearApplication.class, args);
	}

}


// Step 2
// Creare all’interno del controller due metodi privati :
// uno restituisce una lista di oggetti di tipo Movie - getBestMovies()
// l’altro restituisce una lista di oggetti di tipo Song - getBestSongs()

// Creare le classi Movie e Song aventi almeno :
// un id
// un titolo

// Aggiungere al controller altri due metodi, che rispondono agli url
// “/movies”
// “/songs”

// In ognuno di questi metodi aggiungere al Model un attributo stringa con una lista di titoli di migliori film o canzoni (in base al metodo che stiamo implementando) separati da virgole. Utilizzare i due metodi getBest… per recuperare i film e le canzoni.

// Creare i rispettivi template Thymeleaf.
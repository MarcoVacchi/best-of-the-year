package org.lessons.java.best_of_the_year;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BestOfTheYearApplication {

	public static void main(String[] args) {
		SpringApplication.run(BestOfTheYearApplication.class, args);
	}

}


// Step 1

// Nel progetto aggiungere un controller che risponde alla root dell’applicazione, con un metodo che restituisce una view fatta con Thymeleaf in cui viene stampato un titolo: “Best of the year by …” (al posto dei puntini deve apparire il vostro nome, passato come attributo dal controller attraverso il Model).
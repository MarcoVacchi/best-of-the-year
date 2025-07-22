package org.lessons.java.best_of_the_year.controller;

import java.util.ArrayList;

import org.lessons.java.best_of_the_year.classes.Movies;
import org.lessons.java.best_of_the_year.classes.Songs;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping("/")

public class MainController {

    private ArrayList<Movies> moviesList = new ArrayList<>();
    private ArrayList<Songs> songsList = new ArrayList<>();

    public MainController() {

        Songs song = new Songs("1", "Somebody that i used to know");
        Songs song1 = new Songs("2", "Rap god");
        Songs song2 = new Songs("3", "All eyez on me");
        songsList.add(song);
        songsList.add(song1);
        songsList.add(song2);

        Movies movie = new Movies("1", "Titanic");
        Movies movie1 = new Movies("2", "La bella e la bestia");
        Movies movie2 = new Movies("3", "Fuga da alkatraz");
        moviesList.add(movie);
        moviesList.add(movie1);
        moviesList.add(movie2);
    };

    @GetMapping("/movies")
    private String getBestMovies(Model model) {
        model.addAttribute("movies", moviesList);
        return "movies";
    }

    @GetMapping("/songs")
    private String getBestSongs(Model model) {
        model.addAttribute("songs", songsList);
        return "songs";
    }

    @GetMapping("/movies/{id}")
    private String getTitleMovie(Model model, @PathVariable("id") String idMovie) {
        for (Movies movie : moviesList) {
            if (movie.getId().equalsIgnoreCase(idMovie)) {
                model.addAttribute("movie", movie.getTitle());
                return "movieDetail";
            }
        }
        return "error";
    }

    @GetMapping("/songs/{id}")
    private String getTitleSong(Model model, @PathVariable("id") String idSong) {
        for (Songs song : songsList) {
            if (song.getId().equalsIgnoreCase(idSong)) {
                model.addAttribute("song", song.getTitle());
                return "songDetail";
            }
        }
        return "error";
    }

    @GetMapping("/")
    private String getTitle(Model model) {
        model.addAttribute("title", "Best of the year of:");
        model.addAttribute("name", "Marco");
        return "homepage";
    }
}

// Step 4
// Includere Bootstrap e fare il refactoring del layout come da allegato,
// cercando di creare componenti riutilizzabili con i fragments.

// Modificare i metodi che rispondono agli url
// “/movies”
// “/songs”
// In modo che entrambi i Model restituiscano una lista di oggetti (Movie o
// Song) invece di una stringa.

// Modificare anche le rispettive view.
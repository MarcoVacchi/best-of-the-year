package org.lessons.java.best_of_the_year.controller;

import java.util.ArrayList;

import org.lessons.java.best_of_the_year.classes.Movies;
import org.lessons.java.best_of_the_year.classes.Songs;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
@RequestMapping("/")

public class MainController {
    
    private ArrayList<Movies> moviesList= new ArrayList<>();
    private ArrayList<Songs> songsList= new ArrayList<>();
   
    private String getBestSongs(){
         Songs song = new Songs("1", "Somebody that i used to know");
        Songs song1 = new Songs("2", "Rap god");
        Songs song2 = new Songs("3", "All eyez on me");
        songsList.add(song);
        songsList.add(song1);
        songsList.add(song2);
    String title = "";
    for (Songs songs : songsList) {
    title += songs.getTitle()+", ";    
    } return title;
    }

    private String getBestMovies(){
        Movies movie = new Movies("1", "Titanic");
        Movies movie1 = new Movies("2", "La bella e la bestia");
        Movies movie2 = new Movies("3", "Fuga da alkatraz");
        moviesList.add(movie);
        moviesList.add(movie1);
        moviesList.add(movie2);
    String title = "";
    for (Movies movies : moviesList) {
    title += movies.getTitle()+", ";    
    } return title;
    }

    //STEP 4
    // private ArrayList<Movies> getBestMovies(){
    //     final ArrayList<Movies> movieList = new ArrayList<>();
    //     Movies movie = new Movies("1", "Titanic");
    //     Movies movie1 = new Movies("2", "La bella e la bestia");
    //     Movies movie2 = new Movies("3", "Fuga da alkatraz");
    //     movieList.add(movie);
    //     movieList.add(movie1);
    //     movieList.add(movie2);
    //     return movieList;
    // }
       // @GetMapping("/movies")
    // public String getBestMovies(Model model) {
    //     model.addAttribute("movies", getBestMovies());
    //     return "movies";
    // }

    //   private String getBestSongs(){

    //   private ArrayList<Songs> songList = new ArrayList<>();
    //     Songs song = new Songs("1", "Somebody that i used to know");
    //     Songs song1 = new Songs("2", "Rap god");
    //     Songs song2 = new Songs("3", "All eyez on me");
    //     songList.add(song);
    //     songList.add(song1);
    //     songList.add(song2);
    //     return songList.toString();
    // }
    
  @GetMapping("/movies")
    private String getTitleMovies(Model model) {
        model.addAttribute("title", getBestMovies());
        return "movies";
    }

    @GetMapping("/songs")
    private String getTitleSongs(Model model) {
        model.addAttribute("title", getBestSongs());
        return "movies";
    }

    @GetMapping("/")
    private String getTitle(Model model) {
        model.addAttribute("title", "Best of the year of:");
        model.addAttribute("name", "Marco");
        return "homepage";
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

// In ognuno di questi metodi aggiungere al Model un attributo stringa con una
// lista di titoli di migliori film o canzoni (in base al metodo che stiamo
// implementando) separati da virgole. Utilizzare i due metodi getBest… per
// recuperare i film e le canzoni.

// Creare i rispettivi template Thymeleaf.
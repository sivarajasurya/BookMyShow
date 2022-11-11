package com.gcit.siva.bookmyshow.controller;

import com.gcit.siva.bookmyshow.entity.Movie;
import com.gcit.siva.bookmyshow.service.movieService.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping("/save-movie-name")
    public Movie saveMovieNames(@RequestBody Movie movie){
        return movieService.saveMovieName(movie);
    }

    @GetMapping("/list-movie-name")
    public List<Movie> listMovieNames(){
        return movieService.listMovieNames();
    }
}
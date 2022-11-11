package com.gcit.siva.bookmyshow.service.movieService;

import com.gcit.siva.bookmyshow.entity.Movie;
import com.gcit.siva.bookmyshow.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    private MovieRepo movieRepo;

    @Override
    public Movie saveMovieName(Movie movie) {
        return movieRepo.save(movie);
    }

    @Override
    public List<Movie> listMovieNames() {
        return movieRepo.findAll();
    }
}

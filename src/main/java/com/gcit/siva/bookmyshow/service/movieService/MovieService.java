package com.gcit.siva.bookmyshow.service.movieService;

import com.gcit.siva.bookmyshow.entity.Movie;
import java.util.List;
import java.util.Optional;

public interface MovieService {

    Movie saveMovieName (Movie movie);

    List<Movie> listMovieNames ();

    Movie findMovieById(long id);

    Movie findMovieByMovieName(String movieName);
}

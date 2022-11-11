package com.gcit.siva.bookmyshow.controller;

import com.gcit.siva.bookmyshow.entity.Movie;
import com.gcit.siva.bookmyshow.entity.Show;
import com.gcit.siva.bookmyshow.entity.Theater;
import com.gcit.siva.bookmyshow.request.ShowRequest;
import com.gcit.siva.bookmyshow.service.ShowService.ShowService;
import com.gcit.siva.bookmyshow.service.movieService.MovieService;
import com.gcit.siva.bookmyshow.service.theaterService.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ShowController {

    @Autowired
    private ShowService service;

    @Autowired
    private TheaterService theaterService;

    @Autowired
    private MovieService movieService;


    @PostMapping("/saveSeatDetails/{theaterId}/{movieID}")
    private Show saveSeatDetails(@PathVariable long theaterId, @PathVariable long movieID , @RequestBody ShowRequest showRequest){

        Show show = new Show();

        Optional<Theater> theater1 = theaterService.findByID(theaterId);

        Optional<Movie> movie1 = movieService.findMovieById(movieID);

        show.setTheater(theater1.get());
        show.setMovie(movie1.get());
        show.setTotalSeat(showRequest.getTotalSeat());
        show.setBookedSeat(showRequest.getBookedSeat());
        show.setDate(showRequest.getDate());

        return service.saveShow(show);
    }


}

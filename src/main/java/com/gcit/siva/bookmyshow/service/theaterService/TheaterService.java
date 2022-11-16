package com.gcit.siva.bookmyshow.service.theaterService;

import com.gcit.siva.bookmyshow.entity.Theater;

import java.util.List;
import java.util.Optional;

public interface TheaterService {

    Theater saveTheaterName (Theater theater);

    List<Theater> listAllTheaterName ();

    Theater findByID(long id);
    Theater findTheaterByTheaterNames(String theaterName);
    List<Theater> findTheaterNameForMovieName(String movieName);
    List<Theater> getAll();
}

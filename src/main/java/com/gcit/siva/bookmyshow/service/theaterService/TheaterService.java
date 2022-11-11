package com.gcit.siva.bookmyshow.service.theaterService;

import com.gcit.siva.bookmyshow.DTO.TheaterDto;
import com.gcit.siva.bookmyshow.entity.Theater;

import java.util.List;

public interface TheaterService {

    Theater saveTheaterName (Theater theater);

    List<Theater> listAllTheaterName ();

}

package com.gcit.siva.bookmyshow.service.ShowService;

import com.gcit.siva.bookmyshow.DTO.BookTicketDto.BookSeatForShowRequest;
import com.gcit.siva.bookmyshow.DTO.BookTicketDto.BookSeatForShowResponse;
import com.gcit.siva.bookmyshow.DTO.ListAllShowTimingsByTheaterNameOrMovieName.ListAllMoviesByTheaterName.AllMoviesByTheaterNameDto;
import com.gcit.siva.bookmyshow.DTO.ListAllShowTimingsByTheaterNameOrMovieName.ListAllTheaterByMovieName.AllTheaterByMovieNameDto;
import com.gcit.siva.bookmyshow.DTO.SeatAvailableDto;
import com.gcit.siva.bookmyshow.entity.ShowScreen;
import com.gcit.siva.bookmyshow.request.ShowRequest;

import java.util.List;

public interface ShowScreenService {

    ShowScreen saveShow (long theaterID, long movieId, ShowRequest showRequest);
    List<ShowScreen> findAllShowScreen();
    List<ShowScreen> findAllShowScreenByMovieNames();
    SeatAvailableDto getTicketAvailabilityByScreenId(long id);
    BookSeatForShowResponse bookSeatAvailableForShowScreen(BookSeatForShowRequest showRequest);
    AllMoviesByTheaterNameDto findAllShowScreenByTheaterName(String theaterName);
    List<AllTheaterByMovieNameDto> findAllShowScreenByMovieName(String movieName);
    //BookSeatForShowDto bookSeatAvailableForShowScreen(String theaterName, String movieName, int numOfTickets);

    List<ShowScreen> findAllTheaterByMovieName(String movieName);

    List<ShowScreen> findAllShowScreenForMovie(String movieName);


}

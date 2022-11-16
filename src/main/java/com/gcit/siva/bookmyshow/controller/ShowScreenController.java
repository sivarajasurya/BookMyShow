package com.gcit.siva.bookmyshow.controller;

import com.gcit.siva.bookmyshow.DTO.BookTicketDto.BookSeatForShowRequest;
import com.gcit.siva.bookmyshow.DTO.BookTicketDto.BookSeatForShowResponse;
import com.gcit.siva.bookmyshow.DTO.ListAllShowTimingsByTheaterNameOrMovieName.ListAllMoviesByTheaterName.AllMoviesByTheaterNameDto;
import com.gcit.siva.bookmyshow.DTO.ListAllShowTimingsByTheaterNameOrMovieName.ListAllTheaterByMovieName.AllTheaterByMovieNameDto;
import com.gcit.siva.bookmyshow.DTO.SeatAvailableDto;
import com.gcit.siva.bookmyshow.DTO.ShowScreenDto;
import com.gcit.siva.bookmyshow.entity.Movie;
import com.gcit.siva.bookmyshow.entity.ShowScreen;
import com.gcit.siva.bookmyshow.entity.Theater;
import com.gcit.siva.bookmyshow.request.ShowRequest;
import com.gcit.siva.bookmyshow.service.ShowService.ShowScreenService;
import com.gcit.siva.bookmyshow.service.movieService.MovieService;
import com.gcit.siva.bookmyshow.service.theaterService.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ShowScreenController {
    long theaterId,MovieId;
    long num ;

    @Autowired
    private ShowScreenService service;

    @Autowired
    private TheaterService theaterService;

    @Autowired
    private MovieService movieService;

    @PostMapping("/saveSeatDetails/{theaterId}/{movieID}")
    private ShowScreen saveSeatDetails(@PathVariable long theaterId, @PathVariable long movieID , @RequestBody ShowRequest showRequest){
        return service.saveShow( theaterId , movieID ,showRequest);
    }

    @GetMapping("/findAllShowScreenByMovieNames")
    public List<ShowScreen> showScreenList (){
        return service.findAllShowScreen();
    }

    @GetMapping("/findAllShowScreenByMoviesName/{movieName}")
    public List<AllTheaterByMovieNameDto> findAllShowScreenByMovieName(@PathVariable String movieName){
        return service.findAllShowScreenByMovieName(movieName);
    }

    @GetMapping("/findAllShowScreenByTheaterName/{theaterName}")
    public AllMoviesByTheaterNameDto findAllShowScreenByTheaterName(@PathVariable String theaterName){
        return service.findAllShowScreenByTheaterName(theaterName);
    }

    @GetMapping("/getTicketAvailabilityByScreenId/{screenId}")
    public SeatAvailableDto getTicketAvailabilityByScreenId(@PathVariable long screenId){
        return service.getTicketAvailabilityByScreenId(screenId);
    }

    @PostMapping("/bookSeatForShowScreen")
    public BookSeatForShowResponse bookSeatForShowScreen( @RequestBody BookSeatForShowRequest bookSeatForShowRequest){
        return service.bookSeatAvailableForShowScreen(bookSeatForShowRequest);
    }
//    @GetMapping("/bookSeatAvailableForShowScreen/{theaterName}/{movieName}/{numOfTickets}")
//    public BookSeatForShowDto getShowScreenByTheaterNameAndMovieName(@PathVariable String theaterName, @PathVariable String movieName , @PathVariable int numOfTickets){
//        return service.bookSeatAvailableForShowScreen(theaterName,movieName,numOfTickets);}
//        List<Theater> tList = theaterService.listAllTheaterName();
//        List<Movie> mList = movieService.listMovieNames();
//
////        tList.forEach(s->{
////            if (s.getTheaterName() == theaterName){
////                this.theaterId = s.getTheaterId();
////            }
////        });
//        String name;
//        for (int i = 0 ; i<tList.size() ; i++){
//            name = tList.get(i).getTheaterName();
//            if ( name == theaterName){
//                this.theaterId = tList.get(i).getTheaterId();
//            }
//        }
//return null;
//    }

    @GetMapping("/findAllShowScreen")
    public List<ShowScreen> findAllShowScreen(){
        return service.findAllShowScreen();
    }

    @GetMapping("/findShowScreen")
    public List<ShowScreenDto> showScreens (){

     List<ShowScreen> list = service.findAllShowScreenByMovieNames();

     List<ShowScreenDto> listDto = new ArrayList<>();

     listDto.forEach(s ->{
         ShowScreenDto screenDto = new ShowScreenDto();
         screenDto.setDate(s.getDate());
         listDto.add(screenDto);
     });
     return listDto;
    }
    @GetMapping("/findAllShowScreenByMovies")
    public List<ShowScreenDto> findAllShowScreenByMoviess(){

        List<ShowScreenDto> list = new ArrayList<>();
        ShowScreenDto obj = new ShowScreenDto();

        List<Theater> theaters = new ArrayList<>();
        theaters = theaterService.listAllTheaterName();
        long theaterId = theaters.get(0).getTheaterId();

        List<Movie> movies = new ArrayList<>();
        movies = movieService.listMovieNames();
        movies.get(0).getMovieId();

        List<ShowScreen> showScreens = new ArrayList<>();
        showScreens = service.findAllShowScreen();
        showScreens.get(0).getTheater().getTheaterId();

        if (theaters.get(0).getTheaterId() == showScreens.get(0).getTheater().getTheaterId()){
            obj.setShowId(showScreens.get(0).getShowId());
           // obj.setDate(showScreens.get(0).getDate());
            obj.setTotalSeat(showScreens.get(0).getTotalSeat());
            obj.setBookedSeat(showScreens.get(0).getBookedSeat());
            obj.setMovie(movies.get(0));
            obj.setTheater(theaters.get(0));
            list.add(obj);
        }

        return list;
    }


}

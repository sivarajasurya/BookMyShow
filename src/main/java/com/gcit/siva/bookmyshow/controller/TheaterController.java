package com.gcit.siva.bookmyshow.controller;

import com.gcit.siva.bookmyshow.entity.Theater;
import com.gcit.siva.bookmyshow.request.TheaterRequest;
import com.gcit.siva.bookmyshow.service.theaterService.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TheaterController {

    @Autowired
    private TheaterService service;

    @PostMapping("/addTheaterName")
    public Theater theater (@RequestBody TheaterRequest theater){
        Theater theater1 = new Theater();
        theater1.setTheaterName(theater.getTheaterName());
        return service.saveTheaterName(theater1);
    }

    @GetMapping("/showAllTheaterName")
    public List<Theater> theaters (){
        return service.listAllTheaterName();
    }

    @GetMapping("/getTheaterById/{id}")
    public Optional<Theater> getTheaterByIdI(@PathVariable long id){
        return service.findByID(id);
    }
//    @PostMapping("/addTheater")
//    public TheaterDto saveTheater(@RequestBody TheaterDto theaterDto){
//        Theater theater = new Theater();
//        theater.setTheaterName(theaterDto.getTheaterName());
//        theater.setTheaterId(theater);
//        service.saveTheaterName(theater);
//        return theaterDto;
//    }

}

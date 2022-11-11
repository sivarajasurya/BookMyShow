package com.gcit.siva.bookmyshow.controller;

import com.gcit.siva.bookmyshow.DTO.TheaterDto;
import com.gcit.siva.bookmyshow.entity.Theater;
import com.gcit.siva.bookmyshow.service.theaterService.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TheaterController {

    @Autowired
    private TheaterService service;

    @PostMapping("/addTheaterName")
    public Theater theater (@RequestBody Theater theater){
        return service.saveTheaterName(theater);
    }

    @GetMapping("/showAllTheaterName")
    public List<Theater> theaters (){
        return service.listAllTheaterName();
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

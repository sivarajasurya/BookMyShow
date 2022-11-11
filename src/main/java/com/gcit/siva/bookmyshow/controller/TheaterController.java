package com.gcit.siva.bookmyshow.controller;

import com.gcit.siva.bookmyshow.entity.Theater;
import com.gcit.siva.bookmyshow.service.theaterService.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TheaterController {

    @Autowired
    private TheaterService service;

    @PostMapping("/add-theater-name")
    public Theater theater (@RequestBody Theater theater){
        return service.saveTheaterName(theater);
    }

    @GetMapping("/show-all-theater-name")
    public List<Theater> theaters (){
        return service.listAllTheaterName();
    }

}

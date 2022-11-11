package com.gcit.siva.bookmyshow.controller;

import com.gcit.siva.bookmyshow.entity.Show;
import com.gcit.siva.bookmyshow.request.ShowRequest;
import com.gcit.siva.bookmyshow.service.ShowService.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowController {

    @Autowired
    private ShowService service;


    @PostMapping("/saveSeatDetails/{theaterId}/{movieID}")
    private Show saveSeatDetails(@RequestParam Long theaterId, @RequestParam Long movieID , @RequestBody ShowRequest showRequest){
//      ShowRequest showRequest1 = new ShowRequest();
        Show showRequest1 = new Show();
//        showRequest1.set
        showRequest1.setTheater_id(movieID);
        showRequest1.setMovie_id(movieID);

        showRequest1.setTotal_seat(showRequest.getTotal_seat());
        showRequest1.setBooked_seat(showRequest.getBooked_seat());
        showRequest1.setDate(showRequest.getDate());

        Show show = new Show();
        show.s
        return service.saveShow(showRequest1);
    }


}

package com.gcit.siva.bookmyshow.service.theaterService;

import com.gcit.siva.bookmyshow.entity.Theater;
import com.gcit.siva.bookmyshow.repository.TheaterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TheaterServiceImpl implements TheaterService{

    @Autowired
    private TheaterRepo theaterRepo;

    @Override
    public Theater saveTheaterName(Theater theater) {
        return theaterRepo.save(theater);
    }

    @Override
    public List<Theater> listAllTheaterName() {
        return theaterRepo.findAll();
    }

    @Override
    public Optional<Theater> findByID(long id) {
        return theaterRepo.findById(id);
    }

}


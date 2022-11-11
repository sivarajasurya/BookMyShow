package com.gcit.siva.bookmyshow.service.ShowService;

import com.gcit.siva.bookmyshow.entity.Show;
import com.gcit.siva.bookmyshow.repository.ShowRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowServiceImpl implements ShowService{

    @Autowired
    private ShowRepo showRepo;

    @Override
    public Show saveShow(Show show) {
        return showRepo.save(show);
    }
}

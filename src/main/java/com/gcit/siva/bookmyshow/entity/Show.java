package com.gcit.siva.bookmyshow.entity;

import lombok.Data;
import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
public class Show{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long show_id;

    private Date date;

    private int total_seat;

    private int booked_seat;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "theater_id")
    private Theater theater;

}

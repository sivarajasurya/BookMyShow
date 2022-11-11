package com.gcit.siva.bookmyshow.entity;

import lombok.Data;
import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
public class Show{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "show_id")
    private long showId;

    @Column(name = "date")
    private Date date;

    @Column(name = "total_seat")
    private int totalSeat;

    @Column(name = "booked_seat")
    private int bookedSeat;

    @ManyToOne()
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "theater_id")
    private Theater theater;

}

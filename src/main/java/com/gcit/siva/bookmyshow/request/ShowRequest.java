package com.gcit.siva.bookmyshow.request;

import lombok.Data;
import java.sql.Date;

@Data
public class ShowRequest {

    private long movie_id;

    private long theater_id;

    private Date date;

    private int total_seat;

    private int booked_seat;
}

package com.gcit.siva.bookmyshow.request;

import lombok.Data;
import java.sql.Date;

@Data
public class ShowRequest {

    private Date date;
    private int totalSeat;
    private int bookedSeat;
}

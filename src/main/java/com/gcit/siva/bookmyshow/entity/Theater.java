package com.gcit.siva.bookmyshow.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Theater{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long theater_id;

    private String theater_name;

    @OneToMany
    private List<Show> shows;

}

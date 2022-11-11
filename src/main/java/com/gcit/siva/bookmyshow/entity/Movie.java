package com.gcit.siva.bookmyshow.entity;

import jdk.dynalink.linker.LinkerServices;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "movie_id")
    private long movieId;

    @Column(name = "movie_name")
    private String movieName;

    @OneToMany
    private List<Show> shows;



}

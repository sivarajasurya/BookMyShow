package com.gcit.siva.bookmyshow.repository;

import com.gcit.siva.bookmyshow.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepo extends JpaRepository<Movie,Long> {
}

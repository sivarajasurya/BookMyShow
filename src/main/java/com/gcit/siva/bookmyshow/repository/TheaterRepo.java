package com.gcit.siva.bookmyshow.repository;

import com.gcit.siva.bookmyshow.entity.Theater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheaterRepo extends JpaRepository<Theater,Long> {
}

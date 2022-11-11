package com.gcit.siva.bookmyshow.repository;

import com.gcit.siva.bookmyshow.entity.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowRepo extends JpaRepository<Show,Long> {
}

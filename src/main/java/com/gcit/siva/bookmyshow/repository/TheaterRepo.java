package com.gcit.siva.bookmyshow.repository;

import com.gcit.siva.bookmyshow.entity.Theater;
import org.apache.catalina.LifecycleState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TheaterRepo extends JpaRepository<Theater,Long> {

//    @Query("FROM Theater")
//    List<Theater> getTheaters ();

}

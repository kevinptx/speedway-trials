package com.galvanize.repositories;

import com.galvanize.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarServiceRepoJao extends JpaRepository<Car, Long> {

}

package com.galvanize.services;

import com.galvanize.entities.Car;
import com.galvanize.entities.Status;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CarServiceTest {

    @Autowired
    CarService carService;

    @BeforeEach
    void setUp(){
        Car car = new Car();
    }
    
    @Test
    void createCarWithId() {
    Car car = new Car("The Condor", "Corvette", "2019", Status.AVAILABLE, "200");
    }
}

//   "id": 43,
//           "nickname": "The Condor",
//           "model": "Corvette",
//           "year": "2019",
//           "driver": {...},
//           "status": "AVAILABLE",
//           "top_speed": 200
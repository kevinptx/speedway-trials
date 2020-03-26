package com.galvanize.services;

import com.galvanize.entities.Car;
import com.galvanize.repositories.CarServiceRepoJao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CarServiceTest {

    @Autowired
    CarService carService;

    public CarServiceTest() {
    }

    @Autowired
    CarServiceRepoJao carServiceRepoJao;
    @BeforeEach
    void setUp(){
        Car car = new Car();
    }
    
    @Test
    void createCarWithId() {
        //Setup
    Car car = new Car("The Condor", "Corvette", "2019", Status.AVAILABLE, "200");
    CarService carService = new CarService(carServiceRepoJao);
    assertNotNull(carService.createNewCar("The Condor", "Corvette", "2019", Status.AVAILABLE, "200").getId());
    }
}

//   "id": 43,
//           "nickname": "The Condor",
//           "model": "Corvette",
//           "year": "2019",
//           "driver": {...},
//           "status": "AVAILABLE",
//           "top_speed": 200
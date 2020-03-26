package com.galvanize.services;

import com.galvanize.entities.Car;
import com.galvanize.repositories.CarServiceRepoJao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CarService {
    @Autowired
    CarServiceRepoJao carServiceRepoJao;

    public CarService() {
    }

    public CarService(CarServiceRepoJao carServiceRepoJao) {
        this.carServiceRepoJao = carServiceRepoJao;
    }

    public Car createNewCar(Car car) {
        car.setId(car.getId());
        return carServiceRepoJao.save(car);
    }
}

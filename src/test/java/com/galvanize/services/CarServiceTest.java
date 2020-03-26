package com.galvanize.services;

import com.galvanize.entities.Car;
import com.galvanize.entities.Driver;
import com.galvanize.entities.Status;
import com.galvanize.entities.model;
import com.galvanize.repositories.CarServiceRepoJao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest

//   "id": 43,
//           "nickname": "The Condor",
//           "model": "Corvette",
//           "year": "2019",
//           "driver": {...},
//           "status": "AVAILABLE",
//           "top_speed": 200

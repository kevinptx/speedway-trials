package com.galvanize.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@SpringBootTest
@AutoConfigureMockMvc
public class ControllerCarTest {

    @Autowired
    CarController carController;

    @Autowired
    MockMvc mvc;

    @Test
    void ControllerIsValid() {
        assertNotNull(carController);
    }

    @Test
    void getCars()throws Exception{
    mvc.perform(get("/api/cars/"))
                .andExpect(status().isOk());
    }
}

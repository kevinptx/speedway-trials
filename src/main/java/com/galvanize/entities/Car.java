package com.galvanize.entities;

import com.fasterxml.jackson.annotation.JsonValue;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "nickname")
    String nickname;
    @Column(name = "model")
    Enum model;
    @Column(name = "year")
    String year;
    @Column(name = "driver")
    Object driver;
    @Column(name = "status")
    Enum status;
    @Column(name = "top_speed")
    int topSpeed;

    public Car(Long id, String nickname, Enum model, String year, Object driver, Enum status, int topSpeed) {
        this.id = id;
        this.nickname = nickname;
        this.model = model;
        this.year = year;
        this.driver = driver;
        this.status = status;
        this.topSpeed = topSpeed;
    }

    public Car(String nickname, Enum model, String year, Object driver, Enum status, int topSpeed) {
        this.nickname = nickname;
        this.model = model;
        this.year = year;
        this.driver = driver;
        this.status = status;
        this.topSpeed = topSpeed;
    }

    public Car() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Enum getModel() {
        return model;
    }

    public void setModel(Enum model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Object getDriver() {
        return driver;
    }

    public void setDriver(Object driver) {
        this.driver = driver;
    }

    public Enum getStatus() {
        return status;
    }

    public void setStatus(Enum status) {
        this.status = status;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
}





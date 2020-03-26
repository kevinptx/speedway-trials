package com.galvanize.entities;

import javax.persistence.*;

@Entity
@Table(name = "drivers")
public class Driver {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "first_name")
    String firstName;
    @Column(name = "last_name")
    String lastName;
    @Column(name = "age")
    int age;
    @Column(name = "nickname")
    String nickname;
    @Column(name = "car")
    String car;
    @Column(name = "records")
    String records;
    @Column(name = "wins")
    int wins;
    @Column(name="losses")
    int losses;

    public Driver() {
    }

    public Driver(Long id, String firstName, String lastName, int age, String nickname,String car, String records, int wins, int losses) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.nickname = nickname;
        this.car = car;
        this.records = records;
        this.wins = wins;
        this.losses = losses;
    }


    public Driver(String firstName, String lastName, int age, String nickname, String car, String records, int wins, int losses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.nickname = nickname;
        this.car = car;
        this.records = records;
        this.wins = wins;
        this.losses = losses;
    }

    public Driver(long l, String asahi, String mojica, int i, String tato) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Object getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getRecords() {
        return records;
    }

    public void setRecords(String records) {
        this.records = records;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }
}

package com.galvanize.entities;

import com.fasterxml.jackson.annotation.JsonValue;

import javax.persistence.*;
import java.util.ArrayList;

//Race...
//        have a name, date, and best time (minutes, seconds, millseconds).
//        have participants (Drivers)
//        have a winner (a Driver).
//        have a category
//        STRETCH GOAL: have a Location.
//        Races have the following categories: open wheel, tour, sport car, rally, time attack, drag, off-road, stock car
//
//        An example of a race object:
//
//        {
//        "id": 17,
//        "name": "Grand Prix III",
//        "category": "stock car",
//        "date": "2020-06-03",
//        "bestTime": "03:36:78",
//        "winner": {...},
//        "participants": [...]
//        }

@Entity
@Table(name = "races")
public class Race {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "name")
    String name;
    @Column(name = "category")
    String category;
    @Column(name = "date")
    String date;
    @Column(name = "best_time")
    String bestTime;
    @Column(name = "winner")
    Object winner;
    @Column(name = "participants")
    String participants;
}

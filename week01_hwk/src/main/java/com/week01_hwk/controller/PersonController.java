package com.sparta.week01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PersonController {

    @GetMapping("/myinfo")
    public Person getPerson(){
        Person person = new Person();
        person.setName("son");
        person.setAddress("seoul");
        person.setAge(25);
        person.setJob("no");



        return person;
    }


}

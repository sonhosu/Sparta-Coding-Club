package com.week01_hwk.controller;

import com.week01_hwk.PersonRequestDto.PersonRequestDto;
import com.week01_hwk.Repository.PersonRepository;
import com.week01_hwk.Service.PersonService;
import com.week01_hwk.model.Person;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PersonController {

    private PersonRepository personRepository;
    private PersonService personService;

    @GetMapping("/api/persons")
    public List<Person> getPerson(){

        return personRepository.findAll();
    }

    @PostMapping("/api/persons")
    public Person createPerson(@RequestBody PersonRequestDto requestDto ){
        Person person = new Person(requestDto);

        return personRepository.save(person);
    }

    @PutMapping("/api/persons{id}")
    public Long upatePerson(@PathVariable Long id , @RequestBody PersonRequestDto requestDto ){

        return personService.update(id,requestDto);
    }



}

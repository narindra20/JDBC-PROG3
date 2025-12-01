package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.service.JdbcService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private final JdbcService jdbcService;

    public PersonController(JdbcService jdbcService) {
        this.jdbcService = jdbcService;
    }

    @GetMapping
    public List<Person> getAll() {
        return jdbcService.getAllPersons();
    }

    @PostMapping
    public String create(@RequestBody Person person) {
        jdbcService.insertPerson(person.getName());
        return "Personne ajoutée !";
    }
}

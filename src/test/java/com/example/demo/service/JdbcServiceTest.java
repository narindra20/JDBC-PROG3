package com.example.demo.service;

import com.example.demo.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
class JdbcServiceTest {

    @Autowired
    private JdbcService jdbcService;

    @Test
    void testInsertAndGetPerson() {
        // Insertion
        jdbcService.insertPerson("Alice");

        // Récupération
        List<Person> persons = jdbcService.getAllPersons();

        assertFalse(persons.isEmpty());

        //vérification
        persons.forEach(p -> System.out.println("ID: " + p.getId() + ", Name: " + p.getName()));
    }
}

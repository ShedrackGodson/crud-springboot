package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FakePersonDataAccessService implements PersonDao {
    public static List<Person> DB = new ArrayList<>(); // List of Person

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName())); // Adding a person
        return 1;
    }
}

package com.example.demo.service;

import com.example.demo.dao.PersonDao;
import com.example.demo.model.Person;

public class PersonService {

    private final PersonDao persondao;

    public PersonService(PersonDao personDao) {
        this.persondao = personDao;
    }

    public int addPerson(Person person){
        return persondao.insertPerson(person);
    }

}

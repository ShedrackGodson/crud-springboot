package com.example.demo.service;

import com.example.demo.dao.PersonDao;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonDao persondao;

    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
        this.persondao = personDao;
    }

    public int addPerson(Person person){
        return persondao.insertPerson(person);
    }

}

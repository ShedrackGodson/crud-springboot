package com.example.demo.api;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("api/v1/person") // An End Point
@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping // POST method to send data to the DB
    public void addPerson(@RequestBody Person person){
        personService.addPerson(person);
    }

    @GetMapping // GET method to retrieve data from the DB
    public List<Person> getAllPeople(){
        return personService.getAllPeople();
    }
}

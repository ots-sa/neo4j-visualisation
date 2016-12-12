package com.ots.controllers;

import com.ots.dto.PersonData;
import com.ots.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sdimitriadis on 12/12/2016.
 */
@RestController
@RequestMapping("person")
public class PersonController {
    
    @Autowired
    private PersonService personService;

    /**
     * Δοκιμαστική μέθοδος που τυπώνει hello world.
     */
    @RequestMapping("hello")
    public String sayHello() {
        return "Hello World";
    }
    
    @RequestMapping(path = "/surnamestartingwith/{surname}")
    public List<PersonData> getStartingWith(@PathVariable("surname") String surname) {
        return personService.findPersonDataStartingWithSurname(surname);
    }
}

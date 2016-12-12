package com.ots.services.impl;

import com.ots.dto.PersonData;
import com.ots.repositories.PersonRepository;
import com.ots.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sdimitriadis on 12/12/2016.
 */
@Service
public class PersonServiceImpl implements PersonService {
    
    @Autowired
    private PersonRepository personRepository;
    
    @Override
    public List<PersonData> findPersonDataStartingWithSurname(String surname) {
        return personRepository.findPersonDataStartingWithSurname(surname);
    }
}

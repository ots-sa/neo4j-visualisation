package com.ots.dto;

import com.ots.core.domain.Person;
import org.springframework.data.neo4j.annotation.QueryResult;

/**
 * Created by sdimitriadis on 12/12/2016.
 */
@QueryResult
public class PersonData {
    
    Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}

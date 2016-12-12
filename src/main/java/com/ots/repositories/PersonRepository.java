package com.ots.repositories;

import com.ots.core.domain.Person;
import com.ots.dto.PersonData;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sdimitriadis on 12/12/2016.
 */
@Repository
public interface PersonRepository extends GraphRepository<Person> {

    @Query("MATCH (person:Person) " +
            "WHERE person.surname STARTS WITH {surname} " +
            "RETURN person")
    List<PersonData> findPersonDataStartingWithSurname(@Param("surname") String surname);
}

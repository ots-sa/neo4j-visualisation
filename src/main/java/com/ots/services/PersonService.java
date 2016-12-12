package com.ots.services;

import com.ots.dto.PersonData;

import java.util.List;

/**
 * Created by sdimitriadis on 12/12/2016.
 */
public interface PersonService {

    /**
     * Ανάκτηση στοιχείων για πρόσωπα το όνομα των οποίων ξεκινά με το δεδομένο λεκτικό
     */
    List<PersonData> findPersonDataStartingWithSurname(String surname);
}

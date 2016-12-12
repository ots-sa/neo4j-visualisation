package com.ots.services;

import com.ots.alchemy.AlchemyObject;

/**
 * Created by sdimitriadis on 12/12/2016.
 */
public interface BirthService {
    
    AlchemyObject getAlchemyBirthByDescription(String description);
}

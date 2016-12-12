package com.ots.controllers;

import com.ots.alchemy.AlchemyObject;
import com.ots.services.BirthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sdimitriadis on 12/12/2016.
 */
@RestController
@RequestMapping("birth")
public class BirthController {
    
    @Autowired
    private BirthService birthService;
    
    @RequestMapping(path = "/bylocationdesc/{description}")
    public AlchemyObject getAlchemyBirthByDescription(@PathVariable("description") String description) {
        return birthService.getAlchemyBirthByDescription(description);
    }
}

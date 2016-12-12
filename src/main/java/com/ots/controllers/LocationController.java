package com.ots.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ots.dto.BirthData;
import com.ots.services.LocationService;
/**
 * 
 * @author domna
 *
 */
@RestController
@RequestMapping("location")
public class LocationController {

	@Autowired
	private LocationService locationService;
	
	@RequestMapping(path = "/locationbirth/{description}")
    public List<BirthData> getLocationBirth(@PathVariable("description") String description) {
        return locationService.getPersonsBornInLocationByDescription(description);
    }
}

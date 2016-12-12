package com.ots.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ots.dto.BirthData;
import com.ots.repositories.LocationRepository;
import com.ots.services.LocationService;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationRepository locationRepository;
	
	@Override
	public List<BirthData> getPersonsBornInLocationByDescription(String description) {
		return this.locationRepository.findPersonsBornInLocationByDescription(description);
	}
}

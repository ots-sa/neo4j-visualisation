package com.ots.services.impl;

import com.ots.alchemy.AlchemyBirthEdge;
import com.ots.alchemy.AlchemyLocationNode;
import com.ots.alchemy.AlchemyObject;
import com.ots.alchemy.AlchemyPersonNode;
import com.ots.core.domain.Location;
import com.ots.core.domain.Person;
import com.ots.dto.BirthData;
import com.ots.repositories.LocationRepository;
import com.ots.services.BirthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class BirthServiceImpl implements BirthService {

	@Autowired
	private LocationRepository locationRepository;
	
	@Override
	public AlchemyObject getAlchemyBirthByDescription(String description) {
		
		List<BirthData> birthDataList = locationRepository.findPersonsBornInLocationByDescription(description);
		
		AlchemyObject alchemyObject = new AlchemyObject();
		
		Boolean locationAdded = false;
		
		for(BirthData birthData: birthDataList) {
			
			Location location = birthData.getLocation();
			Set<Person> personSet = birthData.getPersonList();
			String birthdate = birthData.getBirthdate();
			
			if(location != null && !locationAdded) {
				AlchemyLocationNode locationNode = new AlchemyLocationNode();
				locationNode.setType("Τοποθεσία");
				locationNode.setId(location.getId());
				locationNode.setCode(location.getCode());
				locationNode.setDescription(location.getDescription());
				alchemyObject.getNodes().add(locationNode);
				
				locationAdded = true;
			}
			
			if(personSet != null) {
				for(Person person: personSet) {
					
					if(person != null) {
						AlchemyPersonNode personNode = new AlchemyPersonNode();
						personNode.setType("Πρόσωπο");
						personNode.setId(location.getId());
						personNode.setSurname(person.getSurname());
						personNode.setName(person.getName());
						personNode.setFathername(person.getFathername());
						personNode.setMothername(person.getMothername());
						personNode.setSex(person.getSex());
						alchemyObject.getNodes().add(personNode);

						AlchemyBirthEdge birthEdge = new AlchemyBirthEdge();
						birthEdge.setSource(person.getId());
						birthEdge.setTarget(location.getId());
						birthEdge.setCaption("Γεννήθηκε");
						birthEdge.setBirthdate(birthdate);
						alchemyObject.getEdges().add(birthEdge);
					}
					
				}
			}
			
		}
		
		return alchemyObject;
	}
}

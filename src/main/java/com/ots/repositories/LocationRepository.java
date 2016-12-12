package com.ots.repositories;

import com.ots.core.domain.Location;
import com.ots.dto.BirthData;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by sdimitriadis on 12/12/2016.
 */
@Repository
public interface LocationRepository extends GraphRepository<Location> {

	@Query("MATCH (person:Person)-[b:IS_BORN]->(location:Location) WHERE location.description = {description} " +
			"RETURN location AS location, collect(person) AS personList, b.birthdate AS birthdate")
	public List<BirthData> findPersonsBornInLocationByDescription(@Param("description") String description);

    
}

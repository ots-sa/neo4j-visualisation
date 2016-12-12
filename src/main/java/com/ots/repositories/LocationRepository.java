package com.ots.repositories;

import com.ots.core.domain.Location;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sdimitriadis on 12/12/2016.
 */
@Repository
public interface LocationRepository extends GraphRepository<Location> {

    
}

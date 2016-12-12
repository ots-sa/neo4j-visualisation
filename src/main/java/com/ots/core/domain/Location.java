package com.ots.core.domain;

import java.util.List;
import java.util.Set;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

/**
 * Τοποθεσία
 * Created by sdimitriadis on 12/12/2016.
 */
@NodeEntity
public class Location {

    @GraphId
    private Long id;
    
    private Integer code;
    
    private String description;
    
//    @RelatedToVia(type="ACTED_IN", direction = Direction.INCOMING)
//    private Set<Birth> births;
    
//    @Relationship(type = "IS_BORN", direction = Relationship.INCOMING)
//    private List<Person> persons;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
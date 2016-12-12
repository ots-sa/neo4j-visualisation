package com.ots.core.domain;

import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Πρόσωπο
 * Created by sdimitriadis on 12/12/2016.
 */
@NodeEntity
public class Person {

    private Long id;
    
    private String surname;

    private String name;
    
    private String fathername;
    
    private String mothername;
    
    private String sex;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getMothername() {
        return mothername;
    }

    public void setMothername(String mothername) {
        this.mothername = mothername;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
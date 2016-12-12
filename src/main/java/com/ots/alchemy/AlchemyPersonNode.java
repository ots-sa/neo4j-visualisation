package com.ots.alchemy;

/**
 * Created by sdimitriadis on 12/12/2016.
 */
public class AlchemyPersonNode extends AlchemyNode {
    
    private String surname;
    
    private String name;
    
    private String fathername;
    
    private String mothername;
    
    private String sex;

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

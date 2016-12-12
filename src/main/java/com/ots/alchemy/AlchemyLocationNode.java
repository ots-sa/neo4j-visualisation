package com.ots.alchemy;

/**
 * Created by sdimitriadis on 12/12/2016.
 */
public class AlchemyLocationNode extends AlchemyNode {
    
    private String code;
    
    private String description;
    
    private String type;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }
}

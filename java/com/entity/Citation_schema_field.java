package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="citation_schema_field")
public class Citation_schema_field {

    @Id
    @Column(name = "SCHEMA_ID")
    private String SCHEMA_ID;

    @Column(name = "FIELD_ID")
    private String FIELD_ID;

    @Column(name = "PROPERTY_NAME")
    private String PROPERTY_NAME;

    @Column(name = "PROPERTY_VALUE")
    private String PROPERTY_VALUE;

    public String getSCHEMA_ID() {
        return SCHEMA_ID;
    }

    public void setSCHEMA_ID(String SCHEMA_ID) {
        this.SCHEMA_ID = SCHEMA_ID;
    }

    public String getFIELD_ID() {
        return FIELD_ID;
    }

    public void setFIELD_ID(String FIELD_ID) {
        this.FIELD_ID = FIELD_ID;
    }

    public String getPROPERTY_NAME() {
        return PROPERTY_NAME;
    }

    public void setPROPERTY_NAME(String PROPERTY_NAME) {
        this.PROPERTY_NAME = PROPERTY_NAME;
    }

    public String getPROPERTY_VALUE() {
        return PROPERTY_VALUE;
    }

    public void setPROPERTY_VALUE(String PROPERTY_VALUE) {
        this.PROPERTY_VALUE = PROPERTY_VALUE;
    }

    @Override
    public String toString() {
        return "Citation_schema_field{" +
                "SCHEMA_ID='" + SCHEMA_ID + '\'' +
                ", FIELD_ID='" + FIELD_ID + '\'' +
                ", PROPERTY_NAME='" + PROPERTY_NAME + '\'' +
                ", PROPERTY_VALUE='" + PROPERTY_VALUE + '\'' +
                '}';
    }

    public Citation_schema_field() {
    }
}

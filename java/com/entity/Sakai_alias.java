package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="sakai_alias")
public class Sakai_alias {
    @Id
    @Column(name = "ALIAS_ID")
    private String ALIAS_ID;

    @Column(name = "TARGET")
    private String TARGET;

    @Column(name = "CREATEDBY")
    private String CREATEDBY;

    @Column(name = "MODIFIEDBY")
    private String MODIFIEDBY;

    @Column(name = "CREATEDON")
    private Date CREATEDON;

    public String getALIAS_ID() {
        return ALIAS_ID;
    }

    public void setALIAS_ID(String ALIAS_ID) {
        this.ALIAS_ID = ALIAS_ID;
    }

    public String getTARGET() {
        return TARGET;
    }

    public void setTARGET(String TARGET) {
        this.TARGET = TARGET;
    }

    public String getCREATEDBY() {
        return CREATEDBY;
    }

    public void setCREATEDBY(String CREATEDBY) {
        this.CREATEDBY = CREATEDBY;
    }

    public String getMODIFIEDBY() {
        return MODIFIEDBY;
    }

    public void setMODIFIEDBY(String MODIFIEDBY) {
        this.MODIFIEDBY = MODIFIEDBY;
    }

    public Date getCREATEDON() {
        return CREATEDON;
    }

    public void setCREATEDON(Date CREATEDON) {
        this.CREATEDON = CREATEDON;
    }

    public Sakai_alias() {
    }

    @Override
    public String toString() {
        return "Sakai_alias{" +
                "ALIAS_ID='" + ALIAS_ID + '\'' +
                ", TARGET='" + TARGET + '\'' +
                ", CREATEDBY='" + CREATEDBY + '\'' +
                ", MODIFIEDBY='" + MODIFIEDBY + '\'' +
                ", CREATEDON=" + CREATEDON +
                '}';
    }
}

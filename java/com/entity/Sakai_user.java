package com.entity;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="sakai_user")
public class Sakai_user {

    @Id
    @Column(name = "USER_ID")
    private String USER_ID;

    @Column(name = "EMAIL")
    private String EMAIL;

    @Column(name = "EMAIL_LC")
    private String EMAIL_LC;

    @Column(name = "FIRST_NAME")
    private String FIRST_NAME;

    @Column(name = "LAST_NAME")
    private String LAST_NAME;

    @Column(name = "TYPE")
    private String TYPE;

    @Column(name = "PW")
    private String PW;

    @Column(name = "CREATEDBY")
    private String CREATEDBY;

    @Column(name = "MODIFIEDBY")
    private String MODIFIEDBY;

    @Column(name = "CREATEDON")
    private Date CREATEDON;

    @Column(name = "MODIFIEDON")
    private Date MODIFIEDON;

    public Sakai_user() {

    }

    public Sakai_user(String uSER_ID, String eMAIL, String eMAIL_LC, String fIRST_NAME, String lAST_NAME, String tYPE,
                      String pW, String cREATEDBY, String mODIFIEDBY, Date cREATEDON, Date mODIFIEDON) {
        USER_ID = uSER_ID;
        EMAIL = eMAIL;
        EMAIL_LC = eMAIL_LC;
        FIRST_NAME = fIRST_NAME;
        LAST_NAME = lAST_NAME;
        TYPE = tYPE;
        PW = pW;
        CREATEDBY = cREATEDBY;
        MODIFIEDBY = mODIFIEDBY;
        CREATEDON = cREATEDON;
        MODIFIEDON = mODIFIEDON;
    }

    public String getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(String uSER_ID) {
        USER_ID = uSER_ID;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String eMAIL) {
        EMAIL = eMAIL;
    }

    public String getEMAIL_LC() {
        return EMAIL_LC;
    }

    public void setEMAIL_LC(String eMAIL_LC) {
        EMAIL_LC = eMAIL_LC;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public void setFIRST_NAME(String fIRST_NAME) {
        FIRST_NAME = fIRST_NAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public void setLAST_NAME(String lAST_NAME) {
        LAST_NAME = lAST_NAME;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String tYPE) {
        TYPE = tYPE;
    }

    public String getPW() {
        return PW;
    }

    public void setPW(String pW) {
        PW = pW;
    }

    public String getCREATEDBY() {
        return CREATEDBY;
    }

    public void setCREATEDBY(String cREATEDBY) {
        CREATEDBY = cREATEDBY;
    }

    public String getMODIFIEDBY() {
        return MODIFIEDBY;
    }

    public void setMODIFIEDBY(String mODIFIEDBY) {
        MODIFIEDBY = mODIFIEDBY;
    }

    public Date getCREATEDON() {
        return CREATEDON;
    }

    public void setCREATEDON(Date cREATEDON) {
        CREATEDON = cREATEDON;
    }

    public Date getMODIFIEDON() {
        return MODIFIEDON;
    }

    public void setMODIFIEDON(Date mODIFIEDON) {
        MODIFIEDON = mODIFIEDON;
    }

    @Override
    public String toString() {
        return "Sakai_user [USER_ID=" + USER_ID + ", EMAIL=" + EMAIL + ", EMAIL_LC=" + EMAIL_LC + ", FIRST_NAME="
                + FIRST_NAME + ", LAST_NAME=" + LAST_NAME + ", TYPE=" + TYPE + ", PW=" + PW + ", CREATEDBY=" + CREATEDBY
                + ", MODIFIEDBY=" + MODIFIEDBY + ", CREATEDON=" + CREATEDON + ", MODIFIEDON=" + MODIFIEDON + "]";
    }

}


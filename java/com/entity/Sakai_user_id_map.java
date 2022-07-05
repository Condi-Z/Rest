package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sakai_user_id_map")
public class Sakai_user_id_map {
    @Id
    @Column(name = "USER_ID")
    private String USER_ID;
    @Column(name = "EID")
    private String EID;

    public String getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(String uSER_ID) {
        USER_ID = uSER_ID;
    }

    public String getEID() {
        return EID;
    }

    public void setEID(String eID) {
        EID = eID;
    }

    @Override
    public String toString() {
        return "Sakai_user_id_map [USER_ID=" + USER_ID + ", EID=" + EID + "]";
    }

    public Sakai_user_id_map(String USER_ID, String EID) {
        this.USER_ID = USER_ID;
        this.EID = EID;
    }
    public Sakai_user_id_map() {

    }

}

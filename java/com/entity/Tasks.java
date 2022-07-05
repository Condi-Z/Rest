package com.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="tasks")
public class Tasks {

    @Id
    @Column(name = "ID")
    private int ID;

    @Column(name = "DESCRIPTION")
    private String DESCRIPTION;

    @Column(name = "DUE")
    private Date DUE;

    @Column(name = "REFERENCE")
    private String REFERENCE;

    @Column(name = "SITE_ID")
    private String SITE_ID;

    @Column(name = "STARTS")
    private Date STARTS;

    @Column(name = "SYSTEM")
    private Boolean SYSTEM;

    public int getID() {
        return ID;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public Date getDUE() {
        return DUE;
    }

    public String getREFERENCE() {
        return REFERENCE;
    }

    public String getSITE_ID() {
        return SITE_ID;
    }

    public Date getSTARTS() {
        return STARTS;
    }

    public Boolean getSYSTEM() {
        return SYSTEM;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public void setDUE(Date DUE) {
        this.DUE = DUE;
    }

    public void setREFERENCE(String REFERENCE) {
        this.REFERENCE = REFERENCE;
    }

    public void setSITE_ID(String SITE_ID) {
        this.SITE_ID = SITE_ID;
    }

    public void setSTARTS(Date STARTS) {
        this.STARTS = STARTS;
    }

    public void setSYSTEM(Boolean SYSTEM) {
        this.SYSTEM = SYSTEM;
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "ID=" + ID +
                ", DESCRIPTION='" + DESCRIPTION + '\'' +
                ", DUE=" + DUE +
                ", REFERENCE='" + REFERENCE + '\'' +
                ", SITE_ID='" + SITE_ID + '\'' +
                ", STARTS=" + STARTS +
                ", SYSTEM=" + SYSTEM +
                '}';
    }

    public Tasks(int ID, String DESCRIPTION, Date DUE, String REFERENCE, String SITE_ID, Date STARTS, Boolean SYSTEM) {
        this.ID = ID;
        this.DESCRIPTION = DESCRIPTION;
        this.DUE = DUE;
        this.REFERENCE = REFERENCE;
        this.SITE_ID = SITE_ID;
        this.STARTS = STARTS;
        this.SYSTEM = SYSTEM;
    }

    public Tasks() {
    }
}

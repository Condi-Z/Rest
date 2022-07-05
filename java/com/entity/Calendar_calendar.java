package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="calendar_calendar")
public class Calendar_calendar {

    @Id
    @Column(name = "CALENDAR_ID")
    private String CALENDAR_ID;

    @Column(name = "NEXT_ID")
    private int NEXT_ID;

    @Column(name = "XML")
    private String XML;

    public String getCALENDAR_ID() {
        return CALENDAR_ID;
    }

    public void setCALENDAR_ID(String CALENDAR_ID) {
        this.CALENDAR_ID = CALENDAR_ID;
    }

    public int getNEXT_ID() {
        return NEXT_ID;
    }

    public void setNEXT_ID(int NEXT_ID) {
        this.NEXT_ID = NEXT_ID;
    }

    public String getXML() {
        return XML;
    }

    public void setXML(String XML) {
        this.XML = XML;
    }

    @Override
    public String toString() {
        return "Calendar_calendar{" +
                "CALENDAR_ID='" + CALENDAR_ID + '\'' +
                ", NEXT_ID=" + NEXT_ID +
                ", XML='" + XML + '\'' +
                '}';
    }

    public Calendar_calendar() {

    }
}

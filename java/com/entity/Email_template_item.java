package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="email_template_item")
public class Email_template_item {
    @Id
    @Column(name = "ID")
    private int ID;

    @Column(name = "LAST_MODIFIED")
    private Date LAST_MODIFIED;

    @Column(name = "OWNER")
    private String OWNER;

    @Column(name = "SUBJECT")
    private String SUBJECT;

    @Column(name = "emailfrom")
    private String emailfrom;

    @Column(name = "MESSAGE")
    private String MESSAGE;

    @Column(name = "HTMLMESSAGE")
    private String HTMLMESSAGE;

    @Column(name = "TEMPLATE_KEY")
    private String TEMPLATE_KEY;

    @Column(name = "TEMPLATE_LOCALE")
    private String TEMPLATE_LOCALE;


    public Email_template_item() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getLAST_MODIFIED() {
        return LAST_MODIFIED;
    }

    public void setLAST_MODIFIED(Date LAST_MODIFIED) {
        this.LAST_MODIFIED = LAST_MODIFIED;
    }

    public String getOWNER() {
        return OWNER;
    }

    public void setOWNER(String OWNER) {
        this.OWNER = OWNER;
    }

    public String getSUBJECT() {
        return SUBJECT;
    }

    public void setSUBJECT(String SUBJECT) {
        this.SUBJECT = SUBJECT;
    }

    public String getEmailfrom() {
        return emailfrom;
    }

    public void setEmailfrom(String emailfrom) {
        this.emailfrom = emailfrom;
    }

    public String getMESSAGE() {
        return MESSAGE;
    }

    public void setMESSAGE(String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }

    public String getHTMLMESSAGE() {
        return HTMLMESSAGE;
    }

    public void setHTMLMESSAGE(String HTMLMESSAGE) {
        this.HTMLMESSAGE = HTMLMESSAGE;
    }

    public String getTEMPLATE_KEY() {
        return TEMPLATE_KEY;
    }

    public void setTEMPLATE_KEY(String TEMPLATE_KEY) {
        this.TEMPLATE_KEY = TEMPLATE_KEY;
    }

    public String getTEMPLATE_LOCALE() {
        return TEMPLATE_LOCALE;
    }

    public void setTEMPLATE_LOCALE(String TEMPLATE_LOCALE) {
        this.TEMPLATE_LOCALE = TEMPLATE_LOCALE;
    }


    @Override
    public String toString() {
        return "Email_template_item{" +
                "ID=" + ID +
                ", LAST_MODIFIED=" + LAST_MODIFIED +
                ", OWNER='" + OWNER + '\'' +
                ", SUBJECT='" + SUBJECT + '\'' +
                ", emailfrom='" + emailfrom + '\'' +
                ", MESSAGE='" + MESSAGE + '\'' +
                ", HTMLMESSAGE='" + HTMLMESSAGE + '\'' +
                ", TEMPLATE_KEY='" + TEMPLATE_KEY + '\'' +
                ", TEMPLATE_LOCALE='" + TEMPLATE_LOCALE + '\'' +
                '}';
    }
}

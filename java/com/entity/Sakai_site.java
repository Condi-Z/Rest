package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sakai_site")
public class Sakai_site {

    @Id
    @Column(name = "SITE_ID")
    private String SITE_ID;

    @Column(name = "TITLE")
    private String TITLE;

    @Column(name = "TYPE")
    private String TYPE;

    @Column(name = "SHORT_DESC")
    private String SHORT_DESC;

    @Column(name = "DESCRIPTION")
    private String DESCRIPTION;

    @Column(name = "ICON_URL")
    private String ICON_URL;

    @Column(name = "INFO_URL")
    private String INFO_URL;

    @Column(name = "SKIN")
    private String SKIN;

    @Column(name = "PUBLISHED")
    private int PUBLISHED;

    @Column(name = "JOINABLE")
    private String JOINABLE;

    @Column(name = "PUBVIEW")
    private String PUBVIEW;

    @Column(name = "JOIN_ROLE")
    private String JOIN_ROLE;

    @Column(name = "CREATEDBY")
    private String CREATEDBY;

    @Column(name = "MODIFIEDBY")
    private String MODIFIEDBY;

    @Column(name = "IS_SPECIAL")
    private String IS_SPECIAL;

    @Column(name = "IS_USER")
    private String IS_USER;

    @Column(name = "CUSTOM_PAGE_ORDERED")
    private String CUSTOM_PAGE_ORDERED;

    @Column(name = "IS_SOFTLY_DELETED")
    private String IS_SOFTLY_DELETED;

    public Sakai_site() {
    }

    @Override
    public String toString() {
        return "Sakai_site{" +
                "SITE_ID='" + SITE_ID + '\'' +
                ", TITLE='" + TITLE + '\'' +
                ", TYPE='" + TYPE + '\'' +
                ", SHORT_DESC='" + SHORT_DESC + '\'' +
                ", DESCRIPTION='" + DESCRIPTION + '\'' +
                ", ICON_URL='" + ICON_URL + '\'' +
                ", INFO_URL='" + INFO_URL + '\'' +
                ", SKIN='" + SKIN + '\'' +
                ", PUBLISHED=" + PUBLISHED +
                ", JOINABLE='" + JOINABLE + '\'' +
                ", PUBVIEW='" + PUBVIEW + '\'' +
                ", JOIN_ROLE='" + JOIN_ROLE + '\'' +
                ", CREATEDBY='" + CREATEDBY + '\'' +
                ", MODIFIEDBY='" + MODIFIEDBY + '\'' +
                ", IS_SPECIAL='" + IS_SPECIAL + '\'' +
                ", IS_USER='" + IS_USER + '\'' +
                ", CUSTOM_PAGE_ORDERED='" + CUSTOM_PAGE_ORDERED + '\'' +
                ", IS_SOFTLY_DELETED='" + IS_SOFTLY_DELETED + '\'' +
                '}';
    }

    public String getSITE_ID() {
        return SITE_ID;
    }

    public void setSITE_ID(String SITE_ID) {
        this.SITE_ID = SITE_ID;
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public String getSHORT_DESC() {
        return SHORT_DESC;
    }

    public void setSHORT_DESC(String SHORT_DESC) {
        this.SHORT_DESC = SHORT_DESC;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public String getICON_URL() {
        return ICON_URL;
    }

    public void setICON_URL(String ICON_URL) {
        this.ICON_URL = ICON_URL;
    }

    public String getINFO_URL() {
        return INFO_URL;
    }

    public void setINFO_URL(String INFO_URL) {
        this.INFO_URL = INFO_URL;
    }

    public String getSKIN() {
        return SKIN;
    }

    public void setSKIN(String SKIN) {
        this.SKIN = SKIN;
    }

    public int getPUBLISHED() {
        return PUBLISHED;
    }

    public void setPUBLISHED(int PUBLISHED) {
        this.PUBLISHED = PUBLISHED;
    }

    public String getJOINABLE() {
        return JOINABLE;
    }

    public void setJOINABLE(String JOINABLE) {
        this.JOINABLE = JOINABLE;
    }

    public String getPUBVIEW() {
        return PUBVIEW;
    }

    public void setPUBVIEW(String PUBVIEW) {
        this.PUBVIEW = PUBVIEW;
    }

    public String getJOIN_ROLE() {
        return JOIN_ROLE;
    }

    public void setJOIN_ROLE(String JOIN_ROLE) {
        this.JOIN_ROLE = JOIN_ROLE;
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

    public String getIS_SPECIAL() {
        return IS_SPECIAL;
    }

    public void setIS_SPECIAL(String IS_SPECIAL) {
        this.IS_SPECIAL = IS_SPECIAL;
    }

    public String getIS_USER() {
        return IS_USER;
    }

    public void setIS_USER(String IS_USER) {
        this.IS_USER = IS_USER;
    }

    public String getCUSTOM_PAGE_ORDERED() {
        return CUSTOM_PAGE_ORDERED;
    }

    public void setCUSTOM_PAGE_ORDERED(String CUSTOM_PAGE_ORDERED) {
        this.CUSTOM_PAGE_ORDERED = CUSTOM_PAGE_ORDERED;
    }

    public String getIS_SOFTLY_DELETED() {
        return IS_SOFTLY_DELETED;
    }

    public void setIS_SOFTLY_DELETED(String IS_SOFTLY_DELETED) {
        this.IS_SOFTLY_DELETED = IS_SOFTLY_DELETED;
    }
}

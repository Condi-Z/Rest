package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="scheduler_trigger_events")
public class Scheduler_trigger_events {

    @Id
    @Column(name = "uuid")
    private String uuid;

    @Column(name = "eventtype")
    private String eventType;

    @Column(name = "jobname")
    private String jobName;

    @Column(name = "message")
    private String message;

    @Column(name = "serverid")
    private String serverId;

    @Column(name = "eventtime")
    private Date eventTime;

    @Column(name = "triggername")
    private String triggerName;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    @Override
    public String toString() {
        return "Scheduler_trigger_events{" +
                "uuid='" + uuid + '\'' +
                ", eventType='" + eventType + '\'' +
                ", jobName='" + jobName + '\'' +
                ", message='" + message + '\'' +
                ", serverId='" + serverId + '\'' +
                ", eventTime='" + eventTime + '\'' +
                ", triggerName='" + triggerName + '\'' +
                '}';
    }
}


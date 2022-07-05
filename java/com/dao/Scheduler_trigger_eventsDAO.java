package com.dao;

import com.entity.Calendar_calendar;
import com.entity.Email_template_item;
import com.entity.Sakai_user;
import com.entity.Scheduler_trigger_events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Scheduler_trigger_eventsDAO extends JpaRepository<Scheduler_trigger_events,String> {

    @Query(value = "SELECT u FROM Scheduler_trigger_events u WHERE u.uuid = :uuid ")
    List<Scheduler_trigger_events> getByid(@Param("uuid") String uuid);
}

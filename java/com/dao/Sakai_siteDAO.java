package com.dao;

import com.entity.Calendar_calendar;
import com.entity.Email_template_item;
import com.entity.Sakai_site;
import com.entity.Sakai_user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Sakai_siteDAO extends JpaRepository<Sakai_site,String> {

    @Query(value = "SELECT u FROM Sakai_site u WHERE u.SITE_ID = :SITE_ID ")
    List<Sakai_site> getByid(@Param("SITE_ID") String SITE_ID);
}
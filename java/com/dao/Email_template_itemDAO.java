package com.dao;

import com.entity.Calendar_calendar;
import com.entity.Email_template_item;
import com.entity.Sakai_user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Email_template_itemDAO extends JpaRepository<Email_template_item,Integer> {

    @Query(value = "SELECT u FROM Email_template_item u WHERE u.ID = :ID ")
    List<Email_template_item> getByid(@Param("ID") int ID);
}

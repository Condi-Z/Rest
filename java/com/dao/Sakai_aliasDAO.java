package com.dao;

import com.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Sakai_aliasDAO extends JpaRepository<Sakai_alias,String> {

    @Query(value = "SELECT u FROM Sakai_alias u WHERE u.ALIAS_ID = :ALIAS_ID ")
    List<Sakai_alias> getByid(@Param("ALIAS_ID") String ALIAS_ID);
}

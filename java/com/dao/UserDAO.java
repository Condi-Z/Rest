package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.entity.Sakai_user;

import java.util.List;


public interface UserDAO extends JpaRepository<Sakai_user,String> {

    @Query(value = "SELECT u FROM Sakai_user u WHERE u.USER_ID = :USER_ID ")
    List<Sakai_user> getuserByid(@Param("USER_ID") String USER_ID);

    @Query(value = "from Sakai_user as t0,Sakai_user_id_map as t1 where t0.USER_ID=t1.USER_ID")
    List<Sakai_user> getuser();

}
package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Sakai_user_id_map;


public interface UserMapDAO extends JpaRepository<Sakai_user_id_map,String> {

}
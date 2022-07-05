package com.dao;

import com.entity.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TasksDAO extends JpaRepository<Tasks,Integer> {

}

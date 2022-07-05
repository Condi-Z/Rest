package com.dao;

import com.entity.Citation_schema;
import com.entity.Citation_schema_field;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Citation_schemaDAO extends JpaRepository<Citation_schema,String> {

}
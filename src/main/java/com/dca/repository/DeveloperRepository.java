package com.dca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dca.entity.Developer;

@Repository
public interface DeveloperRepository extends JpaRepository<Developer,Integer>{

	

}


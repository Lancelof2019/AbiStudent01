package com.example.StudentCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StudentCrud.domain.registerInfo;

@Repository
public interface registerInfoRepository extends JpaRepository<registerInfo,String>{

	
	
	
	
}
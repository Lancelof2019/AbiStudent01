package com.example.StudentCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.StudentCrud.domain.Student;
import com.example.StudentCrud.domain.registerInfo;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

	//void save(registerInfo reginfo);

	
	
	
	
}




package com.example.StudentCrud.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.StudentCrud.domain.Student;
import com.example.StudentCrud.domain.registerInfo;
import com.example.StudentCrud.repository.StudentRepository;
import com.example.StudentCrud.repository.registerInfoRepository;
@Service
public class registerService {
	 @Autowired
	 private registerInfoRepository repo1;
	 
	 public List<registerInfo> listAll(){
	 
	 return repo1.findAll();
	 }
	 
	 public void save(registerInfo info){
		 
	 repo1.save(info);
	 }

	 public registerInfo  get(String uid){

	 return repo1.findById(uid).get();
	 }

	 public void delete(String uid){

	 repo1.deleteById(uid);
	 }
}

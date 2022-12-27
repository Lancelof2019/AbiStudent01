package com.example.StudentCrud.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//@Table(name = "student_courses")
@Table(name = "student")
public class Student {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String studentname;
    private String course;
    private int fee;
    //private String pwd;
   // private String uid;
    
public Student() {
 
}
public Student(int id, String studentname, String course, int fee,String uid,String pwd) {
this.id = id;
this.studentname = studentname;
this.course = course;
this.fee = fee;
//this.uid=uid;
//this.pwd=pwd;
}
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getStudentname() {
return studentname;
}
public void setStudentname(String studentname) {
this.studentname = studentname;
}
public String getCourse() {
return course;
}
public void setCourse(String course) {
this.course = course;
}
public int getFee() {
return fee;
}
public void setFee(int fee) {
this.fee = fee;
}
/*
public String getuid() {
return uid;
}
public void setuid(String uid) {
this.uid = uid;
}

public String getpwd() {
return pwd;
}
public void setpwd(String pwd) {
this.pwd= pwd;
}
*/
}


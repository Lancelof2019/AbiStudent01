package com.example.StudentCrud.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name ="regis_information")
public class registerInfo {

	public registerInfo() {
	
	}
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
	private String uid;
	private String username;
	private String password;
	private String last_name;
	private String first_name;
	private String email;
	private String telephone;
	
	public String getUid() {
		return uid;
		}
	
		public void setUid(String uid) {
		this.uid = uid;
		}
		
		
		public String getPassword() {
			return password;
			}
		
		public void setPassword(String password) {
		this.password = password;
		}

		public String getUsername() {
			return username;
			}
		
		public void setUsername(String username) {
		this.username = username;
		}
	
		
		public String getLast_name() {
			return last_name;
			}
		
		public void setLast_name(String last_name) {
		this.last_name = last_name;
		}
	
		
		public String getFirst_name() {
			return first_name;
			}
		
		public void setFirst_name(String first_name) {
		this.first_name = first_name;
		}
		public String getEmail() {
			return email;
			}
		public void setEmail(String email) {
			this.email= email;
			}

	   
		public String getTelephone() {
			return telephone;
			}
		public void setTelephone(String telephone) {
		this.telephone= telephone;
		}
	
}

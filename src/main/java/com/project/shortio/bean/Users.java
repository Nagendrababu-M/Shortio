package com.project.shortio.bean;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Users {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String userName;
	private String email;
	private String password;
	private String phone;
	private String organization;
	private String environment;
	private Timestamp createdTime;
	private Timestamp lastModifiedTime;
	private int privilize;
	private String dp;
}

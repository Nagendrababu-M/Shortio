package com.project.shortio.services;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.shortio.bean.Users;
import com.project.shortio.repository.UserRepository;

@Service
public class UserServices {

	@Autowired
	private UserRepository userRepo;
	public Users createUser(Users user) {
		Timestamp tsp = new Timestamp(System.currentTimeMillis());
		user.setCreatedTime(tsp);
		user.setLastModifiedTime(tsp);
		return userRepo.save(user);
	}

}

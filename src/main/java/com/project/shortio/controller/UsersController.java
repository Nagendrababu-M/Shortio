package com.project.shortio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.shortio.bean.Users;
import com.project.shortio.services.UserServices;

import ch.qos.logback.classic.Logger;
import jakarta.validation.Valid;

@RestController
@RequestMapping("UsersController")
public class UsersController {

	@Autowired
	private UserServices userServ;
	
	private final Logger Log = (Logger) org.slf4j.LoggerFactory.getLogger(UsersController.class);
	@PostMapping("/createUser")
	public Users createUser(@Valid @RequestBody Users user) {
		Log.info("Create User method.\n Request information : "+user.toString());
		return userServ.createUser(user);
	}
}

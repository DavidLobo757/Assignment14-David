package com.coderscampus.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.coderscampus.domain.User;
import com.coderscampus.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/users")
	@ResponseBody
	public User createUser (@RequestBody String name) {
		return userService.createUser(name);
	}
	
	
}

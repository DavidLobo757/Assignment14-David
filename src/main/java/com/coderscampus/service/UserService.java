package com.coderscampus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.domain.User;
import com.coderscampus.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public User createUser (String name) {
		User user = new User();
		user.setName(name);
		return userRepo.save(user);
	}
}

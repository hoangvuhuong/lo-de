package com.huong.keylog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huong.keylog.model.User;
import com.huong.keylog.repository.UserRepository;

@Service
public class UserService {
	@Autowired 
	UserRepository userRepository;
	public int create(User user) {
		return userRepository.create(user);
	}
}

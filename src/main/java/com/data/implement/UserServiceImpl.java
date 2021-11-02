package com.data.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.data.Model.User;
import com.data.Repository.UserRepository;
import com.data.services.UserService;

@Transactional
@Component
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public User editUser(User user, String username) {
		
		User existUser= userRepository.findByUsername(username).orElse(null);
		existUser.setUsername(user.getUsername());
		existUser.setEmail(user.getEmail());
		existUser.setPassword(user.getPassword());
		existUser.setTitle(user.getTitle());
		existUser.setBirthdate(user.getBirthdate());
		
		return userRepository.save(existUser);
		
	}
	
	@Override
	public User findUserByUsername(String username) {
		
		return userRepository.findByUsername(username).orElse(null);
	}

}

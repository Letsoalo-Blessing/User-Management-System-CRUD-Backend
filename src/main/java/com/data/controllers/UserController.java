package com.data.controllers;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.Model.User;
import com.data.Repository.RoleRepository;
import com.data.Repository.UserRepository;
import com.data.services.UserService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RoleRepository roleRepository;
	
	@Autowired
	UserService userService;
	
	@GetMapping("/getUsers")
	public List<User> getUsers() {

		return userRepository.findAll();
	}
	
	@DeleteMapping("/deleteUser/{id}")
	void deleteCart(@PathVariable ObjectId id) {

		userRepository.deleteById(id);
	
	}
	@GetMapping("findUserByUsername/{username}")
	User findUserByUsername(@PathVariable String username){
		
		return userService.findUserByUsername(username);
	}
	
	@PutMapping("/editUser/{username}")
	User editUser(@RequestBody User user, @PathVariable String username) {
		
		return userService.editUser(user, username);
	}
	

}

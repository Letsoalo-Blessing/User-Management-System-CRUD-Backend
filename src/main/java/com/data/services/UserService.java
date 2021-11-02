package com.data.services;


import com.data.Model.User;

public interface UserService {
	
	User editUser(User user, String username);
	
	User findUserByUsername(String username);

}

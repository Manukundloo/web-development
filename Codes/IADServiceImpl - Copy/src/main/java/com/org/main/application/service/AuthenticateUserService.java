/*package com.org.main.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.org.main.application.controller.User;
import com.org.main.application.controller.UserDetailImpl;
import com.org.main.application.controller.UserRepository;


@Service
public class AuthenticateUserService implements UserDetailsService{
	
	@Autowired
	private UserRepository repo;
	
	public String authenticateUser(){
		return "home.jsp";
	}

	@Override
	public UserDetails loadUserByUsername(String username)throws UsernameNotFoundException {
		
		User user = repo.findByuserName(username);
		
		if(user == null){
			throw new UsernameNotFoundException("User 404");
		}
		return new UserDetailImpl(user);
	}

}
*/
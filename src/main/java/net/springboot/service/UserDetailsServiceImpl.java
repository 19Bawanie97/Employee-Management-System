package net.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import net.springboot.controller.MyUserDetails;
import net.springboot.model.User;
import net.springboot.repo.UserRepository;

public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.getUserByUsername(username);
		
		if (user == null) {
			throw new UsernameNotFoundException("Could Not Find User");
		}
		
		return new MyUserDetails(user);
	}

}


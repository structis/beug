package com.structis.beug.part2;

import java.util.List;

import com.structis.beug.part2.entity.User;
import com.structis.beug.part2.exceptions.UserNotFoundException;

public class UserService {

	private IArgosWService wService;

	public UserService(IArgosWService wService) {
		this.wService = wService;
	}

	public User findById(Long id) throws UserNotFoundException {
		return wService.findUserById(id);
	}
	
	public List<User> findUsers() {
		
		String criteria = "appli=beug&max=100";
		
		return wService.findUsersByCriteria(criteria);
	}
	
	public Long saveUser(User user) {
		return wService.saveUser(user);
	}
	
	public void deactivateUser(Long id) throws UserNotFoundException {
		wService.deactivateUser(id);
	}
	
	public IArgosWService getwService() {
		return wService;
	}

	public void setwService(IArgosWService wService) {
		this.wService = wService;
	}
}

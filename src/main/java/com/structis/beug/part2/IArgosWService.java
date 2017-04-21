package com.structis.beug.part2;

import java.util.List;

import com.structis.beug.part2.entity.User;
import com.structis.beug.part2.exceptions.UserNotFoundException;

public interface IArgosWService {

	User findUserById(Long id) throws UserNotFoundException;
	
	List<User> findUsersByCriteria(String criteria);
	
	Long saveUser(User user);
	
	boolean deactivateUser(Long id) throws UserNotFoundException;
}

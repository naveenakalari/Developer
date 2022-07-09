package com.dca.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dca.dto.UserDto;
import com.dca.entity.User;
import com.dca.repository.UserRepository;
import com.dca.service.IUserService;


@Service
public class UserService implements IUserService{
	
	@Autowired
	public UserRepository userRepository;
	
	@Autowired
	public DeveloperService ds;
	
	public String validateUser(int userId ,String password){
	  if( userRepository.findByUserIdAndPassword(userId, password) != null) {
		  return "Valid user";
	  }
      return "Invalid user,Please Register";
	}
	
	public List<UserDto> addUser(UserDto userdto) 
	  {
		User user = new User();
		List<UserDto> userDtoList = new ArrayList();
		UserDto userDto = new UserDto();
		userRepository.saveAndFlush(user);
		userRepository.findAll();
		return userDtoList;
		}
	
	public List<UserDto> removeUser(int id)
	{
		User user = new User();
		List<UserDto> userDtoList = new ArrayList();
		UserDto userDto = new UserDto();
		userRepository.deleteById(id);
		userRepository.findAll();
	    return userDtoList;
	}
	
	
	public String SignOut(String message) {
	   if(message.equals("SignOut")) {
		   return "signed out succesfully";
	   }
	   return "Still Signed in";
	}

	

	

	

	

}

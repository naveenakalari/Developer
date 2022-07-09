package com.dca.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dca.dto.UserDto;
import com.dca.entity.User;
import com.dca.service.IUserService;
import com.dca.serviceimpl.UserService;

@RestController
public class UserController {

	@Autowired
	private IUserService userService;
	
	/*
	 * @PostMapping("/RegisterUser") public List<UserDto>
	 * addUser(@Valid @RequestBody UserDto userDto) { return
	 * userService.addUser(userDto); }
	 * 
	 * @GetMapping("/validateUser/{UserId}/{password}") public String
	 * validateUser(@PathVariable("UserId") int userId,@PathVariable("password")
	 * String password) { return userService.validateUser(userId, password); }
	 */
	
	@DeleteMapping("/removeUser/{id}")
	public List<UserDto> removeUser(@PathVariable("id") int id){
		 return userService.removeUser(id);
	}
    @GetMapping("/SignOut/{message}")
    public String SignOut(@PathVariable("message")String message) {
    	return userService.SignOut(message);
    }
}

package com.dca.service;

import java.util.List;

import javax.validation.Valid;

import com.dca.dto.UserDto;
import com.dca.entity.User;

public interface IUserService {
	public String validateUser(int userId ,String password);
	public List<UserDto> addUser(UserDto userDto) ;
	public List<UserDto> removeUser(int id);
	public String SignOut(String message);

}

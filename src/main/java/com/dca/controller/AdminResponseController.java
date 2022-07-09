package com.dca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dca.dto.ResponseDto;
import com.dca.serviceimpl.ResponseService;

@RestController
public class AdminResponseController {
	
	@Autowired
	private ResponseService rservice;
	@DeleteMapping("/deleteResponse/{id}")
	public ResponseDto deleteResponse(@PathVariable("id") int respId) {
		return rservice.deleteResponse(respId);
	}

}

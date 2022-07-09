package com.dca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dca.serviceimpl.DeveloperService;
@RestController
public class AdminDeveloperController {
	@Autowired
	private DeveloperService dservice;
	
	@PutMapping("/updateStatus/{devId}/{skillLevel}")
    public String updateStatus(@PathVariable("devId") int dcode,@PathVariable("skillLevel") String skillLevel){
        return dservice.updateStatus(dcode, skillLevel);

    }

}

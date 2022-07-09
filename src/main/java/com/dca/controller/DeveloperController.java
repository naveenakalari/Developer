package com.dca.controller;



import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dca.dto.DeveloperDto;
import com.dca.entity.Developer;
import com.dca.service.IDeveloperService;
import com.dca.serviceimpl.DeveloperService;



@RestController
public class DeveloperController {
	
	@Autowired
	private IDeveloperService dservice;
	
	@PostMapping("/addDeveloper")
	public String addDeveloper(@Valid @RequestBody Developer dev) {
		//System.out.println("request recieved");
		return dservice.addDeveloper(dev);
		
	}
	
	@GetMapping("/getAllDevelopers")
	public List<DeveloperDto> getAllDeveloper(){
		return dservice.getAllDeveloper();
	}
	@GetMapping(value = "/getDeveloper/{id}")
	public DeveloperDto getDeveloper(@PathVariable("id") int dcode) {
	    return dservice.getById(dcode);
	}
	
    @PutMapping("/updateFeeds/{id}/{totalFeeds}")
    public List<DeveloperDto> editFeeds(@PathVariable("id") int dcode,@PathVariable("totalFeeds") int totalFeeds){
	    return dservice.editFeeds(dcode, totalFeeds);
      }
    
		/*
		 * @PutMapping("/updateStatus/{devId}/{skillLevel}") public String
		 * updateStatus(@PathVariable("devId") int dcode,@PathVariable("skillLevel")
		 * String skillLevel){ return dservice.updateStatus(dcode, skillLevel);
		 * 
		 * }
		 */
}



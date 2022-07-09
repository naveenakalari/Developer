package com.dca.serviceimpl;

import java.util.ArrayList;

import java.util.Collection;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dca.dto.DeveloperDto;
import com.dca.entity.Developer;
import com.dca.entity.User;
import com.dca.exception.DeveloperNotFoundException;
import com.dca.repository.DeveloperRepository;
import com.dca.service.IDeveloperService;



@Service
public class DeveloperService implements IDeveloperService{
	
	
	List<Developer> dlist=new ArrayList();
	
	@Autowired
	public DeveloperRepository drepository;
	
	
	//@Autowired
	//private ResponseService rs;
	

	public String addDeveloper(Developer dev) {
		drepository.saveAndFlush(dev);
		//System.out.println("developer added");
		return "Developer is Added";
	}
    public List<DeveloperDto> getAllDeveloper() {
		
    	List<Developer> developerList = drepository.findAll();
    	List<DeveloperDto> developerDtoList = new ArrayList();
    	DeveloperDto developerDto = new DeveloperDto();
    	for(Developer developer:developerList)
    	{
    		BeanUtils.copyProperties(developer, developerDto);
    		developerDtoList.add(developerDto);
    	}
    	return developerDtoList;
	}
   

	public List<DeveloperDto> editFeeds(int dcode,int totalFeeds){
		Developer developer = new Developer();
		DeveloperDto developerDto = new DeveloperDto();
		List<DeveloperDto> developerDtoList = new ArrayList();
		if(drepository.findById(dcode) == null) {
			throw new DeveloperNotFoundException();
		}
		else {
		BeanUtils.copyProperties(drepository.findById(dcode), developerDto);
		developerDto.setTotalFeeds(totalFeeds);
		BeanUtils.copyProperties(developerDto, developer);
	    drepository.findAll();
	    return developerDtoList;
	}}
	
	
	public DeveloperDto getById(int devId) {
		Developer developer = drepository.findById(devId).get();
		DeveloperDto developerDto = new DeveloperDto();
		BeanUtils.copyProperties(developer, developerDto);
		return developerDto;
		
	}
	
	public String updateStatus(int dcode,String skillLevel){
		Developer dev=drepository.findById(dcode).get();
		
		if(dev.getSkillLevel().equals("poor") || dev.getSkillLevel().equals("Average")) {
			dev.setSkillLevel("poor");
			return "Developer is blocked";
		}
		else if(dev.getSkillLevel().equals("Excellent") || dev.getSkillLevel().equals("good") || dev.getSkillLevel().equals("Verygood")) {
			dev.setSkillLevel("Excellent");
			return "Developer is Verified";
		}
		return "Either verified or blocked";
				
}
	
}
	
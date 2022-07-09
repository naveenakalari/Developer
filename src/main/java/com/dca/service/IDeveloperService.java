package com.dca.service;

import java.util.List;

import com.dca.dto.DeveloperDto;
import com.dca.entity.Developer;

public interface IDeveloperService {
	

	public String addDeveloper(Developer dev) ;
	public List<DeveloperDto> getAllDeveloper() ;
	public List<DeveloperDto> editFeeds(int dcode,int totalFeeds);
	public DeveloperDto getById(int devId);
	public String updateStatus(int dcode,String skillLevel);
}

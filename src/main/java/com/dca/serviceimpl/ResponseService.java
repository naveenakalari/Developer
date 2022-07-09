
package com.dca.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dca.dto.FeedDto;
import com.dca.dto.ResponseDto;
import com.dca.entity.Feed;
import com.dca.entity.Response;
import com.dca.exception.FeedNotFoundException;
import com.dca.exception.ResponseNotFoundException;
import com.dca.repository.ResponseRepository;
import com.dca.service.IResponseService;

@Service
public class ResponseService implements IResponseService {

	@Autowired
	public ResponseRepository rrepository;

	@Autowired
	public FeedService fs;

	public String addResponse(Response response) {
		rrepository.saveAndFlush(response);
		return "Response is added";
	}

	public ResponseDto editAnswer(int respId, String answer) {
		Response response = rrepository.findById(respId).get();
		ResponseDto responseDto = new ResponseDto();
		BeanUtils.copyProperties(response, responseDto);
		response.setAnswer(answer);
		rrepository.saveAndFlush(response);
		return responseDto;
	}

	public List<ResponseDto> likeResponse(int respId, int accuracy) {
		Response response = new Response();
		ResponseDto responseDto = new ResponseDto();
		List<ResponseDto> responseDtoList = new ArrayList();
		if(rrepository.findById(respId)==null) {
			throw new FeedNotFoundException();
		}
		else {
			BeanUtils.copyProperties(rrepository.findById(respId), responseDto);	
		responseDto.setAccuracy(accuracy);
		BeanUtils.copyProperties(responseDto, response);
		rrepository.findAll();
		return responseDtoList;
	}}


	public ResponseDto deleteResponse(int respId) {
		ResponseDto responseDto = new ResponseDto();
		Response response = new Response();
		BeanUtils.copyProperties(responseDto, response);
		rrepository.deleteById(respId);
		return responseDto;

	}

	public List<ResponseDto> getResponseByDev(int devId) {
		List<Response> response = rrepository.findByDev(devId);
		List<ResponseDto> responseDtoList = new ArrayList();
		ResponseDto responseDto = new ResponseDto();
		BeanUtils.copyProperties(response, responseDto);
		rrepository.findByDev(devId);
		return responseDtoList;

	}

	public List<ResponseDto> getResponseByFeed(int feedId) {
		List<Response> response = rrepository.findByFeeds(feedId);
		List<ResponseDto> responseDtoList = new ArrayList();
		ResponseDto responseDto = new ResponseDto();
		BeanUtils.copyProperties(response, responseDto);
	    rrepository.findByFeeds(feedId);
	    return responseDtoList;
	}

}


package com.dca.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dca.dto.ResponseDto;
import com.dca.entity.Response;
import com.dca.service.IResponseService;
import com.dca.serviceimpl.ResponseService;

@RestController
public class ResponseController {

	@Autowired
	private IResponseService rservice;

	@PostMapping("/addResponse")
	public String addResponse(@Valid @RequestBody Response response) {
		return rservice.addResponse(response);
	}

	@PutMapping("/editAnswer/{id}/{answer}")
	public ResponseDto editAnswer(@PathVariable("id") int respId, @PathVariable("answer") String answer) {

		return rservice.editAnswer(respId, answer);
	}

	@PutMapping("/likeResponse/{id}/{accuracy}")
	public List<ResponseDto> likeResponse(@PathVariable("id") int respId, @PathVariable("accuracy") int accuracy) {
		return rservice.likeResponse(respId, accuracy);
	}

	/*
	 * @DeleteMapping("/deleteResponse/{id}") public ResponseDto
	 * deleteResponse(@PathVariable("id") int respId) { return
	 * rservice.deleteResponse(respId); }
	 */

	@GetMapping("/getResponseByDevId/{id}")
	public List<ResponseDto> getResponseByDev(@PathVariable("id") int respId) {
		return rservice.getResponseByDev(respId);
	}

	@GetMapping("/getByFeedId/{id}")
	public List<ResponseDto> getResponseByFeed(@PathVariable("id") int respId) {
		return rservice.getResponseByFeed(respId);
	}

}

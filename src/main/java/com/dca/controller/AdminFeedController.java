package com.dca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dca.dto.FeedDto;
import com.dca.serviceimpl.FeedService;

@RestController
public class AdminFeedController {

	@Autowired
	private FeedService feedService;

	@DeleteMapping("/deleteFeed/{id}")
	public FeedDto deleteFeed(@PathVariable("id") int feedId) {
		return feedService.deleteFeed(feedId);
	}

}

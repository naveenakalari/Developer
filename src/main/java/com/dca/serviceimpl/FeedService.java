package com.dca.serviceimpl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dca.dto.FeedDto;
import com.dca.entity.Feed;
import com.dca.exception.FeedNotFoundException;
import com.dca.repository.FeedRepository;
import com.dca.service.IFeedService;
@Service
public class FeedService implements IFeedService {
	
	@Autowired
	public FeedRepository frepository;
	
	@Autowired
	public DeveloperService ds;

	public String addFeed(Feed feed)
	{
		frepository.saveAndFlush(feed);
		return "Feedback is added";	
	}
	
	public FeedDto editComment(int feedId, int totalcomments)
	{
		Feed feed= frepository.findById(feedId).get();
		FeedDto feedDto = new FeedDto();
		BeanUtils.copyProperties(feed, feedDto);
		feed.setTotalComments(totalcomments);
		frepository.saveAndFlush(feed);
		return feedDto;
	}
	
	public List<FeedDto> likeFeed(int feedId, int relevance){
		Feed feed = new Feed();
		FeedDto feedDto = new FeedDto();
		List<FeedDto> feedDtoList = new ArrayList();
		if(frepository.findById(feedId)==null) {
			throw new FeedNotFoundException();
		}
		else {
			BeanUtils.copyProperties(frepository.findById(feedId), feedDto);	
		feedDto.setRelevance(relevance);
		BeanUtils.copyProperties(feedDto, feed);
		frepository.findAll();
		return feedDtoList;
	}}



   public List<FeedDto> getFeedsByDeveloper(int dcode){
	   List<Feed> feed = frepository.findByDeveloper(dcode);
		List <FeedDto> feedDtoList = new ArrayList();
		FeedDto feedDto = new FeedDto();
		BeanUtils.copyProperties(feed, feedDto);;
		frepository.findByDeveloper(dcode);
		return feedDtoList;

	 }

	public List<FeedDto> getFeedsByKeyword(String keyword)
	 {
		List<Feed> feed = frepository.findByKeyword(keyword);
		List <FeedDto> feedDtoList = new ArrayList();
		FeedDto feedDto = new FeedDto();
		BeanUtils.copyProperties(feed, feedDto);;
		frepository.findByKeyword(keyword);
		return feedDtoList;

		
		 
	 }

	public List<FeedDto> getFeedsByTopic(String topic)
	{
		List<Feed> feed = frepository.findByTopic(topic);
		List <FeedDto> feedDtoList = new ArrayList();
		FeedDto feedDto = new FeedDto();
		BeanUtils.copyProperties(feed, feedDto);;
		frepository.findByTopic(topic);
		return feedDtoList;

	}

	public FeedDto getFeed(int fcode){
		if(frepository.findById(fcode)==null) {
			throw new FeedNotFoundException();
		}
		else {
			Feed feed = frepository.findById(fcode).get();
			FeedDto feedDto = new FeedDto();
			BeanUtils.copyProperties(feed, feedDto);
		return feedDto;
	}}

	public FeedDto deleteFeed(int feedId) {
		FeedDto feedDto = new FeedDto();
		Feed feed = new Feed();
		BeanUtils.copyProperties(feedDto, feed);
		frepository.deleteById(feedId);
		return feedDto; 
	}

	
	 
}

package com.dca.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.stereotype.Component;

import com.dca.entity.Developer;
import com.dca.entity.Response;

@Component
public class FeedDto {
	
	private int feedId;

	private String query;

	private LocalDate feedDate;

	private LocalTime feedTime;

	private String topic;

	private int relevance;

	private int totalComments;

	private Developer developer;

	private List<Response> responses;

	public FeedDto() {}

	public FeedDto(int feedId, String query, LocalDate feedDate, LocalTime feedTime, String topic, int relevance,
			int totalComments, Developer developer, List<Response> responses) {
		super();
		this.feedId = feedId;
		this.query = query;
		this.feedDate = feedDate;
		this.feedTime = feedTime;
		this.topic = topic;
		this.relevance = relevance;
		this.totalComments = totalComments;
		this.developer = developer;
		this.responses = responses;
	}

	public int getFeedId() {
		return feedId;
	}

	public void setFeedId(int feedId) {
		this.feedId = feedId;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public LocalDate getFeedDate() {
		return feedDate;
	}

	public void setFeedDate(LocalDate feedDate) {
		this.feedDate = feedDate;
	}

	public LocalTime getFeedTime() {
		return feedTime;
	}

	public void setFeedTime(LocalTime feedTime) {
		this.feedTime = feedTime;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public int getRelevance() {
		return relevance;
	}

	public void setRelevance(int relevance) {
		this.relevance = relevance;
	}

	public int getTotalComments() {
		return totalComments;
	}

	public void setTotalComments(int totalComments) {
		this.totalComments = totalComments;
	}

	public Developer getDeveloper() {
		return developer;
	}

	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}

	public List<Response> getResponses() {
		return responses;
	}

	public void setResponses(List<Response> responses) {
		this.responses = responses;
	}

	@Override
	public String toString() {
		return "FeedDto [feedId=" + feedId + ", query=" + query + ", feedDate=" + feedDate + ", feedTime=" + feedTime
				+ ", topic=" + topic + ", relevance=" + relevance + ", totalComments=" + totalComments + ", developer="
				+ developer + ", responses=" + responses + "]";
	}
	
		
	
	
	
	

}

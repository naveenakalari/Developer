package com.dca.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import org.springframework.stereotype.Component;

import com.dca.entity.Developer;
import com.dca.entity.Feed;

@Component
public class ResponseDto {
	private int respId;

	private String answer;

	private LocalDate respDate;

	private LocalTime respTime;

	private int accuracy;

	private Feed feeds;

	private Developer dev;

	public ResponseDto() {}

	public ResponseDto(int respId, String answer, LocalDate respDate, LocalTime respTime, int accuracy, Feed feeds,
			Developer dev) {
		super();
		this.respId = respId;
		this.answer = answer;
		this.respDate = respDate;
		this.respTime = respTime;
		this.accuracy = accuracy;
		this.feeds = feeds;
		this.dev = dev;
	}

	public int getRespId() {
		return respId;
	}

	public void setRespId(int respId) {
		this.respId = respId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public LocalDate getRespDate() {
		return respDate;
	}

	public void setRespDate(LocalDate respDate) {
		this.respDate = respDate;
	}

	public LocalTime getRespTime() {
		return respTime;
	}

	public void setRespTime(LocalTime respTime) {
		this.respTime = respTime;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	public Feed getFeeds() {
		return feeds;
	}

	public void setFeeds(Feed feeds) {
		this.feeds = feeds;
	}

	public Developer getDev() {
		return dev;
	}

	public void setDev(Developer dev) {
		this.dev = dev;
	}

	@Override
	public String toString() {
		return "ResponseDto [respId=" + respId + ", answer=" + answer + ", respDate=" + respDate + ", respTime="
				+ respTime + ", accuracy=" + accuracy + ", feeds=" + feeds + ", dev=" + dev + "]";
	}
	
		
	
	

}

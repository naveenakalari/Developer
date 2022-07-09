package com.dca.dto;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Component;

import com.dca.entity.Feed;
import com.dca.entity.User;

@Component

public class DeveloperDto {
	private int devId;
    
    private String developerName;
    
    private String email;
   
    private String skillLevel;
    
    private LocalDate memberSince;
    
    private Integer totalFeeds;
    
    private Integer reputation;

    private boolean isVerified;
    
    private boolean isBlocked;

    private User users;

    private List<Feed> feeds;

	public DeveloperDto() {}

	public DeveloperDto(int devId, String developerName, String email, String skillLevel, LocalDate memberSince,
			Integer totalFeeds, Integer reputation, boolean isVerified, boolean isBlocked, User users,
			List<Feed> feeds) {
		super();
		this.devId = devId;
		this.developerName = developerName;
		this.email = email;
		this.skillLevel = skillLevel;
		this.memberSince = memberSince;
		this.totalFeeds = totalFeeds;
		this.reputation = reputation;
		this.isVerified = isVerified;
		this.isBlocked = isBlocked;
		this.users = users;
		this.feeds = feeds;
	}

	public int getDevId() {
		return devId;
	}

	public void setDevId(int devId) {
		this.devId = devId;
	}

	public String getDeveloperName() {
		return developerName;
	}

	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSkillLevel() {
		return skillLevel;
	}

	public void setSkillLevel(String skillLevel) {
		this.skillLevel = skillLevel;
	}

	public LocalDate getMemberSince() {
		return memberSince;
	}

	public void setMemberSince(LocalDate memberSince) {
		this.memberSince = memberSince;
	}

	public Integer getTotalFeeds() {
		return totalFeeds;
	}

	public void setTotalFeeds(Integer totalFeeds) {
		this.totalFeeds = totalFeeds;
	}

	public Integer getReputation() {
		return reputation;
	}

	public void setReputation(Integer reputation) {
		this.reputation = reputation;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

	public boolean isBlocked() {
		return isBlocked;
	}

	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	public List<Feed> getFeeds() {
		return feeds;
	}

	public void setFeeds(List<Feed> feeds) {
		this.feeds = feeds;
	}

	@Override
	public String toString() {
		return "DeveloperDto [devId=" + devId + ", developerName=" + developerName + ", email=" + email
				+ ", skillLevel=" + skillLevel + ", memberSince=" + memberSince + ", totalFeeds=" + totalFeeds
				+ ", reputation=" + reputation + ", isVerified=" + isVerified + ", isBlocked=" + isBlocked + ", users="
				+ users + ", feeds=" + feeds + "]";
	}
	
		
    
    

}

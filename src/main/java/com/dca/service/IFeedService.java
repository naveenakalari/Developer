
package com.dca.service;

import java.util.List;

import com.dca.dto.FeedDto;
import com.dca.entity.Feed;

public interface IFeedService {
	public String addFeed(Feed feed);

	public FeedDto editComment(int feedId, int totalcomments);

	public List<FeedDto> likeFeed(int feedId, int relevance);

	public List<FeedDto> getFeedsByDeveloper(int dcode);

	public List<FeedDto> getFeedsByKeyword(String keyword);

	public List<FeedDto> getFeedsByTopic(String topic);

	public FeedDto getFeed(int fcode);

	public FeedDto deleteFeed(int feedId);

}

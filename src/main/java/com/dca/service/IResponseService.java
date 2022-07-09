
package com.dca.service;

import java.util.List;

import com.dca.dto.ResponseDto;
import com.dca.entity.Response;

public interface IResponseService {

	public String addResponse(Response response);

	public ResponseDto editAnswer(int respId, String answer);

	public List<ResponseDto> likeResponse(int respId, int accuracy);

	public ResponseDto deleteResponse(int respId);

	public List<ResponseDto> getResponseByDev(int respId);

	public List<ResponseDto> getResponseByFeed(int respId);
}

package com.dca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.dca.service.IDeveloperService;
import com.dca.service.IFeedService;
import com.dca.service.IResponseService;
import com.dca.service.IUserService;

@RestController
public class AdminController {
	@Autowired
    private IUserService userService;

    @Autowired
    private IDeveloperService developerService;

    @Autowired
    private IFeedService feedService;

    @Autowired
    private IResponseService responseService;

}

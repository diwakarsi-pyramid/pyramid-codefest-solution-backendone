package com.pyramid.codefest.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pyramid.codefest.constants.RecruitDashBoard;
import com.pyramid.codefest.dto.JobProfiles;
import com.pyramid.codefest.service.JDService;

@RestController
@RequestMapping(path = "/jobProfile")
public class JDController 
{
	private static final Logger LOGGER = LogManager.getLogger(JDController.class);
	
    @Autowired
    private JDService jDService;
    
    @GetMapping(path="/fetch", produces = "application/json")
    public List<JobProfiles> getJobProfiles() 
    {
    	List<JobProfiles> jobProfilesList=null;
        try {
        	jobProfilesList=jDService.getAllJobProfiles();
		} catch (Exception e) {
			jobProfilesList=new ArrayList<JobProfiles>();
			LOGGER.error("Error encountered", e);
		}
    	return jobProfilesList;
    }
    
    @PostMapping(path= "/modify", consumes = "application/json", produces = "application/json")
    public String modifyJobProfile(
                        @RequestBody JobProfiles jobProfile) {
    	String resp=RecruitDashBoard.SUCCESS;
    	
    	try {
			jDService.saveAndModifyJD(jobProfile);
		} catch (Exception e) {
			resp=RecruitDashBoard.FAIL;
			LOGGER.error("Error encountered", e);
		}
    	
    	return resp;
    }
    
    
}

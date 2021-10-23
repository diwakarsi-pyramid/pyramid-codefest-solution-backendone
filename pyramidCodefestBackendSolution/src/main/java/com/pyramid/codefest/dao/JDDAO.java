package com.pyramid.codefest.dao;


import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pyramid.codefest.dto.JobProfiles;
import com.pyramid.codefest.model.JobProfileData;
import com.pyramid.codefest.repository.JDRepository;

@Repository
public class JDDAO {
	private static final Logger LOGGER = LogManager.getLogger(JDDAO.class);

	@Autowired
	private JDRepository jDRepository;

	/** Get job profiles
	 * @return
	 * @throws Exception
	 */
	public List<JobProfileData> getJobProfiles() throws Exception {

		return jDRepository.findAll();
	}
	
	/** For Modify JD
	 * @param profile
	 * @throws Exception
	 */
	public void modifyJD(JobProfiles profile) throws Exception  {
		if(profile !=null && !profile.getJobID().isEmpty()) {
			LOGGER.info("Going to modify Job Profiles");
			Optional<JobProfileData> data=jDRepository.findById(Long.parseLong(profile.getJobID()));
			JobProfileData profileData=data.get();
			if(profileData !=null) {
				profileData.setGoodToHaveSkills(profile.getGoodToHaveSkills());
				profileData.setMandatorySkills(profile.getMandatorySkills());
				profileData.setJobName(profile.getJobName());
				jDRepository.save(profileData);
				LOGGER.info("Job Profiles modified successfully");
			}
		}else {
			JobProfileData profileData=new JobProfileData();
			profileData.setGoodToHaveSkills(profile.getGoodToHaveSkills());
			profileData.setMandatorySkills(profile.getMandatorySkills());
			profileData.setJobName(profile.getJobName());
			profileData.setInsertedBy("diwakar");
			profileData.setInsTS(new Date());
			profileData.setUpdatedBy("diwakar");
			profileData.setUpdatedTS(new Date());
			
		}
		
		
	}

}

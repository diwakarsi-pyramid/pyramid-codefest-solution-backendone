package com.pyramid.codefest.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pyramid.codefest.dao.JDDAO;
import com.pyramid.codefest.dto.JobProfiles;
import com.pyramid.codefest.model.JobProfileData;

@Service
public class JDService {

	private static final Logger LOGGER = LogManager.getLogger(JDService.class);

	@Autowired
	private JDDAO jDDAO;

	public List<JobProfiles> getAllJobProfiles() throws Exception {
		// TODO Auto-generated method stub
		List<JobProfiles> jobProfiles = new ArrayList<JobProfiles>();
		List<JobProfileData> list = jDDAO.getJobProfiles();
		if (list != null && !list.isEmpty()) {
			for (JobProfileData data : list) {
				JobProfiles profile = new JobProfiles();
				profile.setJobID(String.valueOf(data.getJDId()));
				profile.setGoodToHaveSkills(data.getGoodToHaveSkills());
				profile.setMandatorySkills(data.getMandatorySkills());
				profile.setJobName(data.getJobName());
				jobProfiles.add(profile);
			}
		} else {
			LOGGER.info("No Job Profile created");
		}

		return jobProfiles;
	}

	/**
	 * @param profile
	 * @throws Exception
	 */
	public void saveAndModifyJD(JobProfiles profile) throws Exception{
		jDDAO.modifyJD(profile);
	}
}

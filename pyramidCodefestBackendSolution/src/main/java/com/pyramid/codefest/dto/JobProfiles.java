package com.pyramid.codefest.dto;

public class JobProfiles {

	private String jobID;
	
	private String jobName;
	
	private String goodToHaveSkills;
	
	private String mandatorySkills;

	public String getJobID() {
		return jobID;
	}

	public void setJobID(String jobID) {
		this.jobID = jobID;
	}

	public String getGoodToHaveSkills() {
		return goodToHaveSkills;
	}

	public void setGoodToHaveSkills(String goodToHaveSkills) {
		this.goodToHaveSkills = goodToHaveSkills;
	}

	public String getMandatorySkills() {
		return mandatorySkills;
	}

	public void setMandatorySkills(String mandatorySkills) {
		this.mandatorySkills = mandatorySkills;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	@Override
	public String toString() {
		return "JobProfileData [jobID=" + jobID + ", jobName=" + jobName + ", goodToHaveSkills=" + goodToHaveSkills
				+ ", mandatorySkills=" + mandatorySkills + "]";
	}
	
	
}

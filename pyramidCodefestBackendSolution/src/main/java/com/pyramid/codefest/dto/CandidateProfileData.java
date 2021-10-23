package com.pyramid.codefest.dto;

import java.util.Date;

public class CandidateProfileData {

	private Long candidateProfileId;

	private String name;

	private String emailAddress; //

	private String mobileNumber;

	private String overallMatchScore;

	private String tP1Comment;

	private String tP2Comment; //

	private String status;

	private String isJoined;

	private Date dueDate;

	private String skills;

	public Long getCandidateProfileId() {
		return candidateProfileId;
	}

	public void setCandidateProfileId(Long candidateProfileId) {
		this.candidateProfileId = candidateProfileId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getOverallMatchScore() {
		return overallMatchScore;
	}

	public void setOverallMatchScore(String overallMatchScore) {
		this.overallMatchScore = overallMatchScore;
	}

	public String gettP1Comment() {
		return tP1Comment;
	}

	public void settP1Comment(String tP1Comment) {
		this.tP1Comment = tP1Comment;
	}

	public String gettP2Comment() {
		return tP2Comment;
	}

	public void settP2Comment(String tP2Comment) {
		this.tP2Comment = tP2Comment;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIsJoined() {
		return isJoined;
	}

	public void setIsJoined(String isJoined) {
		this.isJoined = isJoined;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}
 
	
}

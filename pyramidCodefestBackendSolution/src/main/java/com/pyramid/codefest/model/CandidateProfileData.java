package com.pyramid.codefest.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CandidateProfile")
public class CandidateProfileData {

	@Id
	@Column(name = "CandidateProfileId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long candidateProfileId;

	@Column(name = "Name")
	private String name;

	@Column(name = "EmailAddress")
	private String emailAddress; //

	@Column(name = "MobileNumber")
	private String mobileNumber;

	@Column(name = "OverallMatchScore")
	private String overallMatchScore;

	@Column(name = "TP1Comment")
	private String tP1Comment;

	@Column(name = "TP2Comment")
	private String tP2Comment; //

	@Column(name = "Status")
	private String status;

	@Column(name = "IsJoined")
	private String isJoined;

	@Column(name = "DueDate")
	private Date dueDate;

	@Column(name = "Skills", columnDefinition = "TEXT")
	private String skills;

	@Column(name = "InsBy")
	private String insertedBy;

	@Column(name = "InsTS")
	private Date insTS;

	@Column(name = "UpdBy")
	private String updatedBy;

	@Column(name = "UpdTS")
	private Date updatedTS;

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

	public String getInsertedBy() {
		return insertedBy;
	}

	public void setInsertedBy(String insertedBy) {
		this.insertedBy = insertedBy;
	}

	public Date getInsTS() {
		return insTS;
	}

	public void setInsTS(Date insTS) {
		this.insTS = insTS;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedTS() {
		return updatedTS;
	}

	public void setUpdatedTS(Date updatedTS) {
		this.updatedTS = updatedTS;
	}

	@Override
	public String toString() {
		return "CandidateProfileData [candidateProfileId=" + candidateProfileId + ", name=" + name + ", emailAddress="
				+ emailAddress + ", mobileNumber=" + mobileNumber + ", overallMatchScore=" + overallMatchScore
				+ ", tP1Comment=" + tP1Comment + ", tP2Comment=" + tP2Comment + ", status=" + status + ", isJoined="
				+ isJoined + ", dueDate=" + dueDate + ", skills=" + skills + ", insertedBy=" + insertedBy + ", insTS="
				+ insTS + ", updatedBy=" + updatedBy + ", updatedTS=" + updatedTS + "]";
	}
	
	
	

}

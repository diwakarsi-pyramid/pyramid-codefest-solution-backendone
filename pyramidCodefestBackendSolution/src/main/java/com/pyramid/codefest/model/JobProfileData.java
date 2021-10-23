package com.pyramid.codefest.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JD")
public class JobProfileData {

	@Id
	@Column(name="JDId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long JDId;
	
	@Column(name="JDName")
	private String jobName;
	
	@Column(name="Skill_GoodToHave", columnDefinition = "TEXT")
	private String goodToHaveSkills;
	
	@Column(name="Skill_Mandatory", columnDefinition = "TEXT")
	private String mandatorySkills;

	@Column(name="InsBy")
	private String insertedBy;
	
	@Column(name="InsTS")
	private Date insTS;
	
	@Column(name="UpdBy")
	private String updatedBy;
	
	@Column(name="UpdTS")
	private Date updatedTS;
	
	

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

	public Long getJDId() {
		return JDId;
	}

	public void setJDId(Long jDId) {
		JDId = jDId;
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
		return "JobProfileData [JDId=" + JDId + ", jobName=" + jobName + ", goodToHaveSkills=" + goodToHaveSkills
				+ ", mandatorySkills=" + mandatorySkills + ", insertedBy=" + insertedBy + ", insTS=" + insTS
				+ ", updatedBy=" + updatedBy + ", updatedTS=" + updatedTS + "]";
	}
	
	
}

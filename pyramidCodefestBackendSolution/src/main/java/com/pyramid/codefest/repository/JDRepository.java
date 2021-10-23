package com.pyramid.codefest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pyramid.codefest.model.JobProfileData;

public interface JDRepository extends JpaRepository<JobProfileData, Long> {

}

package com.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.entity.JobDetails;

public interface JobDetailsRepository extends JpaRepository<JobDetails,Integer> {
	JobDetails findByJobDetailId(int job_detail_id);
}

package com.sample.service;

import com.sample.entity.JobDetails;

public interface IJobDetailsService {
	Integer saveJobDetails(JobDetails jobDetails);
	JobDetails findByJobDetailId(int jobDetailId);
}

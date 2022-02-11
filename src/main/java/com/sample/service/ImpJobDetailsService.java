package com.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.entity.JobDetails;
import com.sample.repository.JobDetailsRepository;
@Service
public class ImpJobDetailsService implements IJobDetailsService {
	
	@Autowired
	   JobDetailsRepository jobDetailsRepository;
	 
		@Override
		public Integer saveJobDetails(JobDetails jobDetails) {
			int jobDetailId = jobDetailsRepository.save(jobDetails).getJobDetailId();
			Integer iInteger = Integer.valueOf(jobDetailId);
			return iInteger;
		}

		@Override
		public JobDetails findByJobDetailId(int jobDetailId) {
			JobDetails jobDetails = jobDetailsRepository.findByJobDetailId(jobDetailId);
			return jobDetails;
		}
		
		
}

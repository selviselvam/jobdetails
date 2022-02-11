package com.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.entity.JobDetails;
import com.sample.service.IJobDetailsService;

@RestController
@RequestMapping("/jobDetails")
public class JobDetailController {
	
 @Autowired 
 IJobDetailsService jobDetailService;
 
 

 @RequestMapping(value = "/checkConnection",method = RequestMethod.GET)
 public String checkConnection() {
	return "Connection is alive on Job Detail Service"; 
 }
 
 @RequestMapping(value = "/addJobDetails",method = RequestMethod.POST)
 public ResponseEntity<String> addJobDetails(@RequestBody JobDetails jobDetails){
	 Integer jobDetailId = jobDetailService.saveJobDetails(jobDetails);
	 return ResponseEntity.ok("Job details saved :"+jobDetailId);
 }
 @RequestMapping(value ="/findJobDetails",method = RequestMethod.GET)
 public ResponseEntity<JobDetails> findJobDetails(@RequestParam("jobDetailId") int jobDetailId){
	 JobDetails jobDetails = jobDetailService.findByJobDetailId(jobDetailId);
	 return ResponseEntity.ok(jobDetails);
 }
 
}

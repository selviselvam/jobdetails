package com.sample.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="job_details")
public class JobDetails {
@Id
@GeneratedValue(strategy=GenerationType.AUTO,generator="JOB_DETAIL_SEQ_GEN")	
@SequenceGenerator(name="JOB_DETAIL_SEQ_GEN", sequenceName="JOB_DETAIL_SEQ_GEN", allocationSize=1)
@Column(name = "job_detail_id")	
private int jobDetailId;
@Column(name = "job_type")
private String jobType;
@Column(name = "location")
private String location;

public int getJobDetailId() {
	return jobDetailId;
}
public void setJobDetailId(int jobDetailId) {
	this.jobDetailId = jobDetailId;
}
public String getJobType() {
	return jobType;
}
public void setJobType(String jobType) {
	this.jobType = jobType;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
@Override
public String toString() {
	return "JobDetails [jobDetailId=" + jobDetailId + ", jobType=" + jobType + ", location=" + location + "]";
}

}

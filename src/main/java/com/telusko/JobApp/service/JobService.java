package com.telusko.JobApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.JobApp.model.JobPost;
import com.telusko.JobApp.repo.JobRepo;

@Service
public class JobService {
	@Autowired
	public JobRepo repo;

	//method to return all JobPosts
	public List<JobPost> getAllJobs() {
		return repo.findAll();


	}

	// method to add a jobPost
	public void addJob(JobPost jobPost) {
		repo.save(jobPost);

	}

	//method to get job by id
	public JobPost getJob(int postId) {

		return repo.findById(postId).orElse(new JobPost());
	}




	//method to update job with job post object
	public void updateJob(JobPost jobPost) {
		repo.save(jobPost);

	}

	//method to delete job post by id
	public void deleteJob(int postId) {
		repo.deleteById(postId);
	}


	//method to return all JobPosts
	public List<JobPost> returnAllJobPosts() {
		System.out.println(repo.findAll());
		return repo.findAll();

	}
	// ***************************************************************************

	// method to add a jobPost
	public void addJobPost(JobPost jobPost) {
		repo.save(jobPost);
	}

}

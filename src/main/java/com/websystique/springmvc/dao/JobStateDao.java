package com.websystique.springmvc.dao;


import com.websystique.springmvc.persistence.entities.JobState;

public interface JobStateDao {
    JobState getJobStateById(Long jobId);
    void updateJobSate(JobState jobState);
}

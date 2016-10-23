package com.websystique.springmvc.service;

import com.websystique.springmvc.persistence.entities.JobState;


public interface IJobStateService {
    JobState getJobStateById(Long jobId);
    void updateJobSate(JobState jobState);
}

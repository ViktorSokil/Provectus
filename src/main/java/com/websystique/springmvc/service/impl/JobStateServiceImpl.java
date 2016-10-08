package com.websystique.springmvc.service.impl;


import com.websystique.springmvc.dao.JobStateDao;
import com.websystique.springmvc.persistence.entities.JobState;
import com.websystique.springmvc.service.JobStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobStateServiceImpl implements JobStateService{

    @Autowired
    private JobStateDao jobStateDao;

    @Override
    public JobState getJobStateById(Long jobId) {
        return jobStateDao.getJobStateById(jobId);
    }

    @Override
    public void updateJobSate(JobState jobState) {
        jobStateDao.updateJobSate(jobState);
    }
}

package com.websystique.springmvc.persistence.entities;

import com.websystique.springmvc.utils.enums.JobStateEnum;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="JOBS_STATE")
public class JobState {
    @Id
    @Column(name="JOB_ID")
    private Long jobId;

    @Column(name="JOB_NAME")
    private String jobName;

    @Column (name="JOB_STATE")
    @Enumerated(EnumType.STRING)
    private JobStateEnum jobState;

    @Column(name="REFRESH_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date refreshDate;

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public JobStateEnum getJobState() {
        return jobState;
    }

    public void setJobState(JobStateEnum jobState) {
        this.jobState = jobState;
    }

    public Date getRefreshDate() {
        return refreshDate;
    }

    public void setRefreshDate(Date refreshDate) {
        this.refreshDate = refreshDate;
    }
}

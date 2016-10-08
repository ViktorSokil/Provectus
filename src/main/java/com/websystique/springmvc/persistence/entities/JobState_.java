package com.websystique.springmvc.persistence.entities;

import com.websystique.springmvc.utils.enums.JobStateEnum;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.util.Date;

@StaticMetamodel(JobState.class)
public class JobState_ {
    public static volatile SingularAttribute<JobState, Long> jobId;
    public static volatile SingularAttribute<JobState, String> jobName;
    public static volatile SingularAttribute<JobState, JobStateEnum> jobState;
    public static volatile SingularAttribute<JobState, Date> refreshDate;
}

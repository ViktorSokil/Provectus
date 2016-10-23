package com.websystique.springmvc.dao.impl;

import com.websystique.springmvc.dao.IJobStateDao;
import com.websystique.springmvc.persistence.entities.JobState;
import com.websystique.springmvc.persistence.entities.JobState_;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Repository
@Transactional
public class JobStateDaoImpl implements IJobStateDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public JobState getJobStateById(Long jobId) {
        CriteriaQuery<JobState> criteria=getCriteriaBuilder().createQuery(JobState.class);
        Root<JobState> root=criteria.from(JobState.class);
        criteria.where(getCriteriaBuilder().equal(root.get(JobState_.jobId),jobId));
        criteria.select(root);
        return em.createQuery(criteria).getSingleResult();
    }

    @Override
    public void updateJobSate(JobState jobState) {
        em.merge(jobState);
    }

    private CriteriaBuilder getCriteriaBuilder(){
        return em.getCriteriaBuilder();
    }
}

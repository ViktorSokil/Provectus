package com.websystique.springmvc.dao.impl;


import com.websystique.springmvc.dao.IOrganizationDao;
import com.websystique.springmvc.persistence.entities.City_;
import com.websystique.springmvc.persistence.entities.Organization;
import com.websystique.springmvc.persistence.entities.Organization_;
import com.websystique.springmvc.persistence.entities.Region_;
import com.websystique.springmvc.persistence.entities.wrappers.OrganizationWrapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
@Transactional
public class OrganizationDaoImpl implements IOrganizationDao {


    @PersistenceContext
    private EntityManager em;

    @Override
    public Organization saveOrganization(Organization organization) {
        return em.merge(organization);
    }

    @Override
    public List<Organization> getOrganizationById(String id) {
        CriteriaQuery<Organization> criteria=getCriteriaBuilder().createQuery(Organization.class);
        Root<Organization> root=criteria.from(Organization.class);
        criteria.where(getCriteriaBuilder().equal(root.get(Organization_.organizationId),id));
        criteria.select(root);
        return em.createQuery(criteria).getResultList();
    }

    @Override
    public List<OrganizationWrapper> findAll() {
        CriteriaQuery<OrganizationWrapper> criteria=getCriteriaBuilder().createQuery(OrganizationWrapper.class);
        Root<Organization> root=criteria.from(Organization.class);
        criteria.select(getCriteriaBuilder().construct(OrganizationWrapper.class,
                root.get(Organization_.id),
                root.get(Organization_.organizationId),
                root.get(Organization_.oldOrgId),
                root.get(Organization_.orgType),
                root.get(Organization_.title),
                root.get(Organization_.branch),
                root.get(Organization_.region).get(Region_.regionName),
                root.get(Organization_.city).get(City_.cityName),
                root.get(Organization_.phone),
                root.get(Organization_.address),
                root.get(Organization_.linkType),
                root.get(Organization_.link),
                root.get(Organization_.date)
        ));
        return em.createQuery(criteria).getResultList();
    }

    private CriteriaBuilder getCriteriaBuilder(){
        return em.getCriteriaBuilder();
    }

    //for test only
    public void setEm(EntityManager em){
        this.em=em;
    }
}

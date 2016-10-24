package com.websystique.springmvc.dao.impl;


import com.websystique.springmvc.dao.IOrganizationDao;
import com.websystique.springmvc.persistence.entities.Organization;
import com.websystique.springmvc.persistence.entities.Organization_;
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

    private CriteriaBuilder getCriteriaBuilder(){
        return em.getCriteriaBuilder();
    }
}

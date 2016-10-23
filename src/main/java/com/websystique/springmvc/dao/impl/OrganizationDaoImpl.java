package com.websystique.springmvc.dao.impl;


import com.websystique.springmvc.dao.IOrganizationDao;
import com.websystique.springmvc.persistence.entities.Organization;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class OrganizationDaoImpl implements IOrganizationDao {


    @PersistenceContext
    private EntityManager em;

    @Override
    public Organization saveOrganization(Organization organization) {
        return em.merge(organization);
    }
}

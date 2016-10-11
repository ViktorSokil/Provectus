package com.websystique.springmvc.dao.impl;


import com.websystique.springmvc.dao.OrganizationDao;
import com.websystique.springmvc.persistence.entities.Organization;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class OrganizationDaoImpl implements OrganizationDao {


    @PersistenceContext
    private EntityManager em;

    @Override
    public void saveOrganization(Organization organization) {
        em.merge(organization);
    }
}

package com.websystique.springmvc.dao.impl;


import com.websystique.springmvc.dao.OrgTypeDao;
import com.websystique.springmvc.persistence.entities.OrgType;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class OrgTypeDaoImpl implements OrgTypeDao {

    @PersistenceContext
    EntityManager em;

    @Override
    public void saveOrgType (OrgType orgType){
        em.merge(orgType);
    }
}

package com.websystique.springmvc.dao.impl;


import com.websystique.springmvc.dao.IOrgTypeDao;
import com.websystique.springmvc.persistence.entities.OrgType;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class OrgTypeDaoImpl implements IOrgTypeDao {

    @PersistenceContext
    EntityManager em;

    @Override
    public void saveOrgType (OrgType orgType){
        em.merge(orgType);
    }

    //for test only
    public void setEm(EntityManager em){
        this.em=em;
    }
}

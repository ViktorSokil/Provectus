package com.websystique.springmvc.dao.impl;

import com.websystique.springmvc.dao.IRegionDao;
import com.websystique.springmvc.persistence.entities.Region;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class RegionDaoImpl implements IRegionDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void saveRegion(Region region) {
        em.merge(region);
    }
}

package com.websystique.springmvc.dao.impl;

import com.websystique.springmvc.dao.ICityDao;
import com.websystique.springmvc.persistence.entities.City;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class CityDaoImpl implements ICityDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void saveCity(City city) {
        em.merge(city);
    }

    //for test only
    public void setEm(EntityManager em){
        this.em=em;
    }
}

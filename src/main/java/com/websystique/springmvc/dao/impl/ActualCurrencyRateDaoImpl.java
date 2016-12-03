package com.websystique.springmvc.dao.impl;

import com.websystique.springmvc.dao.IActualCurrencyRateDao;
import com.websystique.springmvc.persistence.entities.ActualCurrencyRate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class ActualCurrencyRateDaoImpl implements IActualCurrencyRateDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void saveActualCurrencyRate(ActualCurrencyRate actualCurrencyRate) {
        em.merge(actualCurrencyRate);
    }

    //for test only
    public void setEm(EntityManager em){
        this.em=em;
    }
}

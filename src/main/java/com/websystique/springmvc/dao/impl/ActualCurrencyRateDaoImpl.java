package com.websystique.springmvc.dao.impl;

import com.websystique.springmvc.dao.IActualCurrencyRateDao;
import com.websystique.springmvc.persistence.entities.ActualCurrencyRate;
import com.websystique.springmvc.persistence.entities.ActualCurrencyRate_;
import com.websystique.springmvc.persistence.entities.Currency_;
import com.websystique.springmvc.persistence.entities.Organization_;
import com.websystique.springmvc.persistence.entities.wrappers.ActualCurrencyRateWrapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
@Transactional
public class ActualCurrencyRateDaoImpl implements IActualCurrencyRateDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void saveActualCurrencyRate(ActualCurrencyRate actualCurrencyRate) {
        em.merge(actualCurrencyRate);
    }

    @Override
    public List<ActualCurrencyRateWrapper> findAll() {
        CriteriaQuery<ActualCurrencyRateWrapper> criteria=getCriteriaBuilder().createQuery(ActualCurrencyRateWrapper.class);
        Root<ActualCurrencyRate> root=criteria.from(ActualCurrencyRate.class);
        criteria.select(getCriteriaBuilder().construct(ActualCurrencyRateWrapper.class,
                root.get(ActualCurrencyRate_.currencyId).get(Currency_.title),
                root.get(ActualCurrencyRate_.buyRate),
                root.get(ActualCurrencyRate_.ascRate),
                root.get(ActualCurrencyRate_.idFromOrg).get(Organization_.date)
        ));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    public List<ActualCurrencyRateWrapper> findAvg() {
        CriteriaQuery<ActualCurrencyRateWrapper> criteria=getCriteriaBuilder().createQuery(ActualCurrencyRateWrapper.class);
        Root<ActualCurrencyRate> root=criteria.from(ActualCurrencyRate.class);
        Expression<Double> ascRate = root.get(ActualCurrencyRate_.ascRate);
        Expression<Double> buyRate = root.get(ActualCurrencyRate_.buyRate);
        Expression<Double> avgAscRate = getCriteriaBuilder().avg(ascRate);
        Expression<Double> avgBuyRate = getCriteriaBuilder().avg(buyRate);
        criteria.where(getCriteriaBuilder().equal(root.get(ActualCurrencyRate_.currencyId).get(Currency_.title), "USD"));
        criteria.groupBy(
                root.get(ActualCurrencyRate_.currencyId).get(Currency_.title),
                root.get(ActualCurrencyRate_.idFromOrg).get(Organization_.date)
        );
        criteria.orderBy(getCriteriaBuilder().asc(root.get(ActualCurrencyRate_.idFromOrg).get(Organization_.date)));
        criteria.select(getCriteriaBuilder().construct(ActualCurrencyRateWrapper.class,
                root.get(ActualCurrencyRate_.currencyId).get(Currency_.title),
                avgBuyRate,
                avgAscRate,
                root.get(ActualCurrencyRate_.idFromOrg).get(Organization_.date)
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

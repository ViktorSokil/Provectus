package com.websystique.springmvc.dao;

import com.websystique.springmvc.persistence.entities.ActualCurrencyRate;
import com.websystique.springmvc.persistence.entities.wrappers.ActualCurrencyRateWrapper;

import java.util.List;


public interface IActualCurrencyRateDao {
    void saveActualCurrencyRate(ActualCurrencyRate actualCurrencyRate);

    List<ActualCurrencyRateWrapper> findAll();

    List<ActualCurrencyRateWrapper> findAvg();
}

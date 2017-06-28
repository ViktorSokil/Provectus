package com.websystique.springmvc.service;

import com.websystique.springmvc.persistence.entities.Organization;
import com.websystique.springmvc.persistence.entities.wrappers.ActualCurrencyRateWrapper;
import com.websystique.springmvc.utils.xml.OrganizationXmlElement;

import java.util.List;


public interface IActualCurrencyRateService {
    void saveActualCurrencyRate(Organization organization, OrganizationXmlElement organizationElement);

    List<ActualCurrencyRateWrapper> findAll();

    List<ActualCurrencyRateWrapper> findAvg();
}

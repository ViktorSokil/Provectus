package com.websystique.springmvc.service;

import com.websystique.springmvc.persistence.entities.Organization;
import com.websystique.springmvc.utils.xml.OrganizationXmlElement;


public interface ActualCurrencyRateService {
    void saveActualCurrencyRate(Organization organization, OrganizationXmlElement organizationElement);
}

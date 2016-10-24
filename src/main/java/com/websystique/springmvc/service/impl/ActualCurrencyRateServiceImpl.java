package com.websystique.springmvc.service.impl;

import com.websystique.springmvc.dao.IActualCurrencyRateDao;
import com.websystique.springmvc.persistence.entities.ActualCurrencyRate;
import com.websystique.springmvc.persistence.entities.Organization;
import com.websystique.springmvc.service.IActualCurrencyRateService;
import com.websystique.springmvc.utils.EntityUtils;
import com.websystique.springmvc.utils.xml.CurrencyXmlElement;
import com.websystique.springmvc.utils.xml.OrganizationXmlElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActualCurrencyRateServiceImpl implements IActualCurrencyRateService {

    @Autowired
    private IActualCurrencyRateDao actualCurrencyRateDao;

    @Override
    public void saveActualCurrencyRate(Organization organization, OrganizationXmlElement organizationElement) {
        List<CurrencyXmlElement> currencyXmlElementList = organizationElement.getCurrencies().getCurrencies();
        for (CurrencyXmlElement currencyXmlElement: currencyXmlElementList){
            ActualCurrencyRate actualCurrencyRate = EntityUtils.createAndReturnActualCurrencyRateEntity(currencyXmlElement, organization);
            actualCurrencyRateDao.saveActualCurrencyRate(actualCurrencyRate);
        }
    }
}

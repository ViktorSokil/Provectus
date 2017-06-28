package com.websystique.springmvc.service;


import com.websystique.springmvc.dao.IActualCurrencyRateDao;
import com.websystique.springmvc.persistence.entities.ActualCurrencyRate;
import com.websystique.springmvc.persistence.entities.Organization;
import com.websystique.springmvc.service.impl.ActualCurrencyRateServiceImpl;
import com.websystique.springmvc.utils.xml.Currencies;
import com.websystique.springmvc.utils.xml.CurrencyXmlElement;
import com.websystique.springmvc.utils.xml.OrganizationXmlElement;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;

public class ActualCurrencyRateServiceTest {

    @Mock
    private IActualCurrencyRateDao actualCurrencyRateDao;

    @InjectMocks
    private IActualCurrencyRateService actualCurrencyRateService = new ActualCurrencyRateServiceImpl();


    private Organization organization;

    private OrganizationXmlElement organizationXmlElement;


    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);

        CurrencyXmlElement currencyXmlElement = new CurrencyXmlElement();
        List<CurrencyXmlElement> list = new ArrayList<>();
        list.add(currencyXmlElement);

        Currencies currency = new Currencies();
        currency.setCurrencies(list);

        organization = new Organization();
        organizationXmlElement = new OrganizationXmlElement();
        organizationXmlElement.setCurrencies(currency);
    }

    @Test
    public void saveActualCurrencyRateTest(){
        actualCurrencyRateService.saveActualCurrencyRate(organization, organizationXmlElement);
        verify(actualCurrencyRateDao).saveActualCurrencyRate((ActualCurrencyRate)any());
    }

    @Test
    public void findAllTest(){
        actualCurrencyRateService.findAll();
        verify(actualCurrencyRateDao).findAll();
    }

    @Test
    public void findAvgTest(){
        actualCurrencyRateService.findAvg();
        verify(actualCurrencyRateDao).findAvg();
    }
}

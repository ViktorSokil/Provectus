package com.websystique.springmvc.service;


import com.websystique.springmvc.dao.ICurrencyDao;
import com.websystique.springmvc.persistence.entities.Currency;
import com.websystique.springmvc.service.impl.CurrencyServiceImpl;
import com.websystique.springmvc.utils.xml.CurrencyXmlElement;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class CurrencyServiceTest {

    @Mock
    private ICurrencyDao currencyDao;

    @InjectMocks
    private ICurrencyService currencyService=new CurrencyServiceImpl();

    private List<CurrencyXmlElement> currencies;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        CurrencyXmlElement element=new CurrencyXmlElement();
        CurrencyXmlElement element1=new CurrencyXmlElement();
        currencies=new ArrayList<>();
        currencies.add(element);
        currencies.add(element1);
    }

    @Test
    public void saveCityTest() {
        currencyService.saveCurrency(currencies);
        verify(currencyDao,times(2)).saveCurrency((Currency) any());
    }


}

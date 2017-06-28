package com.websystique.springmvc.persistence.entities.wrappers;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ActualCurrencyRateWrapperTest {

    private ActualCurrencyRateWrapper actualCurrencyRateWrapper;

    @Before
    public void setUp(){
        actualCurrencyRateWrapper = new ActualCurrencyRateWrapper();
        actualCurrencyRateWrapper.setCurrencyId("currencyId");
        actualCurrencyRateWrapper.setBuyRate(25.0);
        actualCurrencyRateWrapper.setAscRate(26.0);
        actualCurrencyRateWrapper.setDate("25/12/16");
    }

    @Test
    public void getterAndsetterTest(){
        assertEquals("currencyId", actualCurrencyRateWrapper.getCurrencyId());
        assertEquals(new Double(25.0), actualCurrencyRateWrapper.getBuyRate());
        assertEquals(new Double(26.0), actualCurrencyRateWrapper.getAscRate());
        assertEquals("25/12/16", actualCurrencyRateWrapper.getDate());
    }
}

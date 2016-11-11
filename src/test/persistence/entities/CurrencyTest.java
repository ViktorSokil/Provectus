package persistence.entities;


import com.websystique.springmvc.persistence.entities.ActualCurrencyRate;
import com.websystique.springmvc.persistence.entities.Currency;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CurrencyTest {

    private Currency currency;

    @Before
    public void setUp(){
        currency=new Currency();
        currency.setId("1");
        currency.setTitle("TestCurrency");

        ActualCurrencyRate actualCurrencyRate=new ActualCurrencyRate();
        actualCurrencyRate.setRecordId(10L);
        List<ActualCurrencyRate> currencyList=new ArrayList<>();
        currencyList.add(actualCurrencyRate);

        currency.setCurrencyList(currencyList);
    }

    @Test
    public void getterAndsetterTest() {
        assertEquals("1",currency.getId());
        assertEquals("TestCurrency",currency.getTitle());
        assertEquals(new Long(10),currency.getCurrencyList().get(0).getRecordId());
    }
}

package persistence.entities;


import com.websystique.springmvc.persistence.entities.ActualCurrencyRate;
import com.websystique.springmvc.persistence.entities.Currency;
import com.websystique.springmvc.persistence.entities.Organization;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ActualCurrencyRateTest {
    private ActualCurrencyRate actualCurrencyRate;
    private Currency currencyId;
    private Organization idFromOrg;

    @Before
    public void setUp(){
        actualCurrencyRate=new ActualCurrencyRate();
        currencyId = new Currency();
        idFromOrg = new Organization();

        actualCurrencyRate.setRecordId(1L);
        actualCurrencyRate.setCurrencyId(currencyId);
        actualCurrencyRate.setIdFromOrg(idFromOrg);
        actualCurrencyRate.setBuyRate(25.0);
        actualCurrencyRate.setAscRate(26.0);

        currencyId.setId("1");
        idFromOrg.setId(1L);
    }

    @Test
    public void getterAndsetterTest() {
        assertEquals(new Long(1),actualCurrencyRate.getRecordId());
        assertEquals(new Double(25.0),actualCurrencyRate.getBuyRate());
        assertEquals(new Double(26.0),actualCurrencyRate.getAscRate());
        assertEquals("1",currencyId.getId());
        assertEquals(new Long(1),idFromOrg.getId());
    }
}

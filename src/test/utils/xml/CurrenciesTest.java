package utils.xml;


import com.websystique.springmvc.utils.xml.Currencies;
import com.websystique.springmvc.utils.xml.CurrencyXmlElement;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CurrenciesTest {
    private Currencies currencies;
    List<CurrencyXmlElement> list;


    @Before
    public void setUp(){
        currencies = new Currencies();
        list=new ArrayList<CurrencyXmlElement>();
        CurrencyXmlElement currencyXmlElement;
        currencyXmlElement = new CurrencyXmlElement();

        list.add(currencyXmlElement);
        currencies.setCurrencies(list);

    }

    @Test
    public void getterAndsetterTest() {
        assertEquals(list,currencies.getCurrencies());
    }
}

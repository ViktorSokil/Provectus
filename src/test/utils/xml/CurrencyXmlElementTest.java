package utils.xml;


import com.websystique.springmvc.utils.xml.CurrencyXmlElement;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CurrencyXmlElementTest {

    private CurrencyXmlElement currencyXmlElement;


    @Before
    public void setUp(){
        currencyXmlElement = new CurrencyXmlElement();
        currencyXmlElement.setId("1");
        currencyXmlElement.setTitle("TestTitle");
        currencyXmlElement.setAskRate(1.0);
        currencyXmlElement.setBuyRate(2.0);

    }

    @Test
    public void getterAndsetterTest() {
        assertEquals("1",currencyXmlElement.getId());
        assertEquals("TestTitle",currencyXmlElement.getTitle());
        assertEquals(new Double(1.0),currencyXmlElement.getAskRate());
        assertEquals(new Double(2.0),currencyXmlElement.getBuyRate());
    }
}

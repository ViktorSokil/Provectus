package utils.xml;


import com.websystique.springmvc.utils.xml.RegionXmlElement;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RegionXmlElementTest {

    private RegionXmlElement regionXmlElement;

    @Before
    public void setUp(){
        regionXmlElement = new RegionXmlElement();
        regionXmlElement.setId("1");
        regionXmlElement.setTitle("TestTitle");
    }

    @Test
    public void getterAndsetterTest() {
        assertEquals("1",regionXmlElement.getId());
        assertEquals("TestTitle",regionXmlElement.getTitle());
    }
}

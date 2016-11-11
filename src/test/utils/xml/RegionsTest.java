package utils.xml;


import com.websystique.springmvc.utils.xml.RegionXmlElement;
import com.websystique.springmvc.utils.xml.Regions;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RegionsTest {

    private Regions regions;
    private List<RegionXmlElement> list;

    @Before
    public void setUp(){
        regions = new Regions();
        list = new ArrayList<RegionXmlElement>();
        RegionXmlElement regionXmlElement = new RegionXmlElement();
        list.add(regionXmlElement);
        regions.setRegions(list);
    }

    @Test
    public void getterAndsetterTest() {
        assertEquals(list, regions.getRegions());
    }
}

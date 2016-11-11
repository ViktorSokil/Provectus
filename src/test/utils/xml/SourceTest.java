package utils.xml;


import com.websystique.springmvc.utils.xml.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class SourceTest {

    private Source source;
    private Date date;
    private Cities cities;
    private Regions regions;
    private Currencies currencies;
    private OrgTypes orgTypes;
    private Organizations organizations;

    @Before
    public void setUp(){
        date = new Date();
        cities = new Cities();
        regions = new Regions();
        currencies = new Currencies();
        orgTypes = new OrgTypes();
        organizations = new Organizations();
        currencies = new Currencies();
        source = new Source();

        source.setId("1");
        source.setDate(date);
        source.setCities(cities);
        source.setRegions(regions);
        source.setCurrencies(currencies);
        source.setOrgTypes(orgTypes);
        source.setOrganizations(organizations);
    }

    @Test
    public void getterAndsetterTest() {
        assertEquals("1",source.getId());
        assertEquals(date,source.getDate());
        assertEquals(cities,source.getCities());
        assertEquals(regions,source.getRegions());
        assertEquals(currencies,source.getCurrencies());
        assertEquals(orgTypes,source.getOrgTypes());
        assertEquals(organizations,source.getOrganizations());
    }
}

package persistence.entities;


import com.websystique.springmvc.persistence.entities.ActualCurrencyRate;
import com.websystique.springmvc.persistence.entities.City;
import com.websystique.springmvc.persistence.entities.Organization;
import com.websystique.springmvc.persistence.entities.Region;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class OrganizationTest {

    private Organization organization;
    private Region region;
    private City city;


    @Before
    public void setUp(){
        organization=new Organization();
        region = new Region();
        city = new City();

        organization.setId(1L);
        organization.setOrganizationId("TestOrg");
        organization.setOldOrgId(1);
        organization.setOrgType("12");
        organization.setTitle("TestTitle");
        organization.setBranch(true);
        organization.setRegion(region);
        organization.setCity(city);
        organization.setPhone("TestPhone");
        organization.setAddress("TestAddress");
        organization.setLinkType("TestLinkType");
        organization.setLink("TestLink");
        organization.setDate(new Date(25));

        region.setRegionId("1");
        city.setCityId("1");

        ActualCurrencyRate actualCurrencyRate=new ActualCurrencyRate();
        actualCurrencyRate.setRecordId(10L);
        List<ActualCurrencyRate> list=new ArrayList<>();
        list.add(actualCurrencyRate);

        organization.setCurrencyRateList(list);
    }

    @Test
    public void getterAndsetterTest(){
        assertEquals(new Long(1), organization.getId());
        assertEquals("TestOrg", organization.getOrganizationId());
        assertEquals(new Integer(1), (Integer)organization.getOldOrgId());
        assertEquals("12", organization.getOrgType());
        assertEquals("TestTitle", organization.getTitle());
        assertEquals(new Boolean(true), (Boolean) organization.isBranch());
        assertEquals("1", region.getRegionId());
        assertEquals("1", city.getCityId());
        assertEquals("TestPhone", organization.getPhone());
        assertEquals("TestAddress", organization.getAddress());
        assertEquals("TestLinkType", organization.getLinkType());
        assertEquals("TestLink", organization.getLink());
        assertEquals(new Date(25), organization.getDate());
        assertEquals(new Long(10), organization.getCurrencyRateList().get(0).getRecordId());
    }

}

package utils.xml;


import com.websystique.springmvc.utils.xml.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrganizationXmlElementTest {

    private OrganizationXmlElement organizationXmlElement;
    private  Title title;
    private Branch branch;
    private RegionXmlElement region;
    private CityXmlElement city;
    private Phone phone;
    private Address address;
    private Link link;
    private Currencies currencies;

    @Before
    public void setUp(){
        title = new Title();
        branch = new Branch();
        region = new RegionXmlElement();
        city = new CityXmlElement();
        phone = new Phone();
        address = new Address();
        link = new Link();
        currencies = new Currencies();
        organizationXmlElement = new OrganizationXmlElement();

        organizationXmlElement.setId("1");
        organizationXmlElement.setOldId(1);
        organizationXmlElement.setOrgTypeId("TestOrgTypeId");
        organizationXmlElement.setTitle(title);
        organizationXmlElement.setBranch(branch);
        organizationXmlElement.setRegion(region);
        organizationXmlElement.setCity(city);
        organizationXmlElement.setPhone(phone);
        organizationXmlElement.setAddress(address);
        organizationXmlElement.setLink(link);
        organizationXmlElement.setCurrencies(currencies);
    }

    @Test
    public void getterAndsetterTest() {
        assertEquals("1",organizationXmlElement.getId());
        assertEquals(new Integer(1),organizationXmlElement.getOldId());
        assertEquals("TestOrgTypeId",organizationXmlElement.getOrgTypeId());
        assertEquals(title,organizationXmlElement.getTitle());
        assertEquals(branch,organizationXmlElement.getBranch());
        assertEquals(region,organizationXmlElement.getRegion());
        assertEquals(city,organizationXmlElement.getCity());
        assertEquals(phone,organizationXmlElement.getPhone());
        assertEquals(address,organizationXmlElement.getAddress());
        assertEquals(currencies,organizationXmlElement.getCurrencies());
    }
}

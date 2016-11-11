package com.websystique.springmvc.utils;


import com.websystique.springmvc.persistence.entities.*;
import com.websystique.springmvc.utils.xml.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EntityUtilsTest {

    private City city;
    private CityXmlElement cityElement;
    private Region region;
    private RegionXmlElement regionElement;
    private Currency currency;
    private CurrencyXmlElement currencyElement;
    private OrgType orgType;
    private OrgTypeXmlElement orgTypeElement;
    private Organization organization;
    private OrganizationXmlElement organizationElement;
    private ActualCurrencyRate actualCurrencyRate;

    @Before
    public void setUp(){
        city = new City();
        cityElement = new CityXmlElement();
        region=new Region();
        regionElement=new RegionXmlElement();
        currency=new Currency();
        currencyElement=new CurrencyXmlElement();
        orgType=new OrgType();
        orgTypeElement=new OrgTypeXmlElement();
        actualCurrencyRate=new ActualCurrencyRate();
    }

    @Test
    public void createAndReturnCityEntityTest(){
        cityElement.setId("1");
        cityElement.setTitle("Name");
        city=EntityUtils.createAndReturnCityEntity(cityElement);
        assertEquals("1",city.getCityId());
        assertEquals("Name",city.getCityName());
    }

    @Test
    public void createAndReturnRegionEntityTest(){
        regionElement.setId("1");
        regionElement.setTitle("Name");
        region=EntityUtils.createAndReturnRegionEntity(regionElement);
        assertEquals("1",region.getRegionId());
        assertEquals("Name",region.getRegionName());
    }

    @Test
    public void createAndReturnCurrencyEntityTest(){
        currencyElement.setId("1");
        currencyElement.setTitle("Name");
        currency=EntityUtils.createAndReturnCurrencyEntity(currencyElement);
        assertEquals("1",currency.getId());
        assertEquals("Name",currency.getTitle());
    }

    @Test
    public void createAndReturnOrgTypeEntityTest(){
        orgTypeElement.setId("1");
        orgTypeElement.setTitle("Name");
        orgType=EntityUtils.createAndReturnOrgTypeEntity(orgTypeElement);
        assertEquals("1",orgType.getId());
        assertEquals("Name",orgType.getTitle());
    }

    @Test
    public void createAndReturnOrganizationEntityTest(){
        Title title = new Title();
        title.setValue("Name");
        Branch branch=new Branch();
        branch.setValue(true);
        Address address= new Address();
        address.setValue("address");
        CityXmlElement cityElement=new CityXmlElement();
        cityElement.setId("12");
        cityElement.setTitle("city");
        RegionXmlElement regionXmlElement=new RegionXmlElement();
        regionXmlElement.setId("11");
        regionXmlElement.setTitle("region");
        Link link = new Link();
        link.setHref("link");
        Phone phone=new Phone();
        phone.setValue("232526");

        organizationElement = new OrganizationXmlElement();
        organizationElement.setId("1");
        organizationElement.setTitle(title);
        organizationElement.setOldId(1);
        organizationElement.setBranch(branch);
        organizationElement.setAddress(address);
        organizationElement.setCity(cityElement);
        organizationElement.setRegion(regionXmlElement);
        organizationElement.setLink(link);
        organizationElement.setPhone(phone);
        organization = EntityUtils.createAndReturnOrganizationEntity(organizationElement);
        assertEquals("1", organization.getOrganizationId());
        assertEquals("Name", organization.getTitle());
        assertEquals(1, organization.getOldOrgId());
        assertEquals(true, organization.isBranch());
        assertEquals("address", organization.getAddress());
        assertEquals("12", organization.getCity().getCityId());
        assertEquals("city", organization.getCity().getCityName());
        assertEquals("11", organization.getRegion().getRegionId());
        assertEquals("region", organization.getRegion().getRegionName());
        assertEquals("link", organization.getLink());
        assertEquals("232526", organization.getPhone());
    }

    @Test
    public void createAndReturnActualCurrencyRateEntityTest(){
        currencyElement.setId("USD");
        currencyElement.setBuyRate(1.0);
        currencyElement.setAskRate(2.0);
        Organization organization=new Organization();
        organization.setId(1L);
        ActualCurrencyRate entity = EntityUtils.createAndReturnActualCurrencyRateEntity(currencyElement, organization);
        assertEquals(new Long(1L), entity.getIdFromOrg().getId());
        assertEquals("USD", entity.getCurrencyId().getId());
        assertEquals(new Double(1.0), entity.getBuyRate());
        assertEquals(new Double(2.0), entity.getAscRate());
    }
}

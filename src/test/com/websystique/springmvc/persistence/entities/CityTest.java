package com.websystique.springmvc.persistence.entities;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CityTest {

    private City city;

    @Before
    public void setUp(){
        city=new City();
        city.setCityId("1");
        city.setCityName("TestCity");

        Organization organization=new Organization();
        organization.setId(10L);
        List<Organization> list=new ArrayList<>();
        list.add(organization);

        city.setOrganizationList(list);
    }

    @Test
    public void getterAndsetterTest() {
        assertEquals("1",city.getCityId());
        assertEquals("TestCity",city.getCityName());
        assertEquals(1,city.getOrganizationList().size());
        assertEquals(new Long(10),city.getOrganizationList().get(0).getId());
    }
}

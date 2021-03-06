package com.websystique.springmvc.persistence.entities.wrappers;


import com.websystique.springmvc.utils.DateUtils;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class OrganizationWrapperTest {

    private OrganizationWrapper organizationWrapper;

    @Before
    public void setUp(){
        organizationWrapper=new OrganizationWrapper();
        organizationWrapper.setId(12L);
        organizationWrapper.setAddress("address");
        organizationWrapper.setBranch(true);
        organizationWrapper.setCity("City");
        organizationWrapper.setLink("Link");
        organizationWrapper.setTitle("Title");
        organizationWrapper.setLinkType("LinkType");
        organizationWrapper.setOldOrgId(11);
        organizationWrapper.setOrganizationId("OrganizationId");
        organizationWrapper.setRegion("Region");
        organizationWrapper.setOrgType("OrgType");
        organizationWrapper.setPhone("Phone");
    }

    @Test
    public void getterAndsetterTest(){
        Date date=new Date();
        String strDate = DateUtils.formatDate(date);
        organizationWrapper.setDate(date);
        organizationWrapper.setDateEx(strDate);
        assertEquals(new Long(12L),organizationWrapper.getId());
        assertEquals("address", organizationWrapper.getAddress());
        assertEquals(true, organizationWrapper.isBranch());
        assertEquals("City", organizationWrapper.getCity());
        assertEquals("Link", organizationWrapper.getLink());
        assertEquals("Title", organizationWrapper.getTitle());
        assertEquals("LinkType", organizationWrapper.getLinkType());
        assertEquals(11, organizationWrapper.getOldOrgId());
        assertEquals("OrganizationId", organizationWrapper.getOrganizationId());
        assertEquals(date, organizationWrapper.getDate());
        assertEquals("Region", organizationWrapper.getRegion());
        assertEquals("OrgType", organizationWrapper.getOrgType());
        assertEquals("Phone", organizationWrapper.getPhone());
        assertEquals(strDate, organizationWrapper.getDateEx());
    }
}

package com.websystique.springmvc.persistence.entities;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class OrgTypeTest {

    private OrgType orgType;

    @Before
    public void setUp(){
        orgType=new OrgType();
        orgType.setId("1");
        orgType.setTitle("TestOrgType");

        Organization organization=new Organization();
        organization.setId(10L);
        List<Organization> orgTypeList=new ArrayList<>();
        orgTypeList.add(organization);

        orgType.setOrgTypeList(orgTypeList);
    }

    @Test
    public void getterAndsetterTest() {
        assertEquals("1",orgType.getId());
        assertEquals("TestOrgType",orgType.getTitle());
        assertEquals(new Long(10),orgType.getOrgTypeList().get(0).getId());
    }
}

package com.websystique.springmvc.utils.xml;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class OrgTypesTest {

    private OrgTypes orgTypes;
    private List<OrgTypeXmlElement> list;

    @Before
    public void setUp(){
        orgTypes = new OrgTypes();
        list=new ArrayList<OrgTypeXmlElement>();
        OrgTypeXmlElement orgTypeXmlElement = new OrgTypeXmlElement();;

        list.add(orgTypeXmlElement);
        orgTypes.setOrgTypes(list);

    }

    @Test
    public void getterAndsetterTest() {
        assertEquals(list,orgTypes.getOrgTypes());
    }
}

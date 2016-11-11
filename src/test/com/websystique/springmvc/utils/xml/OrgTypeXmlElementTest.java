package com.websystique.springmvc.utils.xml;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrgTypeXmlElementTest {

    private OrgTypeXmlElement orgTypeXmlElement;

    @Before
    public void setUp(){
        orgTypeXmlElement = new OrgTypeXmlElement();
        orgTypeXmlElement.setId("1");
        orgTypeXmlElement.setTitle("TestTitle");
    }

    @Test
    public void getterAndsetterTest() {
        assertEquals("1",orgTypeXmlElement.getId());
        assertEquals("TestTitle",orgTypeXmlElement.getTitle());
    }
}

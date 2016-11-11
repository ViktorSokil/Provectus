package com.websystique.springmvc.utils.xml;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkTest {

    private Link link;


    @Before
    public void setUp(){
        link = new Link();
        link.setType("TestType");
        link.setHref("TestHref");

    }

    @Test
    public void getterAndsetterTest() {
        assertEquals("TestType",link.getType());
        assertEquals("TestHref",link.getHref());
    }
}

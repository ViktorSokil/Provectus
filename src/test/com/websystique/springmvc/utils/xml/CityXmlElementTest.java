package com.websystique.springmvc.utils.xml;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CityXmlElementTest {

    private CityXmlElement cityXmlElement;

    @Before
    public void setUp(){
        cityXmlElement = new CityXmlElement();
        cityXmlElement.setId("1");
        cityXmlElement.setTitle("TestTitle");
    }

    @Test
    public void getterAndsetterTest() {
        assertEquals("1",cityXmlElement.getId());
        assertEquals("TestTitle",cityXmlElement.getTitle());
    }

    @Test
    public void toStringTest(){
        String string = cityXmlElement.toString();
        assertEquals("id - 1 - TestTitle", string);
    }
}

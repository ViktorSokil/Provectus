package com.websystique.springmvc.utils.xml;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CitiesTest {

    private Cities cities;
    List<CityXmlElement> list;

    @Before
    public void setUp(){
        cities = new Cities();
        list=new ArrayList<CityXmlElement>();
        CityXmlElement cityXmlElement;
        cityXmlElement = new CityXmlElement();

        list.add(cityXmlElement);
        cities.setCities(list);
    }

    @Test
    public void getterAndsetterTest() {
        assertEquals(list,cities.getCities());
    }
}

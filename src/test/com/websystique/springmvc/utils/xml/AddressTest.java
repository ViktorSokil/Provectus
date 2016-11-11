package com.websystique.springmvc.utils.xml;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AddressTest {

    private Address address;

    @Before
    public void setUp(){
        address = new Address();
        String value = "TestAddress";
        address.setValue(value);

    }

    @Test
    public void getterAndsetterTest() {
        assertEquals("TestAddress",address.getValue());
    }
}

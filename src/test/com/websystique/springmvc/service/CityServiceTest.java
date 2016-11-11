package com.websystique.springmvc.service;

import com.websystique.springmvc.dao.ICityDao;
import com.websystique.springmvc.persistence.entities.City;
import com.websystique.springmvc.service.impl.CityServiceImpl;
import com.websystique.springmvc.utils.xml.CityXmlElement;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


public class CityServiceTest {

    @Mock
    private ICityDao cityDao;

    @InjectMocks
    private ICityService cityService=new CityServiceImpl();

    private List<CityXmlElement> cities;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        CityXmlElement element=new CityXmlElement();
        CityXmlElement element1=new CityXmlElement();
        cities=new ArrayList<>();
        cities.add(element);
        cities.add(element1);
    }

    @Test
    public void saveCityTest() {
        cityService.saveCity(cities);
        verify(cityDao,times(2)).saveCity((City)any());
    }
}

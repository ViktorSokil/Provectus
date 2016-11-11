package com.websystique.springmvc.dao;


import com.websystique.springmvc.configuration.TestDataBaseConfig;
import com.websystique.springmvc.dao.impl.CityDaoImpl;
import com.websystique.springmvc.persistence.entities.City;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static org.junit.Assert.assertEquals;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TestDataBaseConfig.class)
@Rollback
@Transactional
public class CityDaoImplTest {

    @PersistenceContext
    private EntityManager em;

    @InjectMocks
    private CityDaoImpl cityDao=new CityDaoImpl();

    private City city;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        cityDao.setEm(em);

        city=new City();
        city.setCityId("cityId");
    }

    @Test
    public void saveCityTest() {
        cityDao.saveCity(city);
        City actual=em.find(City.class,"cityId");
        assertEquals("cityId",actual.getCityId());
    }
}

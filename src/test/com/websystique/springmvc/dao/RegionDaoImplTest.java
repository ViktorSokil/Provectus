package com.websystique.springmvc.dao;

import com.websystique.springmvc.configuration.TestDataBaseConfig;
import com.websystique.springmvc.dao.impl.RegionDaoImpl;
import com.websystique.springmvc.persistence.entities.Region;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
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
@Transactional
public class RegionDaoImplTest {

    @PersistenceContext
    private EntityManager em;

    @InjectMocks
    private RegionDaoImpl regionDao=new RegionDaoImpl();

    private Region region;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        regionDao.setEm(em);

        region=new Region();
        region.setRegionId("regionId");
    }

    @Test
    public void saveRegionTest(){
        regionDao.saveRegion(region);
        Region actual=em.find(Region.class, "regionId");
        assertEquals("regionId", actual.getRegionId());
    }
}

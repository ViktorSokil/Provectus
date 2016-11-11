package com.websystique.springmvc.service;


import com.websystique.springmvc.dao.IRegionDao;
import com.websystique.springmvc.persistence.entities.Region;
import com.websystique.springmvc.service.impl.RegionServiceImpl;
import com.websystique.springmvc.utils.xml.RegionXmlElement;
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

public class RegionServiceTest {

    @Mock
    private IRegionDao regionDao;

    @InjectMocks
    private IRegionService regionService=new RegionServiceImpl();

    private List<RegionXmlElement> regions;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        RegionXmlElement element=new RegionXmlElement();
        RegionXmlElement element1=new RegionXmlElement();
        regions=new ArrayList<>();
        regions.add(element);
        regions.add(element1);
    }

    @Test
    public void saveRegionTest() {
        regionService.saveRegion(regions);
        verify(regionDao,times(2)).saveRegion((Region) any());
    }
}

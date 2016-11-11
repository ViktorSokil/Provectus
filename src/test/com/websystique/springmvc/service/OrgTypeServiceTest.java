package com.websystique.springmvc.service;


import com.websystique.springmvc.dao.IOrgTypeDao;
import com.websystique.springmvc.persistence.entities.OrgType;
import com.websystique.springmvc.service.impl.OrgTypeServiceImpl;
import com.websystique.springmvc.utils.xml.OrgTypeXmlElement;
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

public class OrgTypeServiceTest {

    @Mock
    private IOrgTypeDao orgTypeDao;

    @InjectMocks
    private IOrgTypeService orgTypeService=new OrgTypeServiceImpl();

    private List<OrgTypeXmlElement> orgTypes;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        OrgTypeXmlElement element=new OrgTypeXmlElement();
        OrgTypeXmlElement element1=new OrgTypeXmlElement();
        orgTypes=new ArrayList<>();
        orgTypes.add(element);
        orgTypes.add(element1);
    }

    @Test
    public void saveCityTest() {
        orgTypeService.saveOrgType(orgTypes);
        verify(orgTypeDao,times(2)).saveOrgType((OrgType)any());
    }
}

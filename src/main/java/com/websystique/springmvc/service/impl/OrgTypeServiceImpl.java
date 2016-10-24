package com.websystique.springmvc.service.impl;

import com.websystique.springmvc.dao.IOrgTypeDao;
import com.websystique.springmvc.persistence.entities.OrgType;
import com.websystique.springmvc.service.IOrgTypeService;
import com.websystique.springmvc.utils.EntityUtils;
import com.websystique.springmvc.utils.xml.OrgTypeXmlElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrgTypeServiceImpl implements IOrgTypeService {

    @Autowired
    private IOrgTypeDao orgTypeDao;

    @Override
    public void saveOrgType(List<OrgTypeXmlElement> orgTypeElements) {
        for(OrgTypeXmlElement orgTypeElement: orgTypeElements){
            OrgType orgType = EntityUtils.createAndReturnOrgTypeEntity(orgTypeElement);
            orgTypeDao.saveOrgType(orgType);
        }
    }
}

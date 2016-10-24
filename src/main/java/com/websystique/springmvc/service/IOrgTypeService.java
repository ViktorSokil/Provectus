package com.websystique.springmvc.service;

import com.websystique.springmvc.utils.xml.OrgTypeXmlElement;

import java.util.List;


public interface IOrgTypeService {
    void saveOrgType (List<OrgTypeXmlElement> orgType);
}

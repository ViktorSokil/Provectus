package com.websystique.springmvc.service;

import com.websystique.springmvc.utils.xml.OrgTypeXmlElement;

import java.util.List;


public interface OrgTypeService {
    void saveOrgType (List<OrgTypeXmlElement> orgType);
}

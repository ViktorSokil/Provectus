package com.websystique.springmvc.service;

import com.websystique.springmvc.persistence.entities.Organization;
import com.websystique.springmvc.utils.xml.Source;

import java.util.List;

public interface IOrganizationService {
    void saveOrganization(Source source);

    List<Organization> getOrganizationById(String id);
}

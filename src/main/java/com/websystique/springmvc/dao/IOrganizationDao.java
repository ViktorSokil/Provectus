package com.websystique.springmvc.dao;


import com.websystique.springmvc.persistence.entities.Organization;
import com.websystique.springmvc.persistence.entities.wrappers.OrganizationWrapper;

import java.util.List;

public interface IOrganizationDao {
    Organization saveOrganization(Organization organization);

    List<Organization> getOrganizationById(String id);

    List<OrganizationWrapper> findAll();
}

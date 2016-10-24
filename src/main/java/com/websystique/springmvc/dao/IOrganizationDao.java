package com.websystique.springmvc.dao;


import com.websystique.springmvc.persistence.entities.Organization;

import java.util.List;

public interface IOrganizationDao {
    Organization saveOrganization(Organization organization);

    List<Organization> getOrganizationById(String id);
}

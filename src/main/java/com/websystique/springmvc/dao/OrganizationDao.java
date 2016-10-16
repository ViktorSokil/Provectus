package com.websystique.springmvc.dao;


import com.websystique.springmvc.persistence.entities.Organization;

public interface OrganizationDao {
    Organization saveOrganization(Organization organization);
}

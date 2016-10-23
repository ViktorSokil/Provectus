package com.websystique.springmvc.dao;


import com.websystique.springmvc.persistence.entities.Organization;

public interface IOrganizationDao {
    Organization saveOrganization(Organization organization);
}

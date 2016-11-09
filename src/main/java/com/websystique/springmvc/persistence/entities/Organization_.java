package com.websystique.springmvc.persistence.entities;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.util.Date;

@StaticMetamodel(Organization.class)
public class Organization_ {
    public static volatile SingularAttribute<Organization, Long> id;
    public static volatile SingularAttribute<Organization, String> organizationId;
    public static volatile SingularAttribute<Organization, Integer> oldOrgId;
    public static volatile SingularAttribute<Organization, String> orgType;
    public static volatile SingularAttribute<Organization, String> title;
    public static volatile SingularAttribute<Organization, Boolean> branch;
    public static volatile SingularAttribute<Organization, Region> region;
    public static volatile SingularAttribute<Organization, City> city;
    public static volatile SingularAttribute<Organization, String> phone;
    public static volatile SingularAttribute<Organization, String> address;
    public static volatile SingularAttribute<Organization, String> linkType;
    public static volatile SingularAttribute<Organization, String> link;
    public static volatile SingularAttribute<Organization, Date> date;
}

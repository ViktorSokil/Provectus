package com.websystique.springmvc.persistence.entities;

import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;


@StaticMetamodel(Region.class)
public class Region_ {
    public static volatile SingularAttribute<Region, String> regionId;
    public static volatile SingularAttribute<Region, String> regionName;
    public static volatile SetAttribute<Region, Organization> regionList;
}

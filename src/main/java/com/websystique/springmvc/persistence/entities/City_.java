package com.websystique.springmvc.persistence.entities;

import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;


@StaticMetamodel(City.class)
public class City_ {
    public static volatile SingularAttribute<City, String> cityId;
    public static volatile SingularAttribute<City, String> cityName;
    public static volatile SetAttribute<City, Organization> organizationList;
}

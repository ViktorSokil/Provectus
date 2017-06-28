package com.websystique.springmvc.persistence.entities;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Currency.class)
public class Currency_ {
    public static volatile SingularAttribute<Currency, String> id;
    public static volatile SingularAttribute<Currency, String> title;
}

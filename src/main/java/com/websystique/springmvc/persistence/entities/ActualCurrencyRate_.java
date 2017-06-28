package com.websystique.springmvc.persistence.entities;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.util.Date;

@StaticMetamodel(ActualCurrencyRate.class)
public class ActualCurrencyRate_ {
    public static volatile SingularAttribute<ActualCurrencyRate, Organization> idFromOrg;
    public static volatile SingularAttribute<ActualCurrencyRate, Currency> currencyId;
    public static volatile SingularAttribute<ActualCurrencyRate, Double> buyRate;
    public static volatile SingularAttribute<ActualCurrencyRate, Double> ascRate;
    public static volatile SingularAttribute<Organization, Date> date;
}

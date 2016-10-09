package com.websystique.springmvc.utils;


import com.websystique.springmvc.persistence.entities.City;
import com.websystique.springmvc.persistence.entities.Currency;
import com.websystique.springmvc.persistence.entities.OrgType;
import com.websystique.springmvc.persistence.entities.Region;
import com.websystique.springmvc.utils.xml.CityXmlElement;
import com.websystique.springmvc.utils.xml.CurrencyXmlElement;
import com.websystique.springmvc.utils.xml.OrgTypeXmlElement;
import com.websystique.springmvc.utils.xml.RegionXmlElement;

public class EntityUtils {

    private EntityUtils(){}

    public static City createAndReturnCityEntity(CityXmlElement cityElement) {
        City entity=new City();
        entity.setCityId(cityElement.getId());
        entity.setCityName(cityElement.getTitle());
        return entity;
    }

    public static Region createAndReturnRegionEntity(RegionXmlElement regionXmlElement) {
        Region entity = new Region();
        entity.setRegionId(regionXmlElement.getId());
        entity.setRegionName(regionXmlElement.getTitle());
        return entity;
    }

    public static Currency createAndReturnCurrencyEntity(CurrencyXmlElement currencyElement) {
        Currency entity = new Currency();
        entity.setId(currencyElement.getId());
        entity.setTitle(currencyElement.getTitle());
        return entity;
    }

    public static OrgType createAndReturnOrgTypeEntity(OrgTypeXmlElement orgTypeElement) {
        OrgType entity = new OrgType();
        entity.setId(orgTypeElement.getId());
        entity.setTitle(orgTypeElement.getTitle());
        return entity;
    }
}

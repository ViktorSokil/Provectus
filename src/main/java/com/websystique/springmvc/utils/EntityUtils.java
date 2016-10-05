package com.websystique.springmvc.utils;


import com.websystique.springmvc.persistence.entities.City;
import com.websystique.springmvc.utils.xml.CityXmlElement;

public class EntityUtils {

    private EntityUtils(){}

    public static City createAndReturnCityEntity(CityXmlElement cityElement) {
        City entity=new City();
        entity.setCityId(cityElement.getId());
        entity.setCityName(cityElement.getTitle());
        return entity;
    }
}

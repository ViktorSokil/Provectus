package com.websystique.springmvc.service.impl;

import com.websystique.springmvc.dao.CityDao;
import com.websystique.springmvc.persistence.entities.City;
import com.websystique.springmvc.service.CityService;
import com.websystique.springmvc.utils.EntityUtils;
import com.websystique.springmvc.utils.xml.CityXmlElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Override
    public void saveCity(List<CityXmlElement> cityElements) {
        for(CityXmlElement cityElement:cityElements){
            City city= EntityUtils.createAndReturnCityEntity(cityElement);
            cityDao.saveCity(city);
        }
    }
}

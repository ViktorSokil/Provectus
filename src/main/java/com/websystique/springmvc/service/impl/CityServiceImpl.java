package com.websystique.springmvc.service.impl;

import com.websystique.springmvc.dao.CityDao;
import com.websystique.springmvc.persistence.entities.City;
import com.websystique.springmvc.service.CityService;
import com.websystique.springmvc.utils.EntityUtils;
import com.websystique.springmvc.utils.xml.CityElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Override
    public void saveCity(List<CityElement> cityElements) {
        for(CityElement cityElement:cityElements){
            City city= EntityUtils.createAndReturnCityEntity(cityElement);
            cityDao.saveCity(city);
        }
    }
}

package com.websystique.springmvc.service;


import com.websystique.springmvc.utils.xml.CityXmlElement;

import java.util.List;

public interface ICityService {
    void saveCity(List<CityXmlElement> cities);
}

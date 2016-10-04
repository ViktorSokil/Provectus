package com.websystique.springmvc.service;



import com.websystique.springmvc.utils.xml.CityElement;

import java.util.List;

public interface CityService {
    void saveCity(List<CityElement> cities);
}

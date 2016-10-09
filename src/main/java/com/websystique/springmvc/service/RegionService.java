package com.websystique.springmvc.service;

import com.websystique.springmvc.utils.xml.RegionXmlElement;

import java.util.List;


public interface RegionService {
    void saveRegion(List<RegionXmlElement> regionElements);
}

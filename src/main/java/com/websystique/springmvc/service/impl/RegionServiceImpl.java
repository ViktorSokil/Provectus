package com.websystique.springmvc.service.impl;

import com.websystique.springmvc.dao.RegionDao;
import com.websystique.springmvc.persistence.entities.Region;
import com.websystique.springmvc.service.RegionService;
import com.websystique.springmvc.utils.EntityUtils;
import com.websystique.springmvc.utils.xml.RegionXmlElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionServiceImpl implements RegionService{

    @Autowired
    private RegionDao regionDao;

    @Override
    public void saveRegion(List<RegionXmlElement> regionElements) {
        for (RegionXmlElement regionElement: regionElements){
            Region region = EntityUtils.createAndReturnRegionEntity(regionElement);
            regionDao.saveRegion(region);
        }
    }
}

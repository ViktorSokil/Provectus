package com.websystique.springmvc.utils.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "regions")
public class Regions {
    private List<RegionXmlElement> regions=new ArrayList<RegionXmlElement>();

    public Regions (){}

    @XmlElement(name = "region")
    public List<RegionXmlElement> getRegions() {
        return regions;
    }
    public void setRegions(List<RegionXmlElement> regions) {
        this.regions = regions;
    }
}



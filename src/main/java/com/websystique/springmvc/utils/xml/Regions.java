package com.websystique.springmvc.utils.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "regions")
public class Regions {
    private List<Region> regions=new ArrayList<Region>();

    public Regions (){}

    @XmlElement(name = "region")
    public List<Region> getRegions() {
        return regions;
    }
    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }
}



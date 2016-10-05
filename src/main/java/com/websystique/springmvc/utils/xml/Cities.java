package com.websystique.springmvc.utils.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "cities")
public class Cities {
        private List<CityXmlElement> cities=new ArrayList<CityXmlElement>();

        public Cities (){}

        @XmlElement(name = "city")
        public List<CityXmlElement> getCities() {
            return cities;
        }
        public void setCities(List<CityXmlElement> cities) {
            this.cities = cities;
        }
    }



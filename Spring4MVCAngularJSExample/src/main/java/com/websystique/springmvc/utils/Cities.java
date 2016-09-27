package com.websystique.springmvc.utils;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "cities")
public class Cities {
        private List<City> cities=new ArrayList<City>();

        public Cities (){}

        @XmlElement(name = "city")
        public List<City> getCities() {
            return cities;
        }
        public void setCities(List<City> cities) {
            this.cities = cities;
        }
    }



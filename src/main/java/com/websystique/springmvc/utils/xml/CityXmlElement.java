package com.websystique.springmvc.utils;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "city")
public class City {
    private String id;
    private String title;

    public City(){}

    @XmlAttribute(name = "id")
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
    @XmlAttribute(name = "title")
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String toString(){
        return "id - "+ id+" - " + title;
    }
}

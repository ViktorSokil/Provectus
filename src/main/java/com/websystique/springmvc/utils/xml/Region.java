package com.websystique.springmvc.utils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "region")
public class Region {
    @XmlAttribute(name = "id")
    private String id;
    @XmlAttribute(name = "title")
    private String title;

    public Region(){}

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
}
package com.websystique.springmvc.utils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "title")
public class Title implements Serializable {

    @XmlAttribute(name="value")
    private String value;

    public Title(){}

    public String getValue(){
        return value;
    }
    public void setValue(){
        this.value=value;
    }
}
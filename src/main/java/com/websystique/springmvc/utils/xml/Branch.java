package com.websystique.springmvc.utils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "branch")
public class Branch {
    @XmlAttribute(name="value")
    private String value;

    public Branch(){}

    public String getValue(){
        return value;
    }
    public void setValue(){
        this.value=value;
    }
}

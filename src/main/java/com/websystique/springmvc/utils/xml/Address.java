package com.websystique.springmvc.utils.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "address")
public class Address {

    @XmlAttribute(name="value")
    private String value;

    public Address(){}

    public String getValue(){
        return value;
    }
    public void setValue(){
        this.value=value;
    }
}
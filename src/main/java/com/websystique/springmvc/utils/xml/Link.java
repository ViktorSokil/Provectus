package com.websystique.springmvc.utils.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "link")
public class Link {
    @XmlAttribute(name = "type")
    private String type;
    @XmlAttribute(name = "href")
    private String href;

    public Link(){}

    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type=type;
    }
    public String getHref(){
        return href;
    }
    public void setHref(String href){
        this.href=href;
    }
}

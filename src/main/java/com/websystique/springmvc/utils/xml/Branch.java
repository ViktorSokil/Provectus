package com.websystique.springmvc.utils.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "branch")
public class Branch {
    @XmlAttribute(name="value")
    private boolean value;

    public Branch(){}

    public boolean getValue(){
        return value;
    }
    public void setValue(boolean value){
        this.value=value;
    }
}

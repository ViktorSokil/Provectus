package com.websystique.springmvc.utils;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "organizations")
public class Organizations {
    private List<Organization> organizations=new ArrayList<Organization>();

    public Organizations(){}

    @XmlElement(name = "organization")
    public List<Organization> getOrganizations() {
        return organizations;
    }
    public void setOrganizations(List<Organization> organizations) {
        this.organizations = organizations;
    }
}



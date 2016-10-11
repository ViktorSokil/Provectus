package com.websystique.springmvc.utils.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "organizations")
public class Organizations {
    private List<OrganizationXmlElement> organizations=new ArrayList<>();

    public Organizations(){}

    @XmlElement(name = "organization")
    public List<OrganizationXmlElement> getOrganizations() {
        return organizations;
    }
    public void setOrganizations(List<OrganizationXmlElement> organizations) {
        this.organizations = organizations;
    }
}



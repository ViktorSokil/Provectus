package com.websystique.springmvc.utils;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "org_types")
public class OrgTypes {
    private List<OrgType> orgTypes=new ArrayList<OrgType>();

    public OrgTypes (){}

    @XmlElement(name = "org_type")
    public List<OrgType> getOrgTypes() {
        return orgTypes;
    }
    public void setOrgTypes(List<OrgType> orgTypes) {
        this.orgTypes = orgTypes;
    }
}



package com.websystique.springmvc.utils.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "org_types")
public class OrgTypes {
    private List<OrgTypeXmlElement> orgTypes = new ArrayList<>();

    public OrgTypes (){}

    @XmlElement(name = "org_type")
    public List<OrgTypeXmlElement> getOrgTypes() {
        return orgTypes;
    }
    public void setOrgTypes(List<OrgTypeXmlElement> orgTypes) {
        this.orgTypes = orgTypes;
    }
}



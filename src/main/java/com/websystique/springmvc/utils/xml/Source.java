package com.websystique.springmvc.utils;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlRootElement(name = "source")
@XmlType(propOrder={"id", "date","organizations","orgTypes","currencies","regions","cities"})
public class Source {
    private String id;
    private Date date;
    private Cities cities;
    private Regions regions;
    private Currencies currencies;
    private OrgTypes orgTypes;
    private Organizations organizations;

    public Source (){}

    @XmlAttribute(name = "id")
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    @XmlAttribute(name = "date")
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    @XmlElement(name = "cities")
    public Cities getCities() {
        return cities;
    }
    public void setCities(Cities cities) {
        this.cities = cities;
    }
    @XmlElement(name = "regions")
    public Regions getRegions() {
        return regions;
    }
    public void setRegions(Regions regions) {
        this.regions = regions;
    }
    @XmlElement(name = "currencies")
    public Currencies getCurrencies() {
        return currencies;
    }
    public void setCurrencies(Currencies currencies) {
        this.currencies = currencies;
    }
    @XmlElement(name = "org_types")
     public OrgTypes getOrgTypes() {
        return orgTypes;
    }
    public void setOrgTypes(OrgTypes orgTypes) {
        this.orgTypes = orgTypes;
    }
    @XmlElement(name = "organizations")
    public Organizations getOrganizations() {
        return organizations;
    }
    public void setOrganizations(Organizations organizations) {
        this.organizations = organizations;
    }
}

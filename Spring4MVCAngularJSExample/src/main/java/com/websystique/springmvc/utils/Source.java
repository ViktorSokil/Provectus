package com.websystique.springmvc.utils;

import javax.xml.bind.annotation.*;
import java.util.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "source")
public class Source {
    @XmlAttribute(name = "id")
    private String id;
    @XmlAttribute(name = "date")
    private Date date;
    @XmlElement(name = "organizations")
    private List<Organization> organizations=new ArrayList<Organization>();
    //@XmlElement(name = "org_types")
    //private List<OrgType> orgTypes=new ArrayList<OrgType>();
    @XmlElement(name = "currencies")
    private Set<Currency> currencies=new HashSet<Currency>();
    @XmlElement(name = "regions")
    private Set<Region> regions=new HashSet<Region>();
    @XmlElement(name = "cities")
    private Set<City> cities=new HashSet<City>();

    public Source (){}

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public List<Organization> getOrganizations() {
        return organizations;
    }
    public void setOrganizations(List<Organization> organizations) {
        this.organizations = organizations;
    }
    //public List<OrgType> getOrgTypes() {
    //    return orgTypes;
    //}
    //public void setOrgTypes(List<OrgType> orgTypes) {
    //    this.orgTypes = orgTypes;
    //}
    public Set<Currency> getCurrencies() {
        return currencies;
    }
    public void setCurrencies(Set<Currency> currencies) {
        this.currencies = currencies;
    }
    public Set<Region> getRegions() {
        return regions;
    }
    public void setRegions(Set<Region> regions) {
        this.regions = regions;
    }
    public Set<City> getCities() {
        return cities;
    }
    public void setCities(Set<City> cities) {
        this.cities = cities;
    }
}

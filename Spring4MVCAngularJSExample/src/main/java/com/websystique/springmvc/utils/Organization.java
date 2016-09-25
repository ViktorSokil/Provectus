package com.websystique.springmvc.utils;

import javax.xml.bind.annotation.*;
import java.util.Set;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "organization")
//@XmlType(propOrder={"name", "rate", "date","time","ask","bid"})
public class Organization {
    @XmlAttribute(name = "id")
    private String id;
    @XmlAttribute(name = "oldid")
    private Integer oldId;
    //@XmlAttribute(name = "org_type")
    //private OrgType orgType;
    @XmlElement(name = "title")
    private String title;
    @XmlElement(name = "region")
    private Region region;
    @XmlElement(name = "city")
    private City city;
    @XmlElement(name = "phone")
    private String phone;
    @XmlElement(name = "address")
    private String address;
    @XmlElement(name = "link")
    private Link link;
    @XmlElement(name = "currencies")
    private Set<Currency> currencies;

    public Organization(){}

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Integer getOldId() {
        return oldId;
    }
    public void setOldId(Integer oldId) {
        this.oldId = oldId;
    }
    /*public OrgType getOrgType() {
        return orgType;
    }
    public void setOrgType(OrgType orgType) {
        this.orgType = orgType;
    } */
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title=title;
    }
    public Region getRegion() {
        return region;
    }
    public void setRegion(Region region) {
        this.region = region;
    }
    public City getCity() {
        return city;
    }
    public void setCity(City city) {
        this.city = city;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone=phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address=address;
    }
    public Link getLink() {
        return link;
    }
    public void setLink(Link link) {
        this.link=link;
    }
    public Set<Currency> getCurrencies() {
        return currencies;
    }
    public void setCurrencies(Set<Currency> currencies) {
        this.currencies=currencies;
    }
}


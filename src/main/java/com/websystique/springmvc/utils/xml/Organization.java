package com.websystique.springmvc.utils;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "organization")
@XmlType(propOrder={"id", "oldId","orgTypeId", "title","branch","region","city","phone","address","link","currencies"})
public class Organization {
    @XmlAttribute(name = "id")
    private String id;
    @XmlAttribute(name = "oldid")
    private Integer oldId;
    @XmlAttribute(name = "org_type")
    private String orgTypeId;
    @XmlElement(name="title")
    private List<Title> title=new ArrayList <Title>();
    @XmlElement(name="branch")
    private List<Branch> branch=new ArrayList <>();
    @XmlElement(name="region")
    private Region region;
    @XmlElement(name="city")
    private City city;
    @XmlElement(name = "phone")
    private Phone phone;
    @XmlElement(name = "address")
    private List<Address> address=new ArrayList<Address>();
    @XmlElement(name = "link")
    private Link link;
    @XmlElement(name="currencies")
    private Currencies currencies; //=new ArrayList<Currency>();

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
    public String getOrgTypeId() {
        return orgTypeId;
    }
    public void setOrgTypeId(String orgTypeId) {
        this.orgTypeId = orgTypeId;
    }
    public List<Title> getTitle() {
        return title;
    }
    public void setTitle(List<Title> title) {
        this.title=title;
    }

    public List<Branch> getBranch() {
        return branch;
    }

    public void setBranch(List<Branch> branch) {
        this.branch = branch;
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
    public Phone getPhone() {
        return phone;
    }
    public void setPhone(Phone phone) {
        this.phone=phone;
    }
    public List<Address> getAddress() {
        return address;
    }
    public void setAddress(List<Address> address) {
        this.address=address;
    }
    public Link getLink() {
        return link;
    }
    public void setLink(Link link) {
        this.link=link;
    }
    public Currencies getCurrencies() {
        return currencies;
    }
    public void setCurrencies(Currencies currencies) {
        this.currencies=currencies;
    }

}


package com.websystique.springmvc.utils.xml;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "organization")
@XmlType(propOrder={"id", "oldId","orgTypeId", "title","branch","region","city","phone","address","link","currencies"})
public class OrganizationXmlElement {
    @XmlAttribute(name = "id")
    private String id;
    @XmlAttribute(name = "oldid")
    private Integer oldId;
    @XmlAttribute(name = "org_type")
    private String orgTypeId;
    @XmlElement(name="title")
    private Title title;
    @XmlElement(name="branch")
    private Branch branch;
    @XmlElement(name="region")
    private RegionXmlElement region;
    @XmlElement(name="city")
    private CityXmlElement city;
    @XmlElement(name = "phone")
    private Phone phone;
    @XmlElement(name = "address")
    private Address address;
    @XmlElement(name = "link")
    private Link link;
    @XmlElement(name="currencies")
    private Currencies currencies;

    public OrganizationXmlElement(){}

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
    public Title getTitle() {
        return title;
    }
    public void setTitle(Title title) {
        this.title=title;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public RegionXmlElement getRegion() {
        return region;
    }
    public void setRegion(RegionXmlElement region) {
        this.region = region;
    }
    public CityXmlElement getCity() {
        return city;
    }
    public void setCity(CityXmlElement city) {
        this.city = city;
    }
    public Phone getPhone() {
        return phone;
    }
    public void setPhone(Phone phone) {
        this.phone=phone;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
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


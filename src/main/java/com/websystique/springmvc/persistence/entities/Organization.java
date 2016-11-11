package com.websystique.springmvc.persistence.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ORGANIZATIONS")
public class Organization {
    @Id
    @Column (name = "id", nullable = false)
    @GeneratedValue (strategy = GenerationType.AUTO, generator = "org_seqgen")
    @SequenceGenerator(name = "org_seqgen", sequenceName = "organizations_seq")
    private Long id;
    @Column(name = "org_id")
    private String organizationId;
    @Column(name = "old_org_id")
    private int oldOrgId;
    @Column(name = "org_type")
    private String orgType;
    @Column(name = "title")
    private String title;
    @Column(name = "branch")
    private boolean branch;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "region")
    private Region region;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "city")
    private City city;
    @Column(name = "phone")
    private  String phone;
    @Column(name = "address")
    private String address;
    @Column(name = "link_type")
    private String linkType;
    @Column(name = "link")
    private String link;
    @Column(name="actual_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idFromOrg")
    private List<ActualCurrencyRate> currencyRateList = new ArrayList<>();

    public Organization(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public int getOldOrgId() {
        return oldOrgId;
    }

    public void setOldOrgId(int oldOrgId) {
        this.oldOrgId = oldOrgId;
    }

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isBranch() {
        return branch;
    }

    public void setBranch(boolean branch) {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLinkType() {
        return linkType;
    }

    public void setLinkType(String linkType) {
        this.linkType = linkType;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<ActualCurrencyRate> getCurrencyRateList() {
        return currencyRateList;
    }

    public void setCurrencyRateList(List<ActualCurrencyRate> currencyRateList) {
        this.currencyRateList = currencyRateList;
    }
}

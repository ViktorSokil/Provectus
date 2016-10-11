package com.websystique.springmvc.persistence.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ORGANIZATIONS")
public class Organization {
    @Id
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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region")
    private Region region;
    @ManyToOne(fetch = FetchType.LAZY)
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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "currency1")
    private Currency currency1;
    @Column(name = "currency1_br")
    private double currency1br;
    @Column(name = "currency1_ar")
    private double currency1ar;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "currency2")
    private Currency currency2;
    @Column(name = "currency2_br")
    private double currency2br;
    @Column(name = "currency2_ar")
    private double currency2ar;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "currency3")
    private Currency currency3;
    @Column(name = "currency3_br")
    private double currency3br;
    @Column(name = "currency3_ar")
    private double currency3ar;
    @Column(name="actual_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    public Organization(){}

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

    public Currency getCurrency1() {
        return currency1;
    }

    public void setCurrency1(Currency currency1) {
        this.currency1 = currency1;
    }

    public double getCurrency1br() {
        return currency1br;
    }

    public void setCurrency1br(double currency1br) {
        this.currency1br = currency1br;
    }

    public double getCurrency1ar() {
        return currency1ar;
    }

    public void setCurrency1ar(double currency1ar) {
        this.currency1ar = currency1ar;
    }

    public Currency getCurrency2() {
        return currency2;
    }

    public void setCurrency2(Currency currency2) {
        this.currency2 = currency2;
    }

    public double getCurrency2br() {
        return currency2br;
    }

    public void setCurrency2br(double currency2br) {
        this.currency2br = currency2br;
    }

    public double getCurrency2ar() {
        return currency2ar;
    }

    public void setCurrency2ar(double currency2ar) {
        this.currency2ar = currency2ar;
    }

    public Currency getCurrency3() {
        return currency3;
    }

    public void setCurrency3(Currency currency3) {
        this.currency3 = currency3;
    }

    public double getCurrency3br() {
        return currency3br;
    }

    public void setCurrency3br(double currency3br) {
        this.currency3br = currency3br;
    }

    public double getCurrency3ar() {
        return currency3ar;
    }

    public void setCurrency3ar(double currency3ar) {
        this.currency3ar = currency3ar;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

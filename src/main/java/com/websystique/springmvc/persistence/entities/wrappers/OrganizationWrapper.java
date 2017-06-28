package com.websystique.springmvc.persistence.entities.wrappers;

import com.websystique.springmvc.utils.DateUtils;

import java.util.Date;

public class OrganizationWrapper {
    private Long id;
    private String organizationId;
    private int oldOrgId;
    private String orgType;
    private String title;
    private boolean branch;
    private String region;
    private String city;
    private  String phone;
    private String address;
    private String linkType;
    private String link;
    private String date;

    public OrganizationWrapper(){}

    public OrganizationWrapper(Long id, String organizationId, int oldOrgId, String orgType, String title, boolean branch, String region, String city, String phone, String address, String linkType, String link, Date date) {
        this.id = id;
        this.organizationId = organizationId;
        this.oldOrgId = oldOrgId;
        this.orgType = orgType;
        this.title = title;
        this.branch = branch;
        this.region = region;
        this.city = city;
        this.phone = phone;
        this.address = address;
        this.linkType = linkType;
        this.link = link;
        this.date = DateUtils.formatDate(date);
    }

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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

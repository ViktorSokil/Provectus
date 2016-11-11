package com.websystique.springmvc.persistence.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table (name = "REGIONS")
public class Region {
    @Id
    @Column (name = "region_id")
    private String regionId;

    @Column (name = "region_name")
    private String regionName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "region")
    private List<Organization> regionList = new ArrayList<>();

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public List<Organization> getRegionList() {
        return regionList;
    }

    public void setRegionList(List<Organization> regionList) {
        this.regionList = regionList;
    }
}

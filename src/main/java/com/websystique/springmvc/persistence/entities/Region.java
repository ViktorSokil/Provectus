package com.websystique.springmvc.persistence.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table (name = "REGIONS")
public class Region {
    @Id
    @Column (name = "region_id")
    private String regionId;

    @Column (name = "region_name")
    private String regionName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "region")
    private Set<Organization> regionList = new HashSet<>();

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

    public Set<Organization> getRegionList() {
        return regionList;
    }

    public void setRegionList(Set<Organization> regionList) {
        this.regionList = regionList;
    }
}

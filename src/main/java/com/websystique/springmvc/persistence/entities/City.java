package com.websystique.springmvc.persistence.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CITIES")
public class City {
    @Id
    @Column(name = "city_id")
    private String cityId;

    @Column(name = "city_name")
    private String cityName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
    private Set<Organization> organizationList = new HashSet<>();

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Set<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(Set<Organization> organizationList) {
        this.organizationList = organizationList;
    }
}

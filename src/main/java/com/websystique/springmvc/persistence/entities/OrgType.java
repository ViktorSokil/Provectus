package com.websystique.springmvc.persistence.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "ORGTYPES")
public class OrgType {
    @Id
    @Column(name = "orgType_id")
    private String id;

    @Column(name = "orgType_name")
    private String title;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgType")
    private List<Organization> orgTypeList = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Organization> getOrgTypeList() {
        return orgTypeList;
    }

    public void setOrgTypeList(List<Organization> orgTypeList) {
        this.orgTypeList = orgTypeList;
    }
}

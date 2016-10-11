package com.websystique.springmvc.persistence.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CURRENCIES")
public class Currency {
    @Id
    @Column(name = "currency_id")
    private String id;
    @Column(name = "currency_name")
    private String title;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "currency1")
    private Set<Organization> currency1List = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "currency2")
    private Set<Organization> currency2List = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "currency3")
    private Set<Organization> currency3List = new HashSet<>();

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

    public Set<Organization> getCurrency1List() {
        return currency1List;
    }

    public void setCurrency1List(Set<Organization> currency1List) {
        this.currency1List = currency1List;
    }

    public Set<Organization> getCurrency2List() {
        return currency2List;
    }

    public void setCurrency2List(Set<Organization> currency2List) {
        this.currency2List = currency2List;
    }

    public Set<Organization> getCurrency3List() {
        return currency3List;
    }

    public void setCurrency3List(Set<Organization> currency3List) {
        this.currency3List = currency3List;
    }
}

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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "currencyId")
    private Set<ActualCurrencyRate> currencyList = new HashSet<>();

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

    public Set<ActualCurrencyRate> getCurrencyList() {
        return currencyList;
    }

    public void setCurrencyList(Set<ActualCurrencyRate> currencyList) {
        this.currencyList = currencyList;
    }
}

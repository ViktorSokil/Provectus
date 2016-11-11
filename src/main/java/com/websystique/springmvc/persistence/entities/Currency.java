package com.websystique.springmvc.persistence.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CURRENCIES")
public class Currency {
    @Id
    @Column(name = "currency_id")
    private String id;
    @Column(name = "currency_name")
    private String title;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "currencyId")
    private List<ActualCurrencyRate> currencyList = new ArrayList<>();

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

    public List<ActualCurrencyRate> getCurrencyList() {
        return currencyList;
    }

    public void setCurrencyList(List<ActualCurrencyRate> currencyList) {
        this.currencyList = currencyList;
    }
}

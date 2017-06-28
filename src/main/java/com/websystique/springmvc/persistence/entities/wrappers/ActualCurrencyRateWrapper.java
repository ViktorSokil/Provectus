package com.websystique.springmvc.persistence.entities.wrappers;


import com.websystique.springmvc.utils.DateUtils;

import java.util.Date;

public class ActualCurrencyRateWrapper {
    private String currencyId;
    private Double buyRate;
    private Double ascRate;
    private String date;

    public ActualCurrencyRateWrapper() {}

    public ActualCurrencyRateWrapper(String currencyId, Double buyRate, Double ascRate, Date date) {
        this.currencyId = currencyId;
        this.buyRate = buyRate;
        this.ascRate = ascRate;
        this.date =  DateUtils.formatDate(date);
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public Double getBuyRate() {
        return buyRate;
    }

    public void setBuyRate(Double buyRate) {
        this.buyRate = buyRate;
    }

    public Double getAscRate() {
        return ascRate;
    }

    public void setAscRate(Double ascRate) {
        this.ascRate = ascRate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

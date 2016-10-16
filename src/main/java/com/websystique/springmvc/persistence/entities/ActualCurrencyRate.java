package com.websystique.springmvc.persistence.entities;

import javax.persistence.*;

@Entity
@Table (name = "actual_currency_rate")
public class ActualCurrencyRate {

    @Id
    @Column (name = "record_id")
    @GeneratedValue (strategy = GenerationType.AUTO, generator = "rat_seqgen")
    @SequenceGenerator(name = "rat_seqgen", sequenceName = "actual_currency_rate_seq")
    private Long recordId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_from_org")
    private Organization idFromOrg;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "currency_id")
    private Currency currencyId;

    @Column(name = "buy_rate")
    private Double buyRate;

    @Column(name = "asc_rate")
    private Double ascRate;

    public ActualCurrencyRate(){}

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public Organization getIdFromOrg() {
        return idFromOrg;
    }

    public void setIdFromOrg(Organization idFromOrg) {
        this.idFromOrg = idFromOrg;
    }

    public Currency getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Currency currencyId) {
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
}

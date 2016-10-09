package com.websystique.springmvc.utils.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement (name = "c")
public class CurrencyXmlElement {
    @XmlAttribute(name = "id")
    private String id;
    @XmlAttribute(name = "title")
    private String title;
    @XmlAttribute(name = "br")
    private Double buyRate;
    @XmlAttribute(name = "ar")
    private Double askRate;

    public CurrencyXmlElement(){}

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

    public Double getBuyRate() {
        return buyRate;
    }

    public void setBuyRate(Double buyRate) {
        this.buyRate = buyRate;
    }

    public Double getAskRate() {
        return askRate;
    }

    public void setAskRate(Double askRate) {
        this.askRate = askRate;
    }
}

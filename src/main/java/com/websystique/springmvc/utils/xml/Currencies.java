package com.websystique.springmvc.utils.xml;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "currencies")
public class Currencies {
    @XmlElement(name = "c")
    private List<Currency> currencies=new ArrayList<Currency>();

    public Currencies (){}

    public List<Currency> getCurrencies() {
        return currencies;
    }
    public void setCurrencies(List<Currency> currencies) {
        this.currencies = currencies;
    }
}

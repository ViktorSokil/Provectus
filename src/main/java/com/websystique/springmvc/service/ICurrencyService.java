package com.websystique.springmvc.service;

import com.websystique.springmvc.utils.xml.CurrencyXmlElement;

import java.util.List;


public interface ICurrencyService {
    void saveCurrency (List<CurrencyXmlElement> currency);
}

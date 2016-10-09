package com.websystique.springmvc.service.impl;

import com.websystique.springmvc.dao.CurrencyDao;
import com.websystique.springmvc.persistence.entities.Currency;
import com.websystique.springmvc.service.CurrencyService;
import com.websystique.springmvc.utils.EntityUtils;
import com.websystique.springmvc.utils.xml.CurrencyXmlElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyServiceImpl implements CurrencyService {

    @Autowired
    private CurrencyDao currencyDAO;

    @Override
    public void saveCurrency(List<CurrencyXmlElement> currencyElements) {
        for (CurrencyXmlElement currencyElement: currencyElements){
            Currency currency = EntityUtils.createAndReturnCurrencyEntity(currencyElement);
            currencyDAO.saveCurrency(currency);
        }
    }
}

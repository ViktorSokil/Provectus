package com.websystique.springmvc.service.impl;

import com.websystique.springmvc.dao.ICurrencyDao;
import com.websystique.springmvc.persistence.entities.Currency;
import com.websystique.springmvc.service.ICurrencyService;
import com.websystique.springmvc.utils.EntityUtils;
import com.websystique.springmvc.utils.xml.CurrencyXmlElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyServiceImpl implements ICurrencyService {

    @Autowired
    private ICurrencyDao currencyDAO;

    @Override
    public void saveCurrency(List<CurrencyXmlElement> currencyElements) {
        for (CurrencyXmlElement currencyElement: currencyElements){
            Currency currency = EntityUtils.createAndReturnCurrencyEntity(currencyElement);
            currencyDAO.saveCurrency(currency);
        }
    }
}

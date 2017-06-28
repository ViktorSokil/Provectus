package com.websystique.springmvc.controller;

import com.websystique.springmvc.persistence.entities.wrappers.ActualCurrencyRateWrapper;
import com.websystique.springmvc.service.IActualCurrencyRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ActualCurrencyRateController {

    @Autowired
    private IActualCurrencyRateService actualCurrencyRateService;

    @RequestMapping(value = "/actualCurrencyRates/", method = RequestMethod.GET)
    public ResponseEntity<List<ActualCurrencyRateWrapper>> listAllActualCurrencyRate() {
        List<ActualCurrencyRateWrapper> actualCurrencyRates = actualCurrencyRateService.findAll();
        if(actualCurrencyRates.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<>(actualCurrencyRates, HttpStatus.OK);
    }

    @RequestMapping(value = "/actualCurrencyRates1/", method = RequestMethod.GET)
    public ResponseEntity<List<ActualCurrencyRateWrapper>> listAvgActualCurrencyRateCharts() {
        List<ActualCurrencyRateWrapper> actualCurrencyRates1 = actualCurrencyRateService.findAvg();
        if(actualCurrencyRates1.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<>(actualCurrencyRates1, HttpStatus.OK);
    }
}

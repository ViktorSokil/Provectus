package com.websystique.springmvc.controller;

import com.websystique.springmvc.configuration.HelloWorldInitializer;
import com.websystique.springmvc.persistence.entities.wrappers.ActualCurrencyRateWrapper;
import com.websystique.springmvc.service.IActualCurrencyRateService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@ContextConfiguration(classes = {HelloWorldInitializer.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class ActualCurrencyRateControllerTest {

    @Mock
    private IActualCurrencyRateService actualCurrencyRateService;

    @InjectMocks
    private ActualCurrencyRateController actualCurrencyRateController;

    public MockMvc mockMvc;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(actualCurrencyRateController).build();
    }

    @Test
    public void listAllActualCurrencyRateTest(){
        actualCurrencyRateController.listAllActualCurrencyRate();
        verify(actualCurrencyRateService).findAll();
        List<ActualCurrencyRateWrapper> actualCurrencyRateWrappers = new ArrayList<>();
        when(actualCurrencyRateService.findAll()).thenReturn(actualCurrencyRateWrappers);
        ResponseEntity<List<ActualCurrencyRateWrapper>> actual = actualCurrencyRateController.listAllActualCurrencyRate();
        assertEquals(HttpStatus.NO_CONTENT, actual.getStatusCode());

        actualCurrencyRateWrappers.add(new ActualCurrencyRateWrapper());
        actual = actualCurrencyRateController.listAllActualCurrencyRate();
        assertEquals(HttpStatus.OK, actual.getStatusCode());
    }

    @Test
    public void listAvgActualCurrencyRateChartsTest(){
        actualCurrencyRateController.listAvgActualCurrencyRateCharts();
        verify(actualCurrencyRateService).findAvg();
        List<ActualCurrencyRateWrapper> actualCurrencyRateWrappers = new ArrayList<>();
        when(actualCurrencyRateService.findAvg()).thenReturn(actualCurrencyRateWrappers);
        ResponseEntity<List<ActualCurrencyRateWrapper>> actual = actualCurrencyRateController.listAvgActualCurrencyRateCharts();
        assertEquals(HttpStatus.NO_CONTENT, actual.getStatusCode());

        actualCurrencyRateWrappers.add(new ActualCurrencyRateWrapper());
        actual = actualCurrencyRateController.listAvgActualCurrencyRateCharts();
        assertEquals(HttpStatus.OK, actual.getStatusCode());
    }
}

package com.websystique.springmvc.service;


import com.websystique.springmvc.persistence.entities.JobState;
import com.websystique.springmvc.service.impl.DataUpdateServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Calendar;
import java.util.Date;

import static com.websystique.springmvc.utils.enums.JobStateEnum.DONE;
import static com.websystique.springmvc.utils.enums.JobStateEnum.FAILED;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class DataUpdateServiceTest {

    @Mock
    private ICityService cityService;

    @Mock
    private IRegionService regionService;

    @Mock
    private ICurrencyService currencyService;

    @Mock
    private IOrgTypeService orgTypeService;

    @Mock
    private IJobStateService jobStateService;

    @Mock
    private IOrganizationService organizationService;

    @InjectMocks
    private IDataUpdateService dataUpdateService=new DataUpdateServiceImpl();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        }

    @Test
    public void updateDataTest() throws Exception {

        JobState jobState = new JobState();
        when(jobStateService.getJobStateById(1L)).thenReturn(jobState);
        boolean actual = dataUpdateService.updateData();
        assertTrue(actual);
        verify(jobStateService).getJobStateById(1L);

        Date date=new Date();
        jobState.setRefreshDate(date);
        jobState.setJobState(FAILED);
        actual = dataUpdateService.updateData();
        assertTrue(actual);

        jobState.setJobState(DONE);
        actual = dataUpdateService.updateData();
        assertFalse(actual);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, -1);

        jobState.setRefreshDate(calendar.getTime());
        actual = dataUpdateService.updateData();
        assertTrue(actual);
    }
}

package com.websystique.springmvc.service.impl;

import com.websystique.springmvc.persistence.entities.JobState;
import com.websystique.springmvc.service.*;
import com.websystique.springmvc.utils.DateUtils;
import com.websystique.springmvc.utils.enums.JobStateEnum;
import com.websystique.springmvc.utils.xml.CurrencyParsingUtil;
import com.websystique.springmvc.utils.xml.Source;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

@EnableScheduling
@Service
public class DataUpdateServiceImpl implements DataUpdateService {

    @Autowired
    private CityService cityService;

    @Autowired
    private RegionService regionService;

    @Autowired
    private CurrencyService currencyService;

    @Autowired
    private OrgTypeService orgTypeService;

    @Autowired
    private JobStateService jobStateService;

    @Autowired
    private OrganizationService organizationService;

    private final Logger logger = LoggerFactory.getLogger(DataUpdateServiceImpl.class);

    @Override
    @Scheduled(cron = "0 0 * * * MON-FRI")
    public void updateData(){
        logger.debug("DataUpdate job run");
        JobState job=jobStateService.getJobStateById(1L);
        if(job.getRefreshDate()!=null && job.getJobState()!=null){
            int lastUpdateDayOfMonth = DateUtils.getDayOfMonth(job.getRefreshDate());
            int currentDayOfMonth =  DateUtils.getDayOfMonth(new Date());

            if (lastUpdateDayOfMonth!=currentDayOfMonth || job.getJobState()!=JobStateEnum.DONE){
                doUpdate(job);
            }
        } else {
            doUpdate(job);
        }
    }

    private void doUpdate(JobState job){
        Source source= CurrencyParsingUtil.parse();
        if(source!=null){
            logger.debug("Data updating......");
            cityService.saveCity(source.getCities().getCities());
            regionService.saveRegion(source.getRegions().getRegions());
            currencyService.saveCurrency(source.getCurrencies().getCurrencies());
            orgTypeService.saveOrgType(source.getOrgTypes().getOrgTypes());
            organizationService.saveOrganization(source);

            job.setJobState(JobStateEnum.DONE);
            job.setRefreshDate(new Date());
            jobStateService.updateJobSate(job);
            logger.debug("DataUpdate job is completed");
        }
    }
}

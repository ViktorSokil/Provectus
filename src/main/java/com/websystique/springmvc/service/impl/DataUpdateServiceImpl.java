package com.websystique.springmvc.service.impl;

import com.websystique.springmvc.persistence.entities.JobState;
import com.websystique.springmvc.service.CityService;
import com.websystique.springmvc.service.DataUpdateService;
import com.websystique.springmvc.service.JobStateService;
import com.websystique.springmvc.utils.DateUtils;
import com.websystique.springmvc.utils.enums.JobStateEnum;
import com.websystique.springmvc.utils.xml.CurrencyParsingUtil;
import com.websystique.springmvc.utils.xml.Source;
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
    private JobStateService jobStateService;

    @Override
    @Scheduled(cron = "0 0 * * * MON-FRI")
    public void updateData(){
        System.out.println("DataUpdate job run");
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
            System.out.println("Data updating......");
            cityService.saveCity(source.getCities().getCities());
            job.setJobState(JobStateEnum.DONE);
            job.setRefreshDate(new Date());
            jobStateService.updateJobSate(job);
        }
    }
}

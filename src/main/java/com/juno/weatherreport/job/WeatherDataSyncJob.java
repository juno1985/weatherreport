package com.juno.weatherreport.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.juno.weatherreport.service.RemoteWeatherDataService;

public class WeatherDataSyncJob extends QuartzJobBean {
	
	private final static Logger logger = LoggerFactory.getLogger(WeatherDataSyncJob.class);
	
	
	@Autowired
	private RemoteWeatherDataService remoteWeatherDataService;

	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		
		logger.info("Remote data synchronization start ...");
		
		remoteWeatherDataService.syncForcastWeatherData();
		
		logger.info("Remote data synchronization end. ");

	}

}

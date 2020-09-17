package com.juno.weatherreport;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.juno.weatherreport.model.ForcastWeatherResponse;
import com.juno.weatherreport.model.ListDetails;
import com.juno.weatherreport.service.RemoteWeatherDataService;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {WeatherreportApplication.class, DataSourceAutoConfiguration.class})

class WeatherreportApplicationTests {


	@Autowired
	private RemoteWeatherDataService remoteWeatherDataService;
	
	
	@Test
	public void testGetWeatherResponseByCityName() {
		
		ForcastWeatherResponse forcastWeatherResponse = (ForcastWeatherResponse) remoteWeatherDataService.getForcastDataByCityName("Dalian");
	
			
		List<ListDetails> list = forcastWeatherResponse.getList();
		
		for(ListDetails ld : list) {
			System.out.println(ld.getDt_txt().toString());
		}
	}
	
	

}

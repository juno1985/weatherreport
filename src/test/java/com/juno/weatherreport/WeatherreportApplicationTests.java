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

import com.juno.weatherreport.mapper.CityMapper;
import com.juno.weatherreport.mapper.ForcastWeatherMapper;
import com.juno.weatherreport.model.City;
import com.juno.weatherreport.model.ForcastWeatherResponse;
import com.juno.weatherreport.model.ForcastWeatherWrapper;
import com.juno.weatherreport.model.ListDetails;
import com.juno.weatherreport.service.LocalWeatherDataService;
import com.juno.weatherreport.service.RemoteWeatherDataService;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {WeatherreportApplication.class, DataSourceAutoConfiguration.class})

class WeatherreportApplicationTests {


	@Autowired
	private RemoteWeatherDataService remoteWeatherDataService;
	
	@Autowired
	private LocalWeatherDataService localWeatherDataService;
	
	@Autowired
	private ForcastWeatherMapper forcastWeatherMapper;
	@Autowired
	private CityMapper cityMapper;
	
	@Test
	public void testGetWeatherResponseByCityName() {
		
		ForcastWeatherResponse forcastWeatherResponse = (ForcastWeatherResponse) remoteWeatherDataService.getForcastDataByCityName("Dalian");
	
			
		List<ListDetails> list = forcastWeatherResponse.getList();
		
		for(ListDetails ld : list) {
			System.out.println(ld.getDt_txt().toString());
		}
	}
	
	@Test
	public void testGetCityByCityName() {
		List<City> city = cityMapper.getCityByCityName("Dalian");
		System.out.println(city);
		
	}
	
	@Test
	public void testGetAllCities() {
		List<City> city = cityMapper.getCityByCityName(null);
		System.out.println(city);
	}
	
	@Test
	public void testGetForcastWeatherByCityId() {
		ForcastWeatherWrapper wrapper = forcastWeatherMapper.getForcastWeatherByCityId("1");
		
		System.out.println(wrapper.getList().toString());
	}
	
	@Test
	public  void testLocalWeatherDataService() {
		System.out.println(localWeatherDataService.getCityByCityName("Dalian"));
		System.out.println(localWeatherDataService.getAllCities());
	}
	
	@Test
	public void testSyncForcastWeatherData() {
		remoteWeatherDataService.syncForcastWeatherData();
	}

}

package com.juno.weatherreport.service;

import java.util.List;

import com.juno.weatherreport.model.City;
import com.juno.weatherreport.model.ForcastWeatherWrapper;

public interface LocalWeatherDataService {
	
	ForcastWeatherWrapper getForcastWeatherByCityName(String cityName);
	
	City getCityByCityName(String cityName);
	
	List<City> getAllCities();

}

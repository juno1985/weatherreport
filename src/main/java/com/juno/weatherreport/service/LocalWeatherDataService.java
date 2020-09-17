package com.juno.weatherreport.service;

import com.juno.weatherreport.model.ForcastWeatherWrapper;

public interface LocalWeatherDataService {
	
	ForcastWeatherWrapper getForcastWeatherByCityName(String cityName);

}

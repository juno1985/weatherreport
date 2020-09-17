package com.juno.weatherreport.service;

import com.juno.weatherreport.model.ForcastWeatherResponse;

public interface RemoteWeatherDataService {
	
	ForcastWeatherResponse getForcastDataByCityName(String cityName);
	
//	CurrentWeatherResponse getCurrentDataByCityName1(String cityName);
	
//	String getJsonFormatOfWeatherResponse(WeatherResponse weatherRersponse);

}

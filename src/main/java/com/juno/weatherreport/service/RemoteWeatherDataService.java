package com.juno.weatherreport.service;

import com.juno.weatherreport.model.WeatherResponse;

public interface RemoteWeatherDataService {
	
	WeatherResponse getForcastDataByCityName(String cityName);
	
//	CurrentWeatherResponse getCurrentDataByCityName1(String cityName);
	
//	String getJsonFormatOfWeatherResponse(WeatherResponse weatherRersponse);

}

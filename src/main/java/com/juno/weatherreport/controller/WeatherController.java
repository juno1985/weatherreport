package com.juno.weatherreport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juno.weatherreport.model.ForcastWeatherWrapper;
import com.juno.weatherreport.service.LocalWeatherDataService;


@RestController
@RequestMapping("/weather")
public class WeatherController {
	
	private static final Integer latestDays = 3;

	@Autowired
	private LocalWeatherDataService localWeatherDataService;
	
	@GetMapping("/cityName/{cityName}")
	public ForcastWeatherWrapper getForcastWeatherByCityName(@PathVariable("cityName") String cityName) {
		return localWeatherDataService.getForcastWeatherByCityName(cityName);
	}
	@GetMapping("/cityName/{cityName}/3days")
	public ForcastWeatherWrapper getLatestDaysForcastWeatherByCityName(@PathVariable("cityName") String cityName) {
		return localWeatherDataService.getLatestDaysForcastWeatherByCityName(cityName, latestDays);
	}
}

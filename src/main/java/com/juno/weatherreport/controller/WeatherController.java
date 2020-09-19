package com.juno.weatherreport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.juno.weatherreport.model.City;
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
	
	@GetMapping("/report/cityName/{cityName}")
	public ModelAndView getForcastWeatherReportPage(@PathVariable("cityName")String cityName, Model model) {
		
		ForcastWeatherWrapper forcastWeatherWrapper = localWeatherDataService.getForcastWeatherByCityName(cityName);
		model.addAttribute("forcastWrapper", forcastWeatherWrapper);
		model.addAttribute("cityName", cityName);
		List<City> cityList = localWeatherDataService.getAllCities();
		model.addAttribute("cityList", cityList);
		return new ModelAndView("weather/report", "reportModel", model);
	}
}

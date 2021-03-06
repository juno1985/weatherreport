package com.juno.weatherreport.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juno.weatherreport.mapper.CityMapper;
import com.juno.weatherreport.mapper.ForcastWeatherMapper;
import com.juno.weatherreport.model.City;
import com.juno.weatherreport.model.ForcastWeatherWrapper;
@Service
public class LocalWeatherDataServiceImpl implements LocalWeatherDataService {
	
	
	@Autowired
	private CityMapper cityMapper;
	@Autowired
	private ForcastWeatherMapper forcastWeatherMapper;

	@Override
	public ForcastWeatherWrapper getForcastWeatherByCityName(String cityName) {
		
		return getLatestDaysForcastWeatherByCityName(cityName, null);
	}
	
	@Override
	public ForcastWeatherWrapper getLatestDaysForcastWeatherByCityName(String cityName, Integer latestDays) {
		
		City city = getCityByCityName(cityName);
		
		ForcastWeatherWrapper forcastWeatherWrapper = forcastWeatherMapper.getForcastWeatherByCityId(String.valueOf(city.getId()), latestDays);
		
		return forcastWeatherWrapper;
	}
	

	@Override
	public City getCityByCityName(String cityName) {
		List<City> list = cityMapper.getCityByCityName(cityName);
		if(!list.isEmpty()) return list.get(0);
		return null;
	}

	@Override
	public List<City> getAllCities() {
		List<City> list = cityMapper.getCityByCityName(null);
		if(!list.isEmpty()) return list;
		return null;
	}



	

}

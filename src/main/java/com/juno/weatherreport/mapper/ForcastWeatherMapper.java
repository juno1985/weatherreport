package com.juno.weatherreport.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.juno.weatherreport.model.City;
import com.juno.weatherreport.model.ForcastWeatherWrapper;
@Mapper
@Component
public interface ForcastWeatherMapper {

	City getCityByCityName(@Param("cityName")String cityName);
	
	ForcastWeatherWrapper getForcastWeatherByCityId(@Param("id")String id);
}

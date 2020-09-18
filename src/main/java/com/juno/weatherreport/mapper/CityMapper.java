package com.juno.weatherreport.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.juno.weatherreport.model.City;

public interface CityMapper {
	List<City> getCityByCityName(@Param("cityName")String cityName);

}

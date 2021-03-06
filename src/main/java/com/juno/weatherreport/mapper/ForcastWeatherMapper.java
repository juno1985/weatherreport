package com.juno.weatherreport.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import com.juno.weatherreport.model.ForcastData;
import com.juno.weatherreport.model.ForcastWeatherWrapper;
@Mapper
@Component
public interface ForcastWeatherMapper {

	
	ForcastWeatherWrapper getForcastWeatherByCityId(@Param("id")String id, @Param("latestDay")Integer latestDay);
	
	
	Long syncForcastWeatherData(List<ForcastData> list);
	
	Long truncateData(@Param("tableName")String tableName);
}

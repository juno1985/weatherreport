package com.juno.weatherreport.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.juno.weatherreport.model.ForcastWeatherResponse;
import com.juno.weatherreport.model.ListDetails;
import com.juno.weatherreport.model.WeatherResponse;
@Service
public class RemoteWeatherDataServiceImpl implements RemoteWeatherDataService {

	private static final String WEATHER_URI = "https://openweathermap.org/data/2.5/";
	private static final String APP_ID = "&appid=439d4b804bc8187953eb36d2a8c26a02";
	private static final String FORCAST_WEATHER = "forecast";
	private static final String CURRENT_WEATHER = "weather";

	@Autowired
	private RestTemplate restTemplate;
	
	private String constructURI(String param, String type) {
		
		if(StringUtils.isEmpty(type)) 
			throw new RuntimeException("Weather type must be specified. Forcase or Current ?");
		
		StringBuilder sb = new StringBuilder();
		sb.append(WEATHER_URI);
		
		if(type.equals(FORCAST_WEATHER))
			sb.append(FORCAST_WEATHER + "?q=");
		else {
			sb.append(CURRENT_WEATHER + "?q=");
		}
		sb.append(param);
		sb.append(APP_ID);
		return sb.toString();
	}
	
	@Override
	public WeatherResponse getForcastDataByCityName(String cityName) {
		String uri = constructURI(cityName, FORCAST_WEATHER);
		return doGetWeather(uri, FORCAST_WEATHER);
	}
	
	private WeatherResponse doGetWeather(String uri, String type) {
		ResponseEntity<String> resStr = restTemplate.getForEntity(uri, String.class);
		
		WeatherResponse weatherResponse = null;
		
		if(resStr.getStatusCodeValue() == 200) {
			String strBody = resStr.getBody();
			ObjectMapper mapper = new ObjectMapper();
			if(StringUtils.isEmpty(type)) 
				throw new RuntimeException("Weather type must be specified. Forcase or Current ?");
			if(type.equals(FORCAST_WEATHER)) {
				try {
					weatherResponse = mapper.readValue(strBody, ForcastWeatherResponse.class);
				
				} catch (JsonMappingException e) {
					e.printStackTrace();
				} catch (JsonProcessingException e) {
					e.printStackTrace();
				}
			}
			
			
		}
		
		return weatherResponse;
	}

}

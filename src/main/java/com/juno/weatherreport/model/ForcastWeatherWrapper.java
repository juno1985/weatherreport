package com.juno.weatherreport.model;

import java.util.List;

public class ForcastWeatherWrapper {
	
	private City city;
	private List<ForcastData> list;
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public List<ForcastData> getList() {
		return list;
	}
	public void setList(List<ForcastData> list) {
		this.list = list;
	}
	

}

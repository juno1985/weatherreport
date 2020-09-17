package com.juno.weatherreport.model;

import java.util.List;

public class ForcastWeatherResponse extends WeatherResponse {


	private static final long serialVersionUID = 1L;

	private String message;
	
	private City city;
	
	private Integer cnt;
	
	private List<ListDetails> list;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Integer getCnt() {
		return cnt;
	}

	public void setCnt(Integer cnt) {
		this.cnt = cnt;
	}

	public List<ListDetails> getList() {
		return list;
	}

	public void setList(List<ListDetails> list) {
		this.list = list;
	}
	
	
}

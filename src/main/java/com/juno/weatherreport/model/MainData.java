package com.juno.weatherreport.model;

import java.io.Serializable;

public class MainData implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private Float temp;
	private Float feels_like;
	private Float temp_min;
	private Float temp_max;
	private Float pressure;
	private Float sea_level;
	private Float grnd_level;
	private String humidity;
	private String temp_kf;
	public Float getTemp() {
		return temp;
	}
	public void setTemp(Float temp) {
		this.temp = temp;
	}
	public Float getFeels_like() {
		return feels_like;
	}
	public void setFeels_like(Float feels_like) {
		this.feels_like = feels_like;
	}
	public Float getTemp_min() {
		return temp_min;
	}
	public void setTemp_min(Float temp_min) {
		this.temp_min = temp_min;
	}
	public Float getTemp_max() {
		return temp_max;
	}
	public void setTemp_max(Float temp_max) {
		this.temp_max = temp_max;
	}
	public Float getPressure() {
		return pressure;
	}
	public void setPressure(Float pressure) {
		this.pressure = pressure;
	}
	public Float getSea_level() {
		return sea_level;
	}
	public void setSea_level(Float sea_level) {
		this.sea_level = sea_level;
	}
	public Float getGrnd_level() {
		return grnd_level;
	}
	public void setGrnd_level(Float grnd_level) {
		this.grnd_level = grnd_level;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getTemp_kf() {
		return temp_kf;
	}
	public void setTemp_kf(String temp_kf) {
		this.temp_kf = temp_kf;
	}
	
	

}

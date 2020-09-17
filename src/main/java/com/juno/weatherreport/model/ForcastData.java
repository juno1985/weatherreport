package com.juno.weatherreport.model;

public class ForcastData {
	
	private Float temp;
	private Float feels_like;
	private Float temp_min;
	private Float temp_max;
	private String description;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "ForcastData [temp=" + temp + ", feels_like=" + feels_like + ", temp_min=" + temp_min + ", temp_max="
				+ temp_max + ", description=" + description + "]";
	}
	
	
}

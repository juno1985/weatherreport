package com.juno.weatherreport.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ListDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	private String dt;
	private MainData main;
	private Clouds clouds;
	private Wind wind;
	private String visibility;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date dt_txt;
	private List<Weather> weather;
	private String pop;
	private Sys sys;
	private Rain rain;
	public String getDt() {
		return dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}
	public MainData getMain() {
		return main;
	}
	public void setMain(MainData main) {
		this.main = main;
	}
	public Clouds getClouds() {
		return clouds;
	}
	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}
	public Wind getWind() {
		return wind;
	}
	public void setWind(Wind wind) {
		this.wind = wind;
	}
	public String getVisibility() {
		return visibility;
	}
	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}
	
	public Date getDt_txt() {
		return dt_txt;
	}
	public void setDt_txt(Date dt_txt) {
		this.dt_txt = dt_txt;
	}
	public List<Weather> getWeather() {
		return weather;
	}
	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}
	public String getPop() {
		return pop;
	}
	public void setPop(String pop) {
		this.pop = pop;
	}
	public Sys getSys() {
		return sys;
	}
	public void setSys(Sys sys) {
		this.sys = sys;
	}
	public Rain getRain() {
		return rain;
	}
	public void setRain(Rain rain) {
		this.rain = rain;
	}
	
}

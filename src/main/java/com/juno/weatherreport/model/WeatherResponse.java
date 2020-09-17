package com.juno.weatherreport.model;

import java.io.Serializable;

public abstract class WeatherResponse implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	String cod;

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}
	
	

}

package com.juno.weatherreport.model;

import java.io.Serializable;

public class Sys implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String pod;

	public String getPod() {
		return pod;
	}

	public void setPod(String pod) {
		this.pod = pod;
	}
	
	

}

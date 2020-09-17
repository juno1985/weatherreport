package com.juno.weatherreport.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAlias;

public class Rain implements Serializable {


	private static final long serialVersionUID = 1L;
	@JsonAlias("3h")
	private String _3h;

	public String get_3h() {
		return _3h;
	}

	public void set_3h(String _3h) {
		this._3h = _3h;
	}
	
	
	
}

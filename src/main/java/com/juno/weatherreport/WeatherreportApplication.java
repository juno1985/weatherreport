package com.juno.weatherreport;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@MapperScan("com.juno.weatherreport.mapper.UserMapper") 
@SpringBootApplication
public class WeatherreportApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherreportApplication.class, args);
	}

}

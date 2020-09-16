package com.juno.weatherreport;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.juno.weatherreport.service.UserServiceInter;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {WeatherreportApplication.class, DataSourceAutoConfiguration.class})

class WeatherreportApplicationTests {

	@Autowired
	private UserServiceInter userService;
	
	@Test
	public void testUser() {
		userService.Sel(1);
	}

}

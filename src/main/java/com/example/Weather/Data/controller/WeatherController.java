package com.example.Weather.Data.controller;

import com.example.Weather.Data.Model.Weather;
import com.example.Weather.Data.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {
	@Autowired
	private WeatherService weatherService;
	@GetMapping("/city/{city}")
	public ResponseEntity<Weather> getWeatherForCity(@PathVariable String city) {
		Weather weather = weatherService.getWeatherForCity(city);
		if (weather != null) {
			return ResponseEntity.ok(weather);
		} else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}

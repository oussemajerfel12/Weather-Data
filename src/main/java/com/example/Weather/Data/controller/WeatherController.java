package com.example.Weather.Data.controller;

import com.example.Weather.Data.Model.Weather;
import com.example.Weather.Data.Repository.WeatherRepository;
import com.example.Weather.Data.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/weather", produces = MediaType.APPLICATION_JSON_VALUE)
public class WeatherController {
	@Autowired
	private WeatherService weatherService;

	@Autowired
	private WeatherRepository weatherRepository;

	@RequestMapping(value = "/city/{city}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Weather> getWeatherForCity(@PathVariable String city) {
		Weather weather = weatherService.getWeatherForCity(city);
		if (weather != null) {
			weatherRepository.save(weather);
			return ResponseEntity.ok(weather);
		} else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@GetMapping(path = "/all")
	public ResponseEntity<List<Weather>> getAllWeather() {
		List<Weather> weatherList = weatherRepository.findAll();
		return ResponseEntity.ok(weatherList);
	}

}

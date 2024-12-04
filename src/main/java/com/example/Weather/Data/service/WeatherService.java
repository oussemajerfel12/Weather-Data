package com.example.Weather.Data.service;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.example.Weather.Data.Model.*;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

	private static String API_URL = "https://api.openweathermap.org/data/2.5/weather?q={city}&appid={apiKey}&units=metric";

	@Value("${openweathermap.apiKey}")
	private String apiKey;

	@Autowired
	private RestTemplate restTemplate;

	public Weather getWeatherForCity(String city) {
		String response = restTemplate.getForObject(API_URL, String.class, city, apiKey);
		return convertJsonToWeather(response);
	}

	public Weather convertJsonToWeather(String JsonResponse) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			JsonNode node = objectMapper.readTree(JsonResponse);

			Weather weather = new Weather();
			weather.setCityName(node.get("name").asText());
			weather.setCountryCode(node.get("sys").get("country").asText());
			weather.setDescription(node.get("weather").get(0).get("description").asText());
			weather.setTemperature(node.get("main").get("temp").asText());
			weather.setFeelsLike(node.get("main").get("feels_like").asInt());
			weather.setHumidity(node.get("main").get("humidity").asInt());
			weather.setPressure(node.get("main").get("pressure").asInt());
			weather.setWindSpeed(node.get("wind").get("speed").asInt());
			weather.setIcon(node.get("weather").get(0).get("icon").asText());
			weather.setSunrise(node.get("sys").get("sunrise").asText());
			weather.setSunset(node.get("sys").get("sunset").asText());
			weather.setTimestamp(node.get("dt").asText());

			return weather;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}


	}


}

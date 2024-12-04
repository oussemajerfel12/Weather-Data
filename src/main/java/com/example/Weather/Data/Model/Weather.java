package com.example.Weather.Data.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Weather {
	private String cityName;
	private String countryCode;
	private String description;
	private String temperature;
	private int feelsLike;
	private int humidity;
	private int pressure;
	private int windSpeed;
	private String icon;
	private String sunrise;
	private String sunset;
	private String timestamp;

	@JsonProperty("timestamp")
	public String getTimestamp() {
		return timestamp;
	}

	@JsonProperty("cityName")
	public String getCityName() {
		return cityName;
	}

	@JsonProperty("countryCode")
	public String getCountryCode() {
		return countryCode;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("temperature")
	public String getTemperature() {
		return temperature;
	}

	@JsonProperty("feelsLike")
	public int getFeelsLike() {
		return feelsLike;
	}

	@JsonProperty("humidity")
	public int getHumidity() {
		return humidity;
	}

	@JsonProperty("pressure")
	public int getPressure() {
		return pressure;
	}

	@JsonProperty("windSpeed")
	public int getWindSpeed() {
		return windSpeed;
	}

	@JsonProperty("icon")
	public String getIcon() {
		return icon;
	}

	@JsonProperty("sunrise")
	public String getSunrise() {
		return sunrise;
	}

	@JsonProperty("sunset")
	public String getSunset() {
		return sunset;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature.split("\\.")[0] + " " + "C°";
	}

	public void setFeelsLike(int feelsLike) {
		this.feelsLike = feelsLike;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
	}

	public void setWindSpeed(int windSpeed) {
		this.windSpeed = windSpeed;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public void setSunrise(String sunrise) {

		Date date = new Date(Long.parseLong(sunrise) * 1000);
		this.sunrise = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(date);
	}

	public void setSunset(String sunset) {
		Date date = new Date(Long.parseLong(sunset) * 1000);
		this.sunset = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(date);
	}

	public void setTimestamp(String timestamp) {
		Date date = new Date(Long.parseLong(timestamp) * 1000);
		this.timestamp = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(date);
	}
}

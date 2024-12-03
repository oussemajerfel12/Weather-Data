package com.example.Weather.Data.Model;

public class Weather {
    private String cityName;
    private String countryCode;
    private String description;
    private double temperature;
    private double feelsLike;
    private double humidity;
    private double pressure;
    private double windSpeed;
    private String icon;
    private long sunrise;
    private long sunset;
    private long timestamp;

    public Weather(String cityName, String countryCode, String description, double temperature, double feelsLike, double humidity, double pressure, double windSpeed, String icon, long sunrise, long sunset, long timestamp) {
        this.cityName = cityName;
        this.countryCode = countryCode;
        this.description = description;
        this.temperature = temperature;
        this.feelsLike = feelsLike;
        this.humidity = humidity;
        this.pressure = pressure;
        this.windSpeed = windSpeed;
        this.icon = icon;
        this.sunrise = sunrise;
        this.sunset = sunset;
        this.timestamp = timestamp;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getDescription() {
        return description;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getFeelsLike() {
        return feelsLike;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public String getIcon() {
        return icon;
    }

    public long getSunrise() {
        return sunrise;
    }

    public long getSunset() {
        return sunset;
    }

    public long getTimestamp() {
        return timestamp;
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

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setFeelsLike(double feelsLike) {
        this.feelsLike = feelsLike;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setSunrise(long sunrise) {
        this.sunrise = sunrise;
    }

    public void setSunset(long sunset) {
        this.sunset = sunset;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}

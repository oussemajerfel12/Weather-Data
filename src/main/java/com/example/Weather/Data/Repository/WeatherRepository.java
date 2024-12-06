package com.example.Weather.Data.Repository;

import com.example.Weather.Data.Model.Weather;
import org.springframework.data.jpa.repository.JpaRepository;


public interface WeatherRepository extends JpaRepository<Weather,Integer> {

}
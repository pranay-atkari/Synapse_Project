package com.Synapse.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Synapse.model.ForecastData;

public interface ForecastDataRepository  extends JpaRepository<ForecastData, Long>
{
	 List<ForecastData> findByCountry(String country);
}

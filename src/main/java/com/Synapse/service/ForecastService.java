package com.Synapse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Synapse.model.ForecastData;
import com.Synapse.repository.ForecastDataRepository;

@Service
public class ForecastService 
{
	 @Autowired
	    private ForecastDataRepository repository;

	    public List<ForecastData> getDataByCountry(String country) {
	        return repository.findByCountry(country);
	    }

	    public void saveData(ForecastData data) {
	        repository.save(data);
	    }
}

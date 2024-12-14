package com.Synapse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Synapse.model.ForecastData;
import com.Synapse.service.ForecastService;

@RestController
@RequestMapping("/api/forecast")
public class ForecastController 
{
 
	 @Autowired
	    private ForecastService service;

	    @GetMapping("/{country}")
	    public List<ForecastData> getForecastByCountry(@PathVariable String country) {
	        return service.getDataByCountry(country);
	    }
	
	
	
}

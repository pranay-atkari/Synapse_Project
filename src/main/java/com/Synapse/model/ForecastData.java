package com.Synapse.model;

import java.util.Map;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class ForecastData 
{
      
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String country;
	    private String sku;
	    private Double r2;
	    private Double mae;
	    private Double mse;
	    private Double mape;
	    
	    @ElementCollection
	    private Map<String, Double> monthlyForecast; 
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getSku() {
			return sku;
		}
		public void setSku(String sku) {
			this.sku = sku;
		}
		public Double getR2() {
			return r2;
		}
		public void setR2(Double r2) {
			this.r2 = r2;
		}
		public Double getMae() {
			return mae;
		}
		public void setMae(Double mae) {
			this.mae = mae;
		}
		public Double getMse() {
			return mse;
		}
		public void setMse(Double mse) {
			this.mse = mse;
		}
		public Double getMape() {
			return mape;
		}
		public void setMape(Double mape) {
			this.mape = mape;
		}

	
}

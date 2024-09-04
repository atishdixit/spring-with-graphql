package com.ext.gq.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ext.gq.client.model.Country;
import com.ext.gq.client.service.CountryService;

import reactor.core.publisher.Mono;

@RestController
public class RequestController {

	
	@Autowired
	private CountryService countryService;
	
	@GetMapping("/countries")
	public Mono<List<Country>> getCountryList(){
		return countryService.getCountries();
	}
}

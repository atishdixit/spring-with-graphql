package com.ext.gq.client.service;

import java.util.List;

import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.ext.gq.client.model.ApplicationConstant;
import com.ext.gq.client.model.Country;

import reactor.core.publisher.Mono;

@Service
public class CountryService {

	private final HttpGraphQlClient graphQlClient;

	public CountryService() {
		WebClient client = WebClient.builder().baseUrl(ApplicationConstant.BASE_URL).build();
		graphQlClient = HttpGraphQlClient.builder(client).build();
	}

	public Mono<List<Country>> getCountries() {
		Mono<List<Country>> countries = graphQlClient.document(ApplicationConstant.QUERY)
				.retrieve(ApplicationConstant.PATH).toEntityList(Country.class);

		return countries;
	}
}
package com.ext.gq.client.model;

public class ApplicationConstant {

	public static final String BASE_URL = "https://countries.trevorblades.com";
	public static final String PATH = "countries";
	public static final String QUERY = """
			query {
			    countries {
			      name
			      emoji
			      currency
			      code
			      capital
			    }
			}
			""";

}

package com.stephane.strategy.pattern.examples.client.rest.response.countries;

import lombok.Data;

public @Data class LanguagesItem{
	private String nativeName;
	private String iso6392;
	private String name;
	private String iso6391;
}
package com.stephane.strategy.pattern.examples.client.rest.response;

import lombok.Data;

public @Data class CurrenciesItem{
	private String symbol;
	private String code;
	private String name;
}
package com.stephane.strategy.pattern.examples.client.rest.response.countries;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public @Data
class Response {
	private List<Country> response = new ArrayList<>();
}
package com.stephane.strategy.pattern.examples.client.rest.response.countries;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public @Data
class RegionalBlocsItem {
	private List<String> otherNames = new ArrayList<>();
	private String acronym;
	private String name;
	private List<Object> otherAcronyms = new ArrayList<>();
}
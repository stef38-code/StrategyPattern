package com.stephane.strategy.pattern.examples.client.rest.response;

import java.util.List;
import lombok.Data;

public @Data class RegionalBlocsItem{
	private List<String> otherNames;
	private String acronym;
	private String name;
	private List<Object> otherAcronyms;
}
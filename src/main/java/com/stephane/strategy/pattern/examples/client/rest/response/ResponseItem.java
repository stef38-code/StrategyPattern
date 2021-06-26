package com.stephane.strategy.pattern.examples.client.rest.response;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

public @Data class ResponseItem{
	private int area;
	private String nativeName;
	private String capital;
	private String demonym;
	private String flag;
	private String alpha2Code;
	private List<LanguagesItem> languages;
	private List<String> borders;
	private String subregion;
	private List<String> callingCodes;
	private List<RegionalBlocsItem> regionalBlocs;
	private int gini;
	private int population;
	private String numericCode;
	private String alpha3Code;
	private List<String> topLevelDomain;
	private List<String> timezones;
	private String cioc;
	private Translations translations;
	private String name;
	private List<String> altSpellings = new ArrayList<>();
	private String region;
	private List<Double> latlng= new ArrayList<>();
	private List<CurrenciesItem> currencies= new ArrayList<>();
}
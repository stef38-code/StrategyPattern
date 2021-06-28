package com.stephane.strategy.pattern.examples.client.rest.response;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public @Data
class ResponseItem {
	private int area;
	private String nativeName;
	private String capital;
	private String demonym;
	private String flag;
	private String alpha2Code;
	private List<LanguagesItem> languages = new ArrayList<>();
	private List<String> borders = new ArrayList<>();
	private String subregion;
	private List<String> callingCodes = new ArrayList<>();
	private List<RegionalBlocsItem> regionalBlocs = new ArrayList<>();
	private int gini;
	private int population;
	private String numericCode;
	private String alpha3Code;
	private List<String> topLevelDomain = new ArrayList<>();
	private List<String> timezones = new ArrayList<>();
	private String cioc;
	private Translations translations;
	private String name;
	private List<String> altSpellings = new ArrayList<>();
	private String region;
	private List<Double> latlng = new ArrayList<>();
	private List<CurrenciesItem> currencies = new ArrayList<>();
}
package com.stephane.strategy.pattern.examples.client.rest.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@lombok.Data
public class Name {
    @lombok.Getter(onMethod_ = {@JsonProperty("name")})
    @lombok.Setter(onMethod_ = {@JsonProperty("name")})
    private String name;
    @lombok.Getter(onMethod_ = {@JsonProperty("topLevelDomain")})
    @lombok.Setter(onMethod_ = {@JsonProperty("topLevelDomain")})
    private List<String> topLevelDomain;
    @lombok.Getter(onMethod_ = {@JsonProperty("alpha2Code")})
    @lombok.Setter(onMethod_ = {@JsonProperty("alpha2Code")})
    private String alpha2Code;
    @lombok.Getter(onMethod_ = {@JsonProperty("alpha3Code")})
    @lombok.Setter(onMethod_ = {@JsonProperty("alpha3Code")})
    private String alpha3Code;
    @lombok.Getter(onMethod_ = {@JsonProperty("callingCodes")})
    @lombok.Setter(onMethod_ = {@JsonProperty("callingCodes")})
    private List<String> callingCodes;
    @lombok.Getter(onMethod_ = {@JsonProperty("capital")})
    @lombok.Setter(onMethod_ = {@JsonProperty("capital")})
    private String capital;
    @lombok.Getter(onMethod_ = {@JsonProperty("altSpellings")})
    @lombok.Setter(onMethod_ = {@JsonProperty("altSpellings")})
    private List<String> altSpellings;
    @lombok.Getter(onMethod_ = {@JsonProperty("region")})
    @lombok.Setter(onMethod_ = {@JsonProperty("region")})
    private String region;
    @lombok.Getter(onMethod_ = {@JsonProperty("subregion")})
    @lombok.Setter(onMethod_ = {@JsonProperty("subregion")})
    private String subregion;
    @lombok.Getter(onMethod_ = {@JsonProperty("population")})
    @lombok.Setter(onMethod_ = {@JsonProperty("population")})
    private long population;
    @lombok.Getter(onMethod_ = {@JsonProperty("latlng")})
    @lombok.Setter(onMethod_ = {@JsonProperty("latlng")})
    private List<Long> latlng;
    @lombok.Getter(onMethod_ = {@JsonProperty("demonym")})
    @lombok.Setter(onMethod_ = {@JsonProperty("demonym")})
    private String demonym;
    @lombok.Getter(onMethod_ = {@JsonProperty("area")})
    @lombok.Setter(onMethod_ = {@JsonProperty("area")})
    private long area;
    @lombok.Getter(onMethod_ = {@JsonProperty("gini")})
    @lombok.Setter(onMethod_ = {@JsonProperty("gini")})
    private double gini;
    @lombok.Getter(onMethod_ = {@JsonProperty("timezones")})
    @lombok.Setter(onMethod_ = {@JsonProperty("timezones")})
    private List<String> timezones;
    @lombok.Getter(onMethod_ = {@JsonProperty("borders")})
    @lombok.Setter(onMethod_ = {@JsonProperty("borders")})
    private List<String> borders;
    @lombok.Getter(onMethod_ = {@JsonProperty("nativeName")})
    @lombok.Setter(onMethod_ = {@JsonProperty("nativeName")})
    private String nativeName;
    @lombok.Getter(onMethod_ = {@JsonProperty("numericCode")})
    @lombok.Setter(onMethod_ = {@JsonProperty("numericCode")})
    private String numericCode;
    @lombok.Getter(onMethod_ = {@JsonProperty("currencies")})
    @lombok.Setter(onMethod_ = {@JsonProperty("currencies")})
    private List<Currency> currencies;
    @lombok.Getter(onMethod_ = {@JsonProperty("languages")})
    @lombok.Setter(onMethod_ = {@JsonProperty("languages")})
    private List<Language> languages;
    @lombok.Getter(onMethod_ = {@JsonProperty("translations")})
    @lombok.Setter(onMethod_ = {@JsonProperty("translations")})
    private Translations translations;
    @lombok.Getter(onMethod_ = {@JsonProperty("flag")})
    @lombok.Setter(onMethod_ = {@JsonProperty("flag")})
    private String flag;
    @lombok.Getter(onMethod_ = {@JsonProperty("regionalBlocs")})
    @lombok.Setter(onMethod_ = {@JsonProperty("regionalBlocs")})
    private List<RegionalBloc> regionalBlocs;
    @lombok.Getter(onMethod_ = {@JsonProperty("cioc")})
    @lombok.Setter(onMethod_ = {@JsonProperty("cioc")})
    private String cioc;
}

package com.stephane.strategy.pattern.examples.client.rest.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@lombok.Data
public class RegionalBloc {
    @lombok.Getter(onMethod_ = {@JsonProperty("acronym")})
    @lombok.Setter(onMethod_ = {@JsonProperty("acronym")})
    private String acronym;
    @lombok.Getter(onMethod_ = {@JsonProperty("name")})
    @lombok.Setter(onMethod_ = {@JsonProperty("name")})
    private String name;
    @lombok.Getter(onMethod_ = {@JsonProperty("otherAcronyms")})
    @lombok.Setter(onMethod_ = {@JsonProperty("otherAcronyms")})
    private List<Object> otherAcronyms;
    @lombok.Getter(onMethod_ = {@JsonProperty("otherNames")})
    @lombok.Setter(onMethod_ = {@JsonProperty("otherNames")})
    private List<Object> otherNames;
}

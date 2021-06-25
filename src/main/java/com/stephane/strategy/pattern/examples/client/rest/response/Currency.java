package com.stephane.strategy.pattern.examples.client.rest.response;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Currency {
    @lombok.Getter(onMethod_ = {@JsonProperty("code")})
    @lombok.Setter(onMethod_ = {@JsonProperty("code")})
    private String code;
    @lombok.Getter(onMethod_ = {@JsonProperty("name")})
    @lombok.Setter(onMethod_ = {@JsonProperty("name")})
    private String name;
    @lombok.Getter(onMethod_ = {@JsonProperty("symbol")})
    @lombok.Setter(onMethod_ = {@JsonProperty("symbol")})
    private String symbol;
}

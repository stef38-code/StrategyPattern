package com.stephane.strategy.pattern.examples.client.rest.response;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Translations {
    @lombok.Getter(onMethod_ = {@JsonProperty("de")})
    @lombok.Setter(onMethod_ = {@JsonProperty("de")})
    private String de;
    @lombok.Getter(onMethod_ = {@JsonProperty("es")})
    @lombok.Setter(onMethod_ = {@JsonProperty("es")})
    private String es;
    @lombok.Getter(onMethod_ = {@JsonProperty("fr")})
    @lombok.Setter(onMethod_ = {@JsonProperty("fr")})
    private String fr;
    @lombok.Getter(onMethod_ = {@JsonProperty("ja")})
    @lombok.Setter(onMethod_ = {@JsonProperty("ja")})
    private String ja;
    @lombok.Getter(onMethod_ = {@JsonProperty("it")})
    @lombok.Setter(onMethod_ = {@JsonProperty("it")})
    private String it;
    @lombok.Getter(onMethod_ = {@JsonProperty("br")})
    @lombok.Setter(onMethod_ = {@JsonProperty("br")})
    private String br;
    @lombok.Getter(onMethod_ = {@JsonProperty("pt")})
    @lombok.Setter(onMethod_ = {@JsonProperty("pt")})
    private String pt;
    @lombok.Getter(onMethod_ = {@JsonProperty("nl")})
    @lombok.Setter(onMethod_ = {@JsonProperty("nl")})
    private String nl;
    @lombok.Getter(onMethod_ = {@JsonProperty("hr")})
    @lombok.Setter(onMethod_ = {@JsonProperty("hr")})
    private String hr;
    @lombok.Getter(onMethod_ = {@JsonProperty("fa")})
    @lombok.Setter(onMethod_ = {@JsonProperty("fa")})
    private String fa;
}

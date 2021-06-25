package com.stephane.strategy.pattern.examples.client.rest.response;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Language {
    @lombok.Getter(onMethod_ = {@JsonProperty("iso639_1")})
    @lombok.Setter(onMethod_ = {@JsonProperty("iso639_1")})
    private String iso6391;
    @lombok.Getter(onMethod_ = {@JsonProperty("iso639_2")})
    @lombok.Setter(onMethod_ = {@JsonProperty("iso639_2")})
    private String iso6392;
    @lombok.Getter(onMethod_ = {@JsonProperty("name")})
    @lombok.Setter(onMethod_ = {@JsonProperty("name")})
    private String name;
    @lombok.Getter(onMethod_ = {@JsonProperty("nativeName")})
    @lombok.Setter(onMethod_ = {@JsonProperty("nativeName")})
    private String nativeName;
}

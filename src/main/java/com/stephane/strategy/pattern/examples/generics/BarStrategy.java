package com.stephane.strategy.pattern.examples.generics;

public class BarStrategy extends Strategy<BarData> {

    public String exec(BarData data) {
        return "Hi " + data.getValue();
    }
}

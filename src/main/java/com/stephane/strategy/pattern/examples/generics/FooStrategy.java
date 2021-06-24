package com.stephane.strategy.pattern.examples.generics;

public class FooStrategy extends Strategy<FooData> {

    public String exec(FooData data) {
        return "Hi " + data.getValue();
    }
}

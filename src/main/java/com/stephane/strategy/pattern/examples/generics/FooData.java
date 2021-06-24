package com.stephane.strategy.pattern.examples.generics;

public class FooData extends Data<FooData> {
    public final double value;

    public FooData(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}

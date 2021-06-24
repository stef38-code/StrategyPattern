package com.stephane.strategy.pattern.examples.generics;

public class BarData extends Data<BarData> {
    public final double value;

    public BarData(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}

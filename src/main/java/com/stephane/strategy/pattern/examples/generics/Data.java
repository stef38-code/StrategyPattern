package com.stephane.strategy.pattern.examples.generics;

/*************************************************************
 *
 * (c) Ag2r - La Mondiale, 2021. Tous droits reserves.
 *
 * ----------------------------------------------------------
 * Project: strategypattern
 * Package: com.stephane.strategy.pattern.examples.generics
 * ----------------------------------------------------------
 * Date: 24 juin 2021,
 * Time: 14:10
 * ----------------------------------------------------------
 * Author: betton
 * ----------------------------------------------------------
 * Description:
 *************************************************************/
public abstract class Data<D extends Data<D>> {
    public static final Strategy<FooData> FOO_STRATEGY = new FooStrategy();
    public static final Strategy<BarData> BAR_STRATEGY = new BarStrategy();
}

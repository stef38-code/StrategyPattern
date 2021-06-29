package com.stephane.strategy.pattern.examples.generics;

/*************************************************************
 *
 *
 *
 * ----------------------------------------------------------
 * Project: strategypattern
 * Package: com.stephane.strategy.pattern.examples.generics
 * ----------------------------------------------------------
 * Date: 24 juin 2021,
 * Time: 14:08
 * ----------------------------------------------------------
 * Author: betton
 * ----------------------------------------------------------
 * Description:
 * https://magnus-k-karlsson.blogspot.com/2010/02/java-generics-example-strategy-pattern.html?m=1
 *************************************************************/
public abstract class Strategy<D extends Data<?>> {

    public abstract String exec(D data);
}


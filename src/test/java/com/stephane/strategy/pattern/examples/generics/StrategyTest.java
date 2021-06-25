package com.stephane.strategy.pattern.examples.generics;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/*************************************************************
 *
 * (c) Ag2r - La Mondiale, 2021. Tous droits reserves.
 *
 * ----------------------------------------------------------
 * Project: strategypattern
 * Package: com.stephane.strategy.pattern.examples.generics
 * ----------------------------------------------------------
 * Date: 24 juin 2021,
 * Time: 14:14
 * ----------------------------------------------------------
 * Author: betton
 * ----------------------------------------------------------
 * Description:
 *************************************************************/
class StrategyTest {


    @Test
    void testFooStrategy() throws Exception {
        assertThat(Data.FOO_STRATEGY.exec(new FooData(3))).isEqualTo("Hi 3.0");
    }

    @Test
    void testBarStrategy() throws Exception {
        assertThat(Data.BAR_STRATEGY.exec(new BarData(5))).isEqualTo("Hi 5.0");
    }
}


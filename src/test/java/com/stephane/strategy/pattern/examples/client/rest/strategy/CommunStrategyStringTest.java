package com.stephane.strategy.pattern.examples.client.rest.strategy;

import com.stephane.strategy.pattern.examples.client.rest.ClientRestStrategies;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/*************************************************************
 *
 *
 *
 * ----------------------------------------------------------
 * Project: strategypattern
 * Package: com.stephane.strategy.pattern.examples.client.rest
 * ----------------------------------------------------------
 * Date: 25 juin 2021,
 * Time: 13:53
 * ----------------------------------------------------------
 * Author: betton
 * ----------------------------------------------------------
 * Description:
 *************************************************************/
@Slf4j
class CommunStrategyStringTest {
    @Test
    void getString_Restcountries_Eu_Nom() {
        String value = ClientRestStrategies.RESTCOUNTRIES_EU_PAR_NOM_STRATEGY.getClientStringBody();
        assertThat(value).isNotNull();
        log.info(value);
    }

    @Test
    void getString_Restcountries_Eu_Langue() {
        String value = ClientRestStrategies.RESTCOUNTRIES_EU_PAR_LANGUE_STRATEGY.getClientStringBody();
        assertThat(value).isNotNull();
        log.info(value);
    }

    @Test
    void getString_Jsonplaceholder_Post() {
        String value = ClientRestStrategies.REST_JSON_PLACE_HOLDER_POST_STRATEGY.getClientStringBody();
        assertThat(value).isNotNull();

        log.info(value);
    }

    @Test
    void getString_Dummy_Example_Employee() {
        String value = ClientRestStrategies.REST_DUMMY_EXAMPLE_EMPLOYEE_STRATEGY.getClientStringBody();
        assertThat(value).isNotNull();

        log.info(value);
    }
}


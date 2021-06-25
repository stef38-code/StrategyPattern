package com.stephane.strategy.pattern.examples.client.rest.strategy;

import com.stephane.strategy.pattern.examples.client.rest.DataClientRest;
import com.stephane.strategy.pattern.examples.client.rest.data.RestcountriesEuParLangueData;
import com.stephane.strategy.pattern.examples.client.rest.data.RestcountriesEuParNomData;
import com.stephane.strategy.pattern.examples.client.rest.response.Name;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import java.util.List;

/*************************************************************
 *
 * (c) Ag2r - La Mondiale, 2021. Tous droits reserves.
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
class CommunStrategyTest {
    @Test
    void getFranceRestTemplate_getForObject_NOM() {
        String value = DataClientRest.RESTCOUNTRIES_EU_NOM.getForObject(new RestcountriesEuParNomData());
        Assertions.assertThat(value).isNotNull();
    }

    @Test
    void getFranceRestTemplate_getForObject_LANGUE() {
        String value = DataClientRest.RESTCOUNTRIES_EU_LANGUE.getForObject(new RestcountriesEuParLangueData());
        Assertions.assertThat(value).isNotNull();
    }

    @Test
    void getFranceRestTemplate_getExchange_NOM() {
        ResponseEntity<List<Name>> value = DataClientRest.RESTCOUNTRIES_EU_NOM.getExchange(new RestcountriesEuParNomData());
        Assertions.assertThat(value).isNotNull();
        Assertions.assertThat(value.getBody()).isNotNull();
        log.info(String.valueOf(value.getBody()));
    }

    @Test
    void getFranceRestTemplate_getExchange_LANGUE() {
        ResponseEntity<List<Name>> value = DataClientRest.RESTCOUNTRIES_EU_LANGUE.getExchange(new RestcountriesEuParLangueData());
        Assertions.assertThat(value).isNotNull();
        Assertions.assertThat(value.getBody()).isNotNull();
        log.info(String.valueOf(value.getBody()));
    }
}


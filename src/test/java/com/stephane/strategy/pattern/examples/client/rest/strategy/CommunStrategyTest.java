package com.stephane.strategy.pattern.examples.client.rest.strategy;

import com.stephane.strategy.pattern.examples.client.rest.DataClientRest;
import com.stephane.strategy.pattern.examples.client.rest.data.RestcountriesEuParLangueData;
import com.stephane.strategy.pattern.examples.client.rest.data.RestcountriesEuParNomData;
import com.stephane.strategy.pattern.examples.client.rest.response.Response;
import com.stephane.strategy.pattern.examples.client.rest.response.ResponseItem;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

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
        assertThat(value).isNotNull();
    }

    @Test
    void getFranceRestTemplate_getForObject_LANGUE() {
        String value = DataClientRest.RESTCOUNTRIES_EU_LANGUE.getForObject(new RestcountriesEuParLangueData());
        assertThat(value).isNotNull();
    }

    @Test
    void getFranceRestTemplate_getExchange_NOM() {
        ResponseEntity<ResponseItem[]> value = DataClientRest.RESTCOUNTRIES_EU_NOM.getExchange(ResponseItem[].class);
        assertThat(value).isNotNull();
        assertThat(value.getBody()).isNotNull().isNotEmpty();
        ResponseItem[] response = value.getBody();
        //List<ResponseItem> response = body[0].getResponse();
        assertThat(response).isNotEmpty().hasSize(1);
        ResponseItem ReponseFrance = response[0];
        assertThat(ReponseFrance.getArea()).isEqualTo(640679);
        assertThat(ReponseFrance.getNativeName()).isEqualTo("France");
        assertThat(ReponseFrance.getCapital()).isEqualTo("Paris");
        assertThat(ReponseFrance.getDemonym()).isEqualTo("French");
        assertThat(ReponseFrance.getFlag()).isEqualTo("https://restcountries.eu/data/fra.svg");
        assertThat(ReponseFrance.getAlpha2Code()).isEqualTo("FR");
        assertThat(ReponseFrance.getLanguages()).isNotEmpty().hasSize(1);
        assertThat(ReponseFrance.getBorders()).isNotEmpty().hasSize(8);
        assertThat(ReponseFrance.getSubregion()).isEqualTo("Western Europe");
        assertThat(ReponseFrance.getCallingCodes()).isNotEmpty().hasSize(1);
        assertThat(ReponseFrance.getRegionalBlocs()).isNotEmpty().hasSize(1);
        assertThat(ReponseFrance.getGini()).isEqualTo(32);
        assertThat(ReponseFrance.getPopulation()).isEqualTo(66710000);
        assertThat(ReponseFrance.getNumericCode()).isEqualTo("250");
        assertThat(ReponseFrance.getAlpha3Code()).isEqualTo("FRA");
        assertThat(ReponseFrance.getTopLevelDomain()).isNotEmpty().hasSize(1);
        assertThat(ReponseFrance.getTimezones()).isNotEmpty().hasSize(12);
        assertThat(ReponseFrance.getCioc()).isEqualTo("FRA");
        assertThat(ReponseFrance.getTranslations()).isNotNull();
        assertThat(ReponseFrance.getName()).isEqualTo("France");
        assertThat(ReponseFrance.getAltSpellings()).isNotEmpty().hasSize(3);
        assertThat(ReponseFrance.getRegion()).isEqualTo("Europe");
        assertThat(ReponseFrance.getLatlng()).isNotEmpty().hasSize(2);
        assertThat(ReponseFrance.getCurrencies()).isNotNull();


        log.info(String.valueOf(response));

    }

    @Test
    void getFranceRestTemplate_getExchange_LANGUE() {
        ResponseEntity<Response[]> value = DataClientRest.RESTCOUNTRIES_EU_LANGUE.getExchange(Response[].class);
        assertThat(value).isNotNull();
        assertThat(value.getBody()).isNotNull();
        Response[] response = value.getBody();
        List<ResponseItem> response1 = response[0].getResponse();

    /*    List< ResponseItem > responseItems = response.getResponse();


        assertThat(name.getName()).isEqualTo("France");*/
        /*assertThat(name.getTopLevelDomain()).isNotEmpty();
        assertThat(name.getAlpha2Code()).isEqualTo();
        assertThat(name.getAlpha3Code()).isEqualTo();
        assertThat(name.getCallingCodes()).isEqualTo();
        assertThat(name.getCapital()).isEqualTo();
        assertThat(name.getAltSpellings()).isEqualTo();
        assertThat(name.getRegion()).isEqualTo();
        assertThat(name.getSubregion()).isEqualTo();
        assertThat(name.getPopulation()).isEqualTo();
        assertThat(name.getLatlng()).isEqualTo();
        assertThat(name.getDemonym()).isEqualTo();
        assertThat(name.getArea()).isEqualTo();
        assertThat(name.getGini()).isEqualTo();
        assertThat(name.getTimezones()).isEqualTo();
        assertThat(name.getBorders()).isEqualTo();
        assertThat(name.getNativeName()).isEqualTo();
        assertThat(name.getNumericCode()).isEqualTo();
        assertThat(name.getCurrencies()).isEqualTo();
        assertThat(name.getLanguages()).isEqualTo();
        assertThat(name.getTranslations()).isEqualTo();
        assertThat(name.getFlag()).isEqualTo();
        assertThat(name.getRegionalBlocs()).isEqualTo();
        assertThat(name.getCioc()).isEqualTo();*/
    }
}


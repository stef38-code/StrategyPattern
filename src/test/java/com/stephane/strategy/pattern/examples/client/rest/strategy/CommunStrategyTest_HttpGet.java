package com.stephane.strategy.pattern.examples.client.rest.strategy;

import com.stephane.strategy.pattern.examples.client.rest.ClientRestStrategies;
import com.stephane.strategy.pattern.examples.client.rest.response.countries.Country;
import com.stephane.strategy.pattern.examples.client.rest.response.employee.Data;
import com.stephane.strategy.pattern.examples.client.rest.response.employee.Employee;
import com.stephane.strategy.pattern.examples.client.rest.response.post.Post;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

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
class CommunStrategyTest_HttpGet {

    @Test
    void getActionHttpGet_NomFrance() {
        Country[] response = ClientRestStrategies.RESTCOUNTRIES_EU_PAR_NOM_STRATEGY.recuperer(Country[].class);
        assertThat(response).isNotNull();
        assertThat(response).isNotNull().isNotEmpty();
        //List<ResponseItem> response = body[0].getResponse();
        assertThat(response).isNotEmpty().hasSize(1);
        Country ReponseFrance = response[0];
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
    void getActionHttpGet_LangueFr() {
        Country[] response = ClientRestStrategies.RESTCOUNTRIES_EU_PAR_LANGUE_STRATEGY.recuperer(Country[].class);
        assertThat(response).isNotNull();
        log.info(String.valueOf(response));

    }

    @Test
    void getActionHttpGet_Post() {
        Post[] response = ClientRestStrategies.REST_JSON_PLACE_HOLDER_POST_STRATEGY.recuperer(Post[].class);
        assertThat(response).isNotNull().isNotEmpty();
        log.info(String.valueOf(response));
        Stream.of(response).forEach(post -> {
                    assertAll("test post:" + post.toString(),
                            () -> assertThat(post.getId()).isNotZero().isGreaterThan(0),
                            () -> assertThat(post.getTitle()).isNotBlank(),
                            () -> assertThat(post.getBody()).isNotBlank(),
                            () -> assertThat(post.getUserId()).isNotZero().isGreaterThan(0));
                }

        );
    }

    @Test
    void getActionHttpGet_Employee() {
        Employee response = ClientRestStrategies.REST_DUMMY_EXAMPLE_EMPLOYEE_STRATEGY.recuperer(Employee.class);
        assertThat(response).isNotNull();
        log.info(String.valueOf(response));
        assertThat(response.getStatus()).isNotBlank().isEqualTo("success");
        List< Data > responseData = response.getData();

        responseData.forEach(data -> {
                    assertAll("test post:" + data.toString(),
                            () -> assertThat(data.getId()).isNotZero().isGreaterThanOrEqualTo(0),
                            () -> assertThat(data.getEmployeeSalary()).isGreaterThanOrEqualTo(0),
                            () -> assertThat(data.getProfileImage()).isNull(),
                            () -> assertThat(data.getEmployeeAge()).isGreaterThanOrEqualTo(0));
                }

        );
    }
}


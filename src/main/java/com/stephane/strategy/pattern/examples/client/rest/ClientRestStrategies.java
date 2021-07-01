package com.stephane.strategy.pattern.examples.client.rest;


import com.stephane.strategy.pattern.examples.client.rest.definition.RestDummyExampleEmployeeStrategies;
import com.stephane.strategy.pattern.examples.client.rest.definition.RestJsonPlaceHolderPostStrategies;
import com.stephane.strategy.pattern.examples.client.rest.definition.RestcountriesEuParLangueStrategies;
import com.stephane.strategy.pattern.examples.client.rest.definition.RestcountriesEuParNomStrategies;
import com.stephane.strategy.pattern.examples.client.rest.strategy.commun.CommunStrategy;
import com.stephane.strategy.pattern.examples.client.rest.strategy.countries.RestcountriesEuParLangueStrategy;
import com.stephane.strategy.pattern.examples.client.rest.strategy.countries.RestcountriesEuParNomStrategy;
import com.stephane.strategy.pattern.examples.client.rest.strategy.employee.RestDummyExampleEmployeeStrategy;
import com.stephane.strategy.pattern.examples.client.rest.strategy.post.RestJsonPlaceHolderPostStrategy;

/*************************************************************
 *
 *
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
public abstract class ClientRestStrategies< D extends ClientRestStrategies< D > > {
    public static final CommunStrategy< RestcountriesEuParNomStrategies > RESTCOUNTRIES_EU_PAR_NOM_STRATEGY = new RestcountriesEuParNomStrategy();
    public static final CommunStrategy< RestcountriesEuParLangueStrategies > RESTCOUNTRIES_EU_PAR_LANGUE_STRATEGY = new RestcountriesEuParLangueStrategy();
    public static final CommunStrategy< RestJsonPlaceHolderPostStrategies > REST_JSON_PLACE_HOLDER_POST_STRATEGY = new RestJsonPlaceHolderPostStrategy();
    public static final CommunStrategy< RestDummyExampleEmployeeStrategies > REST_DUMMY_EXAMPLE_EMPLOYEE_STRATEGY = new RestDummyExampleEmployeeStrategy();


}

package com.stephane.strategy.pattern.examples.client.rest;


import com.stephane.strategy.pattern.examples.client.rest.data.RestcountriesEuParLangueData;
import com.stephane.strategy.pattern.examples.client.rest.data.RestcountriesEuParNomData;
import com.stephane.strategy.pattern.examples.client.rest.strategy.CommunStrategy;
import com.stephane.strategy.pattern.examples.client.rest.strategy.RestcountriesEuParLangueStrategy;
import com.stephane.strategy.pattern.examples.client.rest.strategy.RestcountriesEuParNomStrategy;

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
public abstract class DataClientRest<D extends DataClientRest<D>> {
    public static final CommunStrategy<RestcountriesEuParNomData> RESTCOUNTRIES_EU_NOM = new RestcountriesEuParNomStrategy();
    public static final CommunStrategy<RestcountriesEuParLangueData> RESTCOUNTRIES_EU_LANGUE = new RestcountriesEuParLangueStrategy();
}

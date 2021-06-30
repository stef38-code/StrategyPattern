package com.stephane.strategy.pattern.examples.client.rest.strategy.countries;


import com.stephane.strategy.pattern.examples.client.rest.data.RestcountriesEuParNomStrategies;
import com.stephane.strategy.pattern.examples.client.rest.strategy.CommunStrategy;

import java.util.Map;

/*************************************************************
 *
 *
 *
 * ----------------------------------------------------------
 * Project: strategypattern
 * Package: com.stephane.strategy.pattern.examples.client.rest
 * ----------------------------------------------------------
 * Date: 25 juin 2021,
 * Time: 13:38
 * ----------------------------------------------------------
 * Author: betton
 * ----------------------------------------------------------
 * Description:
 *************************************************************/
public class RestcountriesEuParNomStrategy extends CommunStrategy< RestcountriesEuParNomStrategies > {

    private String url = "https://restcountries.eu/rest/v2/name/france";


    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public Map<String, String> getHeaders() {
        return getDefaultHeaders();
    }

}

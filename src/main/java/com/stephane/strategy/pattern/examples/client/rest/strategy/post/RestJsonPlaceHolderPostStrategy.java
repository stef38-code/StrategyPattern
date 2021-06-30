package com.stephane.strategy.pattern.examples.client.rest.strategy.post;


import com.stephane.strategy.pattern.examples.client.rest.data.RestJsonPlaceHolderPostStrategies;
import com.stephane.strategy.pattern.examples.client.rest.strategy.CommunStrategy;
import org.springframework.beans.factory.annotation.Value;

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
public class RestJsonPlaceHolderPostStrategy extends CommunStrategy< RestJsonPlaceHolderPostStrategies > {
    private String url = "https://jsonplaceholder.typicode.com/posts";

    @Value("${restcountries.rest.v2.lang.fr}")
    private String url2;

    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public Map< String, String > getHeaders() {
        return getDefaultHeaders();
    }

}

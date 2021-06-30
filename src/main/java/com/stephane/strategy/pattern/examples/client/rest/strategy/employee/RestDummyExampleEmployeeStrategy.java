package com.stephane.strategy.pattern.examples.client.rest.strategy.employee;


import com.stephane.strategy.pattern.examples.client.rest.data.RestDummyExampleEmployeeStrategies;
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
public class RestDummyExampleEmployeeStrategy extends CommunStrategy< RestDummyExampleEmployeeStrategies > {

    private String url = "http://dummy.restapiexample.com/api/v1/employees";


    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public Map< String, String > getHeaders() {
        return getDefaultHeaders();
    }

}

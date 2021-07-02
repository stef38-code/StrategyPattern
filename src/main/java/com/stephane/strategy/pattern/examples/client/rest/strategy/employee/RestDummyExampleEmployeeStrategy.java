package com.stephane.strategy.pattern.examples.client.rest.strategy.employee;


import com.stephane.strategy.pattern.examples.client.rest.definition.RestDummyExampleEmployeeStrategies;
import com.stephane.strategy.pattern.examples.client.rest.strategy.commun.CommunStrategy;

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
    public Map<String, String> getHeaders() {
        return getDefaultHeaders();
    }

    @Override
    public <T> T recuperer(Class<T> clazzReponse) {
        return null;
    }

    @Override
    public <T> T supprimer(Class<T> clazzReponse) {
        return null;
    }

    @Override
    public <T, Q> T envoyer(Class<T> clazzReponse, Q donnees) {
        return null;
    }

    @Override
    public <T, Q> T remplacer(Class<T> clazzReponse, Q donnees) {
        return null;
    }

}

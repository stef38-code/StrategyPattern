package com.stephane.strategy.pattern.examples.client.rest.strategy;

import com.stephane.strategy.pattern.examples.client.rest.DataClientRest;
import com.stephane.strategy.pattern.examples.client.rest.commun.DefaultCommunActions;

import java.util.Map;

/*************************************************************
 *
 *
 *
 * ----------------------------------------------------------
 * Project: strategypattern
 * Package: com.stephane.strategy.pattern.examples.generics
 * ----------------------------------------------------------
 * Date: 24 juin 2021,
 * Time: 14:08
 * ----------------------------------------------------------
 * Author: betton
 * ----------------------------------------------------------
 * Description:
 *************************************************************/
public abstract class CommunStrategy<D extends DataClientRest<?>> extends DefaultCommunActions {
    /**
     * Url de connexion
     *
     * @return String
     */
    public abstract String getUrl();

    public abstract Map<String, String> getHeaders();
}


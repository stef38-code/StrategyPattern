package com.stephane.strategy.pattern.examples.client.rest.strategy.commun;

import com.stephane.strategy.pattern.examples.client.rest.ClientRestStrategies;

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
public abstract class CommunStrategy< D extends ClientRestStrategies< ? > > extends DefaultCommunActions {
    /**
     * Url de connexion
     *
     * @return String
     */
    @Override
    public abstract String getUrl();

    @Override
    public abstract Map< String, String > getHeaders();
}


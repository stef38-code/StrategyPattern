package com.stephane.strategy.pattern.examples.client.rest.strategy.commun;

import com.stephane.strategy.pattern.examples.client.rest.ClientRestStrategies;

import java.util.Map;
import java.util.Optional;

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
public abstract class CommunStrategy<D extends ClientRestStrategies<?>, Q> extends DefaultCommunActions {
    /**
     * Url de connexion
     *
     * @return String
     */
    @Override
    public abstract String getUrl();

    @Override
    public abstract Map<String, String> getHeaders();

    public abstract <T> T recuperer(Class<T> clazzReponse);

    public abstract <T> T supprimer(Class<T> clazzReponse, Optional<Q> donnees);

    public abstract <T> T envoyer(Class<T> clazzReponse, Optional<Q> donnees);

    public abstract <T> T remplacer(Class<T> clazzReponse, Optional<Q> donnees);

}


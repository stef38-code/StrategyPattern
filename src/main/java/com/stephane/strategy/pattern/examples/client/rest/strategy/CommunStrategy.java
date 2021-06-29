package com.stephane.strategy.pattern.examples.client.rest.strategy;

import com.stephane.strategy.pattern.examples.client.rest.DataClientRest;
import com.stephane.strategy.pattern.examples.client.rest.commun.DefaultCommunActions;
import org.springframework.http.ResponseEntity;

/*************************************************************
 *
 * (c) Ag2r - La Mondiale, 2021. Tous droits reserves.
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

    public abstract <T> ResponseEntity<T> getExchange(Class<T> clazz);

    public abstract String getUrl();
}


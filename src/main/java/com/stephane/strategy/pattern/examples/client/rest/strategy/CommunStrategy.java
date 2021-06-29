package com.stephane.strategy.pattern.examples.client.rest.strategy;

import com.stephane.strategy.pattern.examples.client.rest.DataClientRest;
import lombok.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;

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
public abstract class CommunStrategy<D extends DataClientRest<?>> {

    @Getter
    private WebClient client = WebClient.create();

    protected String getClientStringBody() {

        return getClient()
                .get()
                .uri(getUrlValue())
                .retrieve()
                .bodyToMono(String.class)
                .block();

    }

    public abstract <T> ResponseEntity<T> getExchange(Class<T> clazz);

    public abstract String getUrlValue();
}


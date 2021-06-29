package com.stephane.strategy.pattern.examples.client.rest.commun;

import lombok.AccessLevel;
import lombok.Getter;
import org.springframework.web.reactive.function.client.WebClient;

/*************************************************************
 *
 * (c) Ag2r - La Mondiale, 2021. Tous droits reserves.
 *
 * ----------------------------------------------------------
 * Project: strategypattern
 * Package: com.stephane.strategy.pattern.examples.client.rest
 * ----------------------------------------------------------
 * Date: 29 juin 2021,
 * Time: 08:54
 * ----------------------------------------------------------
 * Author: betton
 * ----------------------------------------------------------
 * Description:
 *************************************************************/
public class DefaultCommunActions {
    @Getter
    private WebClient client = WebClient.create();
    @Getter(AccessLevel.PROTECTED)
    private String url;

    public String getClientStringBody() {

        return getClient()
                .get()
                .uri(getUrl())
                .retrieve()
                .bodyToMono(String.class)
                .block();

    }
}

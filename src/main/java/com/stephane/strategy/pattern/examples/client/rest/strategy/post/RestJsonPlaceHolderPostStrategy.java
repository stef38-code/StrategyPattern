package com.stephane.strategy.pattern.examples.client.rest.strategy.post;


import com.stephane.strategy.pattern.examples.client.rest.definition.RestJsonPlaceHolderPostStrategies;
import com.stephane.strategy.pattern.examples.client.rest.strategy.commun.CommunStrategy;
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
    public Map<String, String> getHeaders() {
        return getDefaultHeaders();
    }

    @Override
    public <T> T recuperer(Class<T> clazzReponse) {
        return getWebClientGet()
                .uri(getUrl())
                .retrieve()
                .bodyToMono(clazzReponse)
                //
                .block();
    }

    @Override
    public <T> T supprimer(Class<T> clazzReponse) {
        return getWebClientDelete()
                .uri(uriBuilder -> uriBuilder
                        .path(getUrl().concat("/{post}"))
                        .build(1))
                .retrieve()
                .bodyToMono(clazzReponse)
                //
                .block();

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

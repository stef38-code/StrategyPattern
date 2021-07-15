package com.stephane.strategy.pattern.examples.client.rest.strategy.countries;


import com.stephane.strategy.pattern.examples.client.rest.definition.RestcountriesEuParLangueStrategies;
import com.stephane.strategy.pattern.examples.client.rest.response.countries.LanguagesItem;
import com.stephane.strategy.pattern.examples.client.rest.strategy.commun.CommunStrategy;
import org.springframework.beans.factory.annotation.Value;

import java.util.Map;
import java.util.Optional;

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
public class RestcountriesEuParLangueStrategy extends CommunStrategy<RestcountriesEuParLangueStrategies, LanguagesItem> {
    private String url = "https://restcountries.eu/rest/v2/lang/fr";

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
    public <T> T supprimer(Class<T> clazzReponse, Optional<LanguagesItem> donnees) {
        return null;
    }

    @Override
    public <T> T envoyer(Class<T> clazzReponse, Optional<LanguagesItem> donnees) {
        return null;
    }

    @Override
    public <T> T remplacer(Class<T> clazzReponse, Optional<LanguagesItem> donnees) {
        return null;
    }

}

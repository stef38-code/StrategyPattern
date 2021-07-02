package com.stephane.strategy.pattern.examples.client.rest.strategy.commun;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

/*************************************************************
 *
 *
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
@Slf4j
public class DefaultCommunActions {
    //@Getter
    private WebClient client = WebClient.create();

    @Getter(AccessLevel.PROTECTED)
    private String url;

    @Getter(AccessLevel.PROTECTED)
    private Map<String, String> headers;

    /**
     * HTTP.GET method
     * Retourne juste le body sous forme d'une String
     *
     * @return String
     */
    public String getClientStringBody() {

        return client
                .get()
                .uri(getUrl())
                .retrieve()
                .bodyToMono(String.class)
                //gestion en cas d'erreur et retourne une valeur par défaut
                .doOnError(error -> log.error("Une erreur est survenue: {}", error.getMessage()))
                .onErrorResume(error -> Mono.just(StringUtils.EMPTY))
                //
                .block();

    }

    public <T> T actionHttpGet(Class<T> clazzReponse) {
        return actionHttp(HttpMethod.GET, clazzReponse);
    }

    private <T> T actionHttp(HttpMethod httpMethod, Class<T> clazzReponse) {
        return client
                .method(httpMethod)
                .uri(getUrl())
                .headers(httpHeaders ->
                        getHeaders().forEach((key, value) ->
                                httpHeaders.set(key, value)
                        ))
                .retrieve()
                .bodyToMono(clazzReponse)
                //
                .block();
    }

    public Map<String, String> getDefaultHeaders() {
        Map<String, String> defautHeaders = new HashMap<>();
        defautHeaders.put(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        return defautHeaders;
    }
}
